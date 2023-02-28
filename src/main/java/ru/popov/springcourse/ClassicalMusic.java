package ru.popov.springcourse;

public class ClassicalMusic implements Music {
    private ClassicalMusic() {
        System.out.println("ClassicalMusic - constructor");
    }

    public static ClassicalMusic getClassicalMusic() {
        System.out.println("ClassicalMusic - get");
        return new ClassicalMusic();
    }

    public void doMyInit() {
        System.out.println("Do my initialization");
    }

    public void doMyDestroy() {
        System.out.println("Doing my destruction");
    }

    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }
}
