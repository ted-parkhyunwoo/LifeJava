package training.learning.T15_interface;

public abstract class Parent {
    protected final String Base = "Parent";
    public final void fam() { System.out.println("가족입니다."); }
    public abstract void func();
    public abstract String str();
}
