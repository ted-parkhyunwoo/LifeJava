package training.learning.T15_interface;

// 일반적인 파생클래스 다루기는 기본클래스를 abstract클래스로 선언하고, 여러 파생클래스를 생성한다.
// abstract클래스에서 생성된 abstract 메서드는 파생에서 @Override를 생략하여 구현해도 가능은 하다.(의도 파악용이므로 권장)
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
