package com.x.commons.util;

import java.sql.Time;
import java.time.LocalTime;

/**
 * @Date 2018-12-19 23:31
 * @Author AD
 */
public final class Times {
    private Times(){}

    /**
     * get current time
     * @return HH:mm:ss.SSS
     */
    public static String now(){
        return LocalTime.now().toString();
    }
}
