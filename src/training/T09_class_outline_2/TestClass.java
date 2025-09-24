package training.T09_class_outline_2;

public class TestClass {
    static String name = "ted";
    int num;

    public  TestClass(int num) { this.num = num; }

    public void print() {
        System.out.println(name + " " + num);
    }

    static void main(String[] args) {
        TestClass.name = "hi";
        TestClass a = new TestClass(1);
        TestClass b = new TestClass(2);

        a.print();
        b.print();
    }
}