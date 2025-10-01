package training.learning.T14_dynamic_bind;

// T13에 나온 동적바인딩(런타임에 타입 결정)을 구체화한 코드.

public class Main {
    public static void main(String[] args) {
        Parent p = new Child();
        // 객체 p 는 Parent 타입이지만, 무슨짓을 해도 파생클래스에서 Override 된 함수는 선언타입 것을 사용할 수 없었음
        // 타입캐스팅을 유도해 일부러 기본객체를 따르도록 slicing을 의도해도 안됨.
        // 본질은 타입이 달라도 메모리에는 파생객체 원형이 유지되고, 모든 타입이 참조자료형 화 되기 때문인듯.
        System.out.println(p.str());

        Object[] objs = new Object[5];
        objs[0] = new Child();
        objs[1] = new Parent();
        objs[2] = "abcdefg";
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) arr[i] = i;
        objs[3] = arr;          // 모든 참조자료형은 Object.
        objs[4] = (Character)'C';   // 래퍼클래스 (Boxing)
 
        System.out.println(((Child)objs[0]).str());
        System.out.println(((Parent)objs[1]).str());
        System.out.println(((String)objs[2]).length());
        for (int i : (int[])objs[3]) { System.out.println(i); }     // int[] 로 캐스팅(형변환)
        System.out.println(objs[4]);
    }
}
