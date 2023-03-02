package ru.popov.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        Music music = context.getBean("musicBean", Music.class);
        MusicPlayer mmusicPlayer = new MusicPlayer(music);
        mmusicPlayer.playMusic();

        Music music2 = context.getBean("classicalMusic", Music.class);
        MusicPlayer classicalMmusicPlayer = new MusicPlayer(music2);
        classicalMmusicPlayer.playMusic();

        context.close();
    }
}
