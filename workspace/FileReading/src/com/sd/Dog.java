package com.sd;

public class Dog extends Animal {
    public static String genus = sayIt("Dog: static field declaration: Canis");
    public String name = sayIt("Dog: instance field declaration: Fido");
    public Dog() {
        super("Fido");
        System.out.println("Dog(): no-arg ctor");
    }
    
    static {
        genus = sayIt("Dog: static init block 1: Canis");
    }
    {
        name = sayIt("Dog: instance init block 1: Rex");
    }
    static {
        genus = sayIt("Dog: static init block 2: Canis");
    }
    {
        name = sayIt("Dog: instance init block 1: Cujo");
    }

}