package com.x.commons.util;

import com.sun.istack.internal.NotNull;
import lombok.Data;
import lombok.NonNull;
import lombok.Setter;

import java.util.Arrays;

/**
 * @Author AD
 * @Date 2018/12/19 12:45
 */
public final class Strings {

    // ======================== 变量 ========================

    private static final String HEX = "0123456789ABCDEF";

    private static final String ALL_HEX = "0123456789ABCDEFabcdef";

    private static final byte[] EMPTY_BYTE = new byte[0];


    // ======================== 构造方法 ========================

    private Strings() {}

    // ======================== API ========================

    public static boolean isEmpty(String check) {

        return check == null || check.trim().length() == 0;
    }

    public static String toHex( int v) {

        return fix(Integer.toHexString(v).toUpperCase());
    }

    public static String toHex(@NotNull byte[] bytes) {

        return toHex(bytes, "");
    }

    public static String toHex(@NotNull byte[] bytes, String split) {

        final SB sb = New.sb();
        for (byte b : bytes) {
            sb.append(toHex((b & 0xFF))).append(split);
        }
        return sb.get();
    }

    public static String toASCII(@NotNull String hex) {

        final SB sb = New.sb();
        for (byte b : toBytes(hex)) {
            sb.append((char) b);
        }
        return sb.get();
    }

    public static byte[] toBytes(@NotNull String hex) {

        String s = removeSpaces(hex);
        if (!onlyHex(s)) {
            return EMPTY_BYTE;
        }
        return getBytes(fix(s));
    }


    // ===================== 私有辅助方法 =====================

    private static String fix(String hex) {

        return hex.length() % 2 == 0 ? hex : "0" + hex;
    }

    private static byte[] getBytes(String hex) {

        final char[] cs = hex.toUpperCase().toCharArray();
        byte[] bs = new byte[cs.length / 2];

        for (int i = 0, k = 0, L = bs.length; i < L; ++i, k = i * 2) {
            bs[i] = (byte) (HEX.indexOf(cs[k]) << 4 | HEX.indexOf(cs[k + 1]));
        }
        return bs;
    }

    private static String removeSpaces(String fix) {

        final SB sb = New.sb();
        for (char c : fix.toCharArray()) {
            if (!Character.isSpaceChar(c))
                sb.append(c);
        }
        return sb.get();
    }

    private static boolean onlyHex(String check) {

        for (char c : check.toCharArray()) {
            if (ALL_HEX.indexOf(c) == -1)
                return false;
        }
        return true;
    }

}