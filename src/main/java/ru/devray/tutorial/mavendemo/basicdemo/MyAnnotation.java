package ru.devray.tutorial.mavendemo.basicdemo;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//указываем к какому элементу относится аннотаци - например к полю, классу, методу, конструктору, и т.д.
//в нашем случае - к методу
@Target(ElementType.METHOD)
//указываем на каком этапе сборки и запуска программы в коде будет сохраняться наша аннотация - например на этапе компиляции или в рантайме
//в нашем случае - в рантайме
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation {

}
