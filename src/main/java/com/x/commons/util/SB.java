package com.x.commons.util;

import com.x.commons.IFactory;

/**
 * @Date 2018-12-19 20:44
 * @Author AD
 */
public final class SB {

    StringBuilder sb = new StringBuilder();

    SB() {}

    public SB append(Object o) {

        sb.append(o);
        return this;
    }

    public String get() {

        return toString();
    }

    public String toString() {

        return sb.toString();
    }

}
