package ru.popov.springcourse;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("ru.popov.springcourse")
@PropertySource("musicPlayer.properties")
public class SpringConfig {
}
