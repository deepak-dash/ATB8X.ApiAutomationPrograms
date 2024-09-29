package org.apiautomationdeepak;

public class BuilderPatternJava {

    public BuilderPatternJava step1() {
        System.out.println("step1 is done");
        return this;
    }

    public BuilderPatternJava step2(String param) {
        System.out.println("step2 is done");
        return this;
    }

    public BuilderPatternJava step3() {
        System.out.println("step3 is done");
        return this;
    }

    public static void main(String[] args) {
        BuilderPatternJava bp = new BuilderPatternJava();
        bp.step1().step2("Deepak").step3();
    }
}