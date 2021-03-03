package ru.devray.tutorial.mavendemo;

public class Commands {
    @Marker(commandName = "add")
    public static void add(){
        System.out.println("adding files to index");
    }
    @Marker(commandName = "commit")
    public static void commit(){
        System.out.println("commiting files");
    }
    @Marker(commandName = "status")
    public static void status(){
        System.out.println("getting status");
    }
    @Marker(commandName = "reset")
    public static void reset(){
        System.out.println("resetting repository");
    }

    public static void unsupportedOperation(){
        System.out.println("resetting repository");
    }
}
