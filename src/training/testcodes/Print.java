package training.testcodes;

public class Print {
    static void p(Object obj) {
        System.out.println(obj);
    }

    public static void main(String[] args) {
        p("abc");
        p(123);
        p(3.14159265358979d);
    }
}


