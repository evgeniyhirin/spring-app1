package ru.alishev.springcourse;

public class ClassicalMusic implements Music {
    private ClassicalMusic() {}

    public static ClassicalMusic getClassicalMusic () {
        return new ClassicalMusic();
    }

    public void init() {
        System.out.println("Doing init");
    }

    public void destroy() {
        System.out.println("Doing destroy");
    }

    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }
}
