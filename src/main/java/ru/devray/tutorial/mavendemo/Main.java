package ru.devray.tutorial.mavendemo;

import org.openqa.selenium.WebDriver;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
//        Parent p = new Parent();
//        try {
//            Method[] methods =
//                    p.getClass().getDeclaredMethods();
//            // перебираем все методы класса
//            for (Method method : methods){
//                method.setAccessible(true);
//                Annotation[] annotations = method.getDeclaredAnnotations();
//                // перебираем все аннотации конкретного
//                for (Annotation annotation : annotations){
//                    //проверяем, есть ли у метода аннотация Маркер
//                    //если да то запускаем метод
//                    if (annotation instanceof Marker){
//                        method.invoke(p);
//                    }
//                }
//            }
//        } catch (IllegalAccessException | InvocationTargetException e) {
//            e.printStackTrace();
//        }


        String fullCommand = "git add filename.txt"; //разбить на элементы, на массив
        String command = "add"; //разбить на элементы, на массив
// имя метода - строка команды

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
}


// @Test
// git command flag
// git commit -m
// git add
// git status

