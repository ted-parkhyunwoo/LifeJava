package training.learning.T15_interface;

/* Interface Class: 기타제한자 abstract, final에 대해 서술한다.
!!!주의!!! : interface Class로 선언된 것은 아님. 기본클래스와 interface class 의 가운데 개념(추상클래스)
cpp의 순수가상함수로 구성된 인터페이스클래스와 virtual 키워드의 혼합형태를 의미하는 abstract.
일반적인 파생클래스 다루기는 기본클래스를 abstract클래스로 선언하고, 여러 파생클래스를 생성한다.
Parent 클래스는 추상클래스로(인터페이스클래스X), 직접 생성할 수 없다(일부 메서드 코드세부 구현안됨)
여기서 Child, Child2 클래스는 구체클래스의 성격을 띠고있다.
*/

public class Main {
    public static void main(String[] args) {
        Parent[] family = {new Child(), new Child2()};

        for (Parent f : family) {
            f.fam();
            f.func();
            System.out.println(f.str());
        }
    }
}
