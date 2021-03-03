package ru.devray.tutorial.mavendemo.basicdemo;

public class Parent {

    @MyAnnotation
    public void talk(){
        System.out.println("Something");
    }

    public void talkAnother(){
        System.out.println("no marker");
    }

    @MyAnnotation
    public void doStuff(){
        System.out.println("I have marker");
    }

}
