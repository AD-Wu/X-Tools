package com.x.commons.util;

import com.x.commons.encrypt.MD5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 * @Date 2018-12-19 20:50
 * @Author AD
 */
public final class New {

    private New() {}

    public static <K, V> Map<K, V> map() {

        return new HashMap<K, V>();
    }

    public static <K, V> Map<K, V> map(int size) {

        return new HashMap<K, V>(size);
    }

    public static <K, V> Map<K, V> treeMap() {

        return new TreeMap<>();
    }

    public static <T> Set<T> set() {

        return new HashSet<>();
    }

    public static <T> Set<T> set(int size) {

        return new HashSet<>(size);
    }

    public static <T> Set<T> treeSet() {

        return new TreeSet<>();
    }

    public static <T> List<T> list() {

        return new ArrayList<>();
    }

    public static <T> List<T> list(int size) {

        return new ArrayList<>(size);
    }

    public static <T> LinkedList<T> linkedList() {

        return new LinkedList<>();
    }

    public static <T> Queue<T> queue() {

        return new LinkedList<>();
    }

    public static SB sb() {

        return new SB();
    }

    public static MD5 md() throws Exception {

        return new MD5();
    }

}
