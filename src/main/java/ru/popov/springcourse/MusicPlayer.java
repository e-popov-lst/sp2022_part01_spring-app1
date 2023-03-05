package ru.popov.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Random;

@Component
public class MusicPlayer {
    private Music music1;
    private Music music2;

    @Autowired
    public MusicPlayer(@Qualifier("rockMusic") Music music1, @Qualifier("classicalMusic") Music music2) {
        this.music1 = music1;
        this.music2 = music2;
    }

    private String randomMusic(Music music){
        ArrayList<String> musicList = new ArrayList<>(music.getSong());
        Random randNumber = new Random();

        return musicList.get(randNumber.nextInt(musicList.size() - 1));
    }

    public String playMusic(MusicStyle musicStyle) {
        String song;

        switch (musicStyle) {
            case CLASSICAL:
                song = randomMusic(music2);
                break;
            case ROCK:
                song = randomMusic(music1);
                break;
            default:
                song = "";
        }
        return "Playing: " + song;
    }


}
