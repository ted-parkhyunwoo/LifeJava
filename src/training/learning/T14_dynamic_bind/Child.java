package training.learning.T14_dynamic_bind;

public class Child extends Parent{
    private int x = 2;

    @Override
    public String str() {
        return "Child" + x;
    }
    
}
