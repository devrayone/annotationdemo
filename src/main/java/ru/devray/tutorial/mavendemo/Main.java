package ru.devray.tutorial.mavendemo;

import org.openqa.selenium.WebDriver;
import ru.devray.tutorial.mavendemo.basicdemo.MyAnnotation;
import ru.devray.tutorial.mavendemo.basicdemo.Parent;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {

        performSimpleAnnotationTest();
        performComplexAnnotationTest();

    }

    /**
     * задача - разработать свою собственную систему контроля версий (Git)
     * принимать из консоли на вход строку, в зависимости от введенной команды -
     * - должен вызываться соответствующий метод
     */
    public static void performComplexAnnotationTest() throws InvocationTargetException, IllegalAccessException {

        String fullCommand = "git add filename.txt"; //разбить на элементы, на массив
        String command = "add"; //вытащили отдельную команду (со 2й позиции в исходной строке)
        //далее следуют два варианта реализации логики поиска соответствующего команде метода


        //====================================================================
        // 1-й вариант написания нашего кода - с использованием Reflection API
        Commands commands = new Commands();
        Method[] methods = commands.getClass().getDeclaredMethods();
        //перебираем все методы класса Commands
        for (Method method : methods) {
            method.setAccessible(true);
            Annotation[] annotations = method.getDeclaredAnnotations();
            //перебираем все аннотации текущего метода
            for (Annotation annotation : annotations) {
                //проверяем является ли аннотация нужного типа
                if (annotation instanceof Marker) {
                    //если да - проверяем, соответствует ли поле commandName аннотации введенной команде
                    if (((Marker) annotation).commandName().equals(command)) {
                        method.invoke(commands);
                    }
                }
            }
        }

        //====================================================================
        // 2-й вариант написания нашего кода (плохой) на конструкции switch-case / if-else
        if (command.equals("commit")) {
            System.out.println("files commited");
        } else if (command.equals("add")) {
            System.out.println("files added");
        } else if (command.equals("status")){
            System.out.println("printing status");
        } else if (command.equals("add")) {
            System.out.println("files added");
        } else if (command.equals("status")){
            System.out.println("printing status");
        } else if (command.equals("add")) {
            System.out.println("files added");
        } else if (command.equals("status")){
            System.out.println("printing status");
        } else if (command.equals("add")) {
            System.out.println("files added");
        } else if (command.equals("status")){
            System.out.println("printing status");
        } else if (command.equals("add")) {
            System.out.println("files added");
        } else if (command.equals("status")){
            System.out.println("printing status");
        }else if (command.equals("status")){
            System.out.println("printing status");
        } else if (command.equals("add")) {
            System.out.println("files added");
        } else if (command.equals("status")){
            System.out.println("printing status");
        } else if (command.equals("add")) {
            System.out.println("files added");
        } else if (command.equals("status")){
            System.out.println("printing status");
        }else if (command.equals("status")){
            System.out.println("printing status");
        } else if (command.equals("add")) {
            System.out.println("files added");
        } else if (command.equals("status")){
            System.out.println("printing status");
        } else if (command.equals("add")) {
            System.out.println("files added");
        } else if (command.equals("status")){
            System.out.println("printing status");
        }
    }


    /**
     * Простой пример с условным запуском только тех методов класса, у которых есть аннотация MyAnnotation
     */
    public static void performSimpleAnnotationTest(){
        Parent p = new Parent();
        try {
            Method[] methods =
                    p.getClass().getDeclaredMethods();
            // перебираем все методы класса
            for (Method method : methods){
                method.setAccessible(true);
                Annotation[] annotations = method.getDeclaredAnnotations();
                // перебираем все аннотации конкретного
                for (Annotation annotation : annotations){
                    //проверяем, есть ли у метода аннотация Маркер
                    //если да то запускаем метод
                    if (annotation instanceof MyAnnotation){
                        method.invoke(p);
                    }
                }
            }
        } catch (IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }

}


