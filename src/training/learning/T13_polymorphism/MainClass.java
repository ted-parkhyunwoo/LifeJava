package training.learning.T13_polymorphism;

// 다형성(Polymorphism): 클래스 기본 구조는 testcodes의 classtest를 가져옴.

public class MainClass {

    public static void main(String[] args) {
        ChildClass haha = new ChildClass();
        haha.setAge(42);
        haha.setName("haha");
        haha.setHeight(172.323f);
        System.out.println(haha);

        // 1. 다형성 기초.
        // ParentClass타입에 ChildClass타입을 초기화(참조됨. 얕은복사. 원치않으면 복사생성자 작성과 사용 필요)
        // cpp와 다르게 slicing(자식기능의 상실)이 일어나지 않음(원형 그대로 메모리를 참조하기 때문) 같은기능을 cpp에서 구현하려면 참조자(*) 처리 필요.
        // java는 파생객체를 기본타입으로 생성했는데도 불구하고 원래 기능을 유지하는 성질이 있음(명시적 형변환 필요.)
        ParentClass haha2 = haha;    // 참조됨. 얕은복사처리, 묵시적(암묵적) 형변환.
        ParentClass haha3 = new ChildClass(33, "haha3", 159.4f);    // 새로 할당됨. 암묵적 형변환.
        Object haha4 = new ChildClass();    // Object도 가능.(java의 최고 조상클래스)
        haha2.setAge(56);
        haha2.setName("haha2");
        System.out.println(haha);
        System.out.println(haha2);
        System.out.println(haha3);
        System.out.println(haha4);

        // 2. 명시적 형변환.
        // sayHello는 자식클래스에만 있는 기능으로, 메모리에는 존재하고 ParentClass는 없는 기능이라 메서드 직접접근은 안됨.
        ((ChildClass)haha3).setHeight(165.f);   // 명시적 형변환 필요.(자식클래스가 확실할때만)
        ((ChildClass)haha3).sayHello();
        // 다만, 모호하게도 cpp의 가상함수처럼 만들어진 Object클래스에선 override된 toString을 그저 참조하고있기때문에 정상 사용가능.
        System.out.println(haha3.toString());

        // 명시적 형변환 주의: 자식 <- 부모로 사용 자제.
        ParentClass Parent = new ParentClass();
        // ChildClass fakeChild = (ChildClass) Parent; // 클래스 캐스트 익셉션 오류!
        // fakeChild.sayHello();
        // 잘못된 명시적 형변환을 막으려면  instanceof 연산자 활용(객체의 실제타입을 비교하는 연산)
        if (Parent instanceof ChildClass) {
            ChildClass fakeChild = (ChildClass) Parent;
            fakeChild.sayHello();
        } else { System.out.println("형변환 실패"); }


        // 다형성은 상위타입이라면 다 됨. Object 타입으로도 가능함.
        ParentClass[] array = new ParentClass[5];
        array[0] = haha;
        array[1] = haha2;
        array[2] = haha3;
        array[3] = new ChildClass();
        // array[4] = haha4;   // 상속관계 반대로는 안들어감.(자식 <- 부모 허용x)
        // 마찬가지로 파생클래스에만 있는 기능을 사용시 명시적 형변환 필요.
        ((ChildClass)array[2]).sayHello();


        // 3. Wrapper Class: 기본형을 객체형으로 변환; Object형으로 사용가능해짐.
        Integer i = (int)3;
        System.out.println(i.getClass().getName()); // 타입 리턴 메서드
        Character c = (char)'C';
        System.out.println(c.getClass().getName());
        String s = "String";

        // 따라서 어떤 자료형이든 Object로 관리는 가능함.
        Object[] ObjArray = new Object[4];
        ObjArray[0] = i;
        ObjArray[1] = c;
        ObjArray[2] = s;
        ObjArray[3] = haha;
    }
}
