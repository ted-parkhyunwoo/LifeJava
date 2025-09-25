package training.T11_method_override;

public class Main {
    public static void main(String[] args) {

        SpiderMan sman= new SpiderMan("Ted");
        sman.move();
        sman.fireweb();
        System.out.println(sman.name);

        // move()재정의 점검.
        sman.isSpider = true;
        sman.move();

        // java.lang.Object 클래스 오버라이드 점검(Person.java)
        System.out.println(sman.toString());


        // equals()의 재정의(String 클래스에서의.)
        // java에서는 == 와 같은 연산자의 오버로딩이 안됨. equals()를 이용해 값을 비교함 (return this == obj; 이게 원본)
        // == 를 쓰면 참조 비교하기때문에 false출력되지만(다른객체임을 표시),
        // String클래스의 equals()는 재정의;override되어, 참조가 아닌 값비교를 함.
        // 정리하자면 String은 값비교에 '==' 를 쓰지 않고 equals()를 쓴다. 이것이 override의 대표적인 예이다.
        String str1 = new String("Hi");
        String str2 = new String("Hi");
        System.out.println(str1 == str2);
        System.out.println(str1.equals((str2)));

    }
}
