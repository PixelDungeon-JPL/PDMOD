package com.lumi.pdmod;

import java.util.ResourceBundle;

/**
 * Created by Luis Michaelis on 31.03.2017.
 */
public class RLoader {
    private static ResourceBundle bundle = ResourceBundle.getBundle("assets/pd");

    public static String get(String key){
        return bundle.getString(key);
    }
}
