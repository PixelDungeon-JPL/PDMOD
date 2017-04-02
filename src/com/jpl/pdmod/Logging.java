package com.jpl.pdmod;

import android.graphics.Path;
import android.os.Environment;

import java.io.*;

/**
 * Created by Freddy on 02.04.2017.
 */
public class Logging {
    public static final int DEBUG = 0;
    public static final int INFO = 1;
    public static final int ERROR = 2;

    public static int level = 1;

    public static void log(int level, String msg){
        if (level >= Logging.level)
            writeFile(Environment.getExternalStorageDirectory().getPath() + "pd.log", msg, true);
    }

    private static void writeFile(String name, String text, boolean append){
        BufferedWriter br;
        FileWriter fr;

        try {
            fr = new FileWriter(name);
            br = new BufferedWriter(fr);

            if (append)
                br.append(text);
            else
                br.write(text);

            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void resetFile(){
        writeFile(Environment.getExternalStorageDirectory() + "pd.log", "", false);
    }

    public static void info(String msg){
        log(INFO, msg);
    }

    public static void debug(String msg){
        log(DEBUG, msg);
    }

    public static void error(String msg){
        log(ERROR, msg);
    }

    public static void setLevel(int level){
        Logging.level = level;
    }
}
