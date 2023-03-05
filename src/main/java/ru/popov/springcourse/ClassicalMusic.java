package ru.popov.springcourse;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ClassicalMusic implements Music {
    @Override
    public List<String> getSong() {
        return List.of("Hungarian Rhapsody", "Moonlight Sonata", "Ave Maria");
    }
}
