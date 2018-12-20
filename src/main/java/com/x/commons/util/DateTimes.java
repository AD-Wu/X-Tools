package com.x.commons.util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @Date 2018-12-19 23:32
 * @Author AD
 */
public final class DateTimes {

    private DateTimes() {}

    /**
     * get current date and time
     *
     * @return yyyy-MM-dd HH:mm:ss.SSS
     */
    public static String now() {

        return LocalDateTime.now().toString().replace("T", " ");
    }


}
