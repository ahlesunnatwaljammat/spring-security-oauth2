package edu.learn.pkg2;

import edu.learn.pkg1.TestModifier;

public class AccessModifier extends TestModifier {
    public static void main(String[] args) {
        TestModifier testModifier = new TestModifier();
        testModifier.test();
        /*testModifier.test1();
        testModifier.test2();*/
    }
}
