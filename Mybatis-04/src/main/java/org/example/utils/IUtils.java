package org.example.utils;

import java.util.UUID;

public class IUtils {
    public static String genId(){
        return UUID.randomUUID().toString().replaceAll("-","");
    }
}