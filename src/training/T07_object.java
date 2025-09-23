package training;

public class T07_object {
    static void statusFb(T07_class fb) {
        String res = fb.index + "번은 " + (fb.baked? "먹음":"안먹음");
        System.out.println(res);
    }
    static void main(String[] args) {
        // 구체화 과정: 객체들의 속성부여.
        // 객체 선언시 new 클래스(); 식으로 선언됨...
        T07_class fb1 = new T07_class();
        fb1.index = 0;
        fb1.bake();
        statusFb(fb1);

        // 메모리 구조 살펴보기: stack, heap, class영역
        // fb1의 메모리참조는 stack에 저장 -> heap pointing.
        // T07_class와 main은 클래스영역에 저장됨
        T07_class fb2 = new T07_class();
        // 다음 속성부여 과정을 거쳐 index, baked등은 heap에 저장됨.
        fb2.index = 1;
        statusFb(fb2);
    }
}
