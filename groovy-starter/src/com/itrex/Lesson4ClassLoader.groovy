package com.itrex

import java.sql.DriverManager

class Lesson4ClassLoader {

    static void main(String[] args) {
        String value = "Hello World"
        Class<String> clazz = value.getClass()
        assert  clazz == String.class // only true
        println(clazz)
        println(value)
        println clazz.getClassLoader()
        println HelloWorld.getClassLoader()
        println HelloWorldToScript.getClassLoader()
        println DriverManager.getClassLoader() // jdk.internal.loader.ClassLoaders$PlatformClassLoader@3e6104fc
        println Optional.getClassLoader() // null - bootstrap class Loader
    }
}
