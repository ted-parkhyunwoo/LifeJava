package training.learning.T17_generic_class;


// 기본형의 클래스
class NormalBox {
    private Object obj;
    public void setObj(Object obj) { this.obj = obj; }
    public Object getObj() { return this.obj; }
}

// 제네릭클래스
class GenericBox<T> {
    private T t;
    public void setT(T t) { this.t = t; }
    public T getT() { return this.t; }
}

// 제네릭클래스의 범위제한: Number로 상속받은 파생클래스(기본형 숫자타입)만 T로 정함.
class NumberBox<T extends Number> {
    public void addNums(T... nums) {
        double res = 0d;
        for (T num : nums) {
            res += num.doubleValue();       // 주의. doubleValue(); 로 모든 참조형의 숫자->double기본자료형 형변환 필요.
//            double tmp = num;         // 자동 언박싱 안됨. 명시적 형변환 필요.
//            res += (double)num;       // 안타깝지만 캐스팅 익셉션 오류발생: Integer, Float 참조형에 대한 형변환이 안됨.
        }
        System.out.println("RESULT: " + res);
    }
}


public class GenericClass {
    public static void main(String[] args) {

        // Object클래스를 이용한 형변환의 불편성.
        NormalBox box1 = new NormalBox();

        box1.setObj("Hello Normal");
        Object obj1 = box1.getObj();

        String str1 = (String)obj1;     // 꺼낼 때 형변환 필요. Object -> String.
        System.out.println(str1);

        if (obj1 instanceof String) {   // 보통은 여러타입을 다루므로, instanceof로 검사후 실행해야함.
            System.out.println((String)obj1);
        }

        // 제네릭클래스 활용
        GenericBox<String> box2 = new GenericBox<>();       // 대입은 똑같이 맞추거나, <>형태로 비우거나, 생략 가능.
        box2.setT("Hello Generic");
        System.out.println(box2.getT());

        // 제네릭클래스의 제한: Number클래스 파생클래스(정수,실수형 등)만 받도록.
        NumberBox<Number> box3 = new NumberBox<>();
        box3.addNums(1, 2, 3, 4, 5.5, 6.6);

        NumberBox<Integer> box4 = new NumberBox<>();        // Number 하위 파생클래스들도 가능.
        box4.addNums(1,2,3,4,5);

    }
}
