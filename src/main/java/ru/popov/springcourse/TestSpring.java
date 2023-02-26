package ru.popov.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );


        MusicPlayer firstMmusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        MusicPlayer secondMmusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

        boolean comparison = firstMmusicPlayer ==  secondMmusicPlayer;

        System.out.println(comparison);

        System.out.println(firstMmusicPlayer);
        System.out.println(secondMmusicPlayer);

        firstMmusicPlayer.setVolume(10);

        System.out.println(firstMmusicPlayer.getVolume());
        System.out.println(secondMmusicPlayer.getVolume());

//        musicPlayer.playMusic();
//        System.out.println(musicPlayer.getName());
//        System.out.println(musicPlayer.getVolume());

        context.close();
    }
}
