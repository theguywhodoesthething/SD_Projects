package com.sd;

public class Animal {        
    public Animal() {
        this("Some animal is being constructed");
        System.out.println("Animal(): no-arg ctor");
    }
    protected Animal(String arg) {
        System.out.println("Animal(arg): one-arg ctor");
        this.description = arg;
    }
    
    { // Instance initializer
        description = sayIt("Animal: instance init block 1: some critter");
    }    
    public String description = sayIt("Animal: instance field declaration: Not plants or fungi");    
    static {
           kingdom = sayIt("Animal: static init block 1: Animal Kingdom");
    }   
    static {
        kingdom = sayIt("Animal: static init block 2: Kingdom of Animals");
    }    
    public static String kingdom = sayIt("Animal: static field declaration: Animalia");
    
    { // Instance initializer
        description = sayIt("Animal: instance init block 1: ANIMALS!");
    }

    public static String sayIt(String s) {
        System.out.println(s);
        return s;

    }    
   
}





