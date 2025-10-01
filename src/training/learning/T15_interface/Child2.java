package training.learning.T15_interface;

public class Child2 extends Parent {
    private int x = 2;
    public void func() {
        System.out.println("child2.");
    }
    public String str() {
        return "Base: " + Base + ", Child: " + x;
    }
}
