package training.testcodes;
import training.module.Print;

public class HelloWorld {
    public static void main(String[] args) {
        int a = 2;
        for (int i = 0; i < a; ++i) {
            Print.ln("HelloWorld");
        }
    }
}