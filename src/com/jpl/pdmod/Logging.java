package com.jpl.pdmod;

import android.graphics.Path;
import android.os.Environment;

import java.io.*;
import java.sql.SQLOutput;

/**
 * Created by Freddy on 02.04.2017.
 */
public class Logging {

    public static void debug(String msg){
        if (Values.DO_DEBUG_LOG)
            System.out.println("======================================> " + msg);
    }

    public static void init(){
        System.setProperty("log.tag.ViewRootImpl", "WARN");
        System.setProperty("log.tag.MediaPlayer[Native]", "WARN");
        System.setProperty("log.tag.MediaPlayer", "WARN");
        System.setProperty("log.tag.art", "WARN");
        System.setProperty("log.tag.Timeline", "WARN");
        System.setProperty("log.tag.MaliEGL", "WARN");
        System.setProperty("log.tag.SoundPool", "WARN");
        System.setProperty("log.tag.libEGL", "WARN");
    }
}
