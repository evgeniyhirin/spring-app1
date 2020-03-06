package ru.alishev.springcourse;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
//    private Music music;

    private List<Music> musicList = new ArrayList<>();
    private String name;
    private int volume;
    

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    public void init() {
        System.out.println("Doing init");
    }

    public void destroy() {
        System.out.println("Doing destroy");
    }
    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void playMusic() {
        for (Music i:musicList
             ) {
            System.out.println("Playing: " + i.getSong());
        }
    }
}
