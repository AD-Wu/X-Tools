package com.x.commons;

/**
 * @Date 2018-12-19 20:43
 * @Author AD
 */
@FunctionalInterface
public interface IFactory<T> {

    T get() throws Exception;

}
