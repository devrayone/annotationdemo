package ru.devray.tutorial.mavendemo;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD) // к чему прикрепляем
@Retention(RetentionPolicy.RUNTIME) //
public @interface Marker {
    String commandName();
}
