package org.apiautomationdeepak;

public class NonDesignPattern {

    public void step1() {
        System.out.println("step1");
    }

    public void step2() {
        System.out.println("step2");
    }

    public void step3(String param1) {
        System.out.println("step3");
    }

    public static void main(String[] args) {
        NonDesignPattern np = new NonDesignPattern();
        np.step1();
        np.step2();
        np.step3("Deepak");
    }
}