package training.learning.T15_interface;

public class Child extends Parent {
    private int x = 1;
    @Override
    public void func() {
        System.out.println("child1.");
    }
    @Override
    public String str() {
        return "Base: " + Base + ", Child: " + x;
    }

}
