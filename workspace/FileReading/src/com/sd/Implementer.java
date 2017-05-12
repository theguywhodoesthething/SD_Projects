package com.sd;

public class Implementer implements TestInterface, TestInterface2 {
    void method(){
        System.out.println(TestInterface.var);
        System.out.println(var);
        System.out.println(Implementer.var);
        System.out.println(this.var);
    }
}
