package com.ninegag.test.objects.lesson;

public class Dog extends Animal {
    public int woofedCount;

    @Override
    public void makeSound() {
        this.woofedCount = this.woofedCount + 1;
        System.out.println("Woof x" + this.woofedCount);
    }
}
