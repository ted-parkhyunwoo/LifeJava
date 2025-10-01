package training.learning.T15_abstract_class;

/* abstract Class(추상클래스): 기타제한자 abstract, final에 대해 서술한다.
!!!주의!!! : interface Class는 아님. 일부는 구현됨. 기본클래스와 interface class 의 가운데 개념(추상클래스)
cpp의 순수가상함수가 포함된(virtual로 선언되고 0;으로 대입됨) 추상클래스라는 점에선 공통됨.

일반적인 파생클래스 다루기는 기본클래스를 abstract클래스로 선언하고, 여러 파생클래스를 생성한다.
Parent 클래스는 추상클래스로, 구현이 안된 부분이 있어 인스턴스를 직접 생성할 수 없다. (상속만 가능)
여기서 Child, Child2 클래스는 구체클래스의 성격을 띠고있다. *참고:인터페이스의 파생클래스는 구현클래스.
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
