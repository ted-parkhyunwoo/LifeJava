package training.learning.T12_modifiers;

class ModifireClass {
    public int test = 1;
    protected int test2 = 2;
    int test4 = 4;
    public void printHey() { System.out.println("Hey"); }

    // 캡슐화 테스트(test3의 정보은닉 : 데이터 직접 접근 막기- 메서드를 통해서만 입출력 가능하도록)
    private int test3 = 3;
    public void printTest() { System.out.println(test3); }
}

