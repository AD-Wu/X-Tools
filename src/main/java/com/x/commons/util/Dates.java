package com.x.commons.util;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * @Date 2018-12-18 23:49
 * @Author AD
 */
public final class Dates {

    private Dates() {}

    /**
     * get current date
     * @return yyyy-MM-dd
     */
    public static String now(){

        return LocalDate.now().toString();
    }



}
