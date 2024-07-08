package com.zafar.springCourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;
import java.util.List;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

//        Music music = context.getBean("musicBean", Music.class);
//        MusicPlayer musicPlayer = new MusicPlayer(music);

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        MusicPlayer musicPlayer1 = context.getBean("musicPlayer", MusicPlayer.class);

        // checkin' prototype scope (scope="prototype" -> false, scope="singleton"(default) -> true)
        System.out.println(musicPlayer == musicPlayer1);




//        List<Music> list = musicPlayer.getMusicList();
//
//        for (Music music: list) {
//            System.out.println(music.getSong());
//        }
//        context.close();
    }
}
