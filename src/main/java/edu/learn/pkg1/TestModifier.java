package edu.learn.pkg1;

public class TestModifier {
    public void test(){
        System.out.println("Test");
    }

    protected void test1(){
        System.out.println("Test protected ...");
    }

    void test2(){
        System.out.println("Test");
    }
}

class Test extends TestModifier{
    public static void main(String[] args) {
        TestModifier testModifier = new TestModifier();
        testModifier.test();
        testModifier.test1();
        testModifier.test2();
    }
}