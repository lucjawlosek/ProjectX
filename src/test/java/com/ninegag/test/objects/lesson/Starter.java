package com.ninegag.test.objects.lesson;

import org.junit.jupiter.api.Test;

public class Starter {


    @Test
    void name() {


        Dog d;

//        d.makeSound();

        d = new Dog();
        d.makeSound();
        d = new Dog();
        d = new Dog();
        d = new Dog();



        d.makeSound();
    }
}
