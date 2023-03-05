package ru.popov.springcourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RockMusic implements Music {
    @Override
    public List<String> getSong() {
        return List.of("Wind cries Mary", "Try", "Shape of my heart");
    }
}
