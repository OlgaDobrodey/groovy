package com.itrex
/*
result:
Hello World
2
null
 */


class HelloWorld {
    Integer value //default private

//    @PackageScope - for status private
    static void main(String[] args) {
        println "Hello World"
        Integer param = new HelloWorld().value
        println (param)
        println new HelloWorld().anyThing
    }

    Integer getValue(){
        value = 2
        return value;
    }

    Integer getAnyThing(){
        return value;
    }
}
