package com.itrex.lesson9

import java.util.function.Function
import java.util.stream.Stream

class Lesson9ClosureRunner {

    static void main(String[] args) {
        Function<Integer, Integer> func = value -> value + value
        def result = func.apply(5)
        println result

//        Closure closure = value -> value + value
//        println closure(5)
        println "Closure"

        Closure closure = {
            print "!"
            println it
            it + it
        }

        println "Stream"

        Stream.of(1, 2, 3, 4)
//                .map(func)
                .map(closure)
//                .map(String::valueOf)
                .map(String.&valueOf)
                .forEach(System.out::println)

        Closure closure1 = { -> println "closure without param" }
        closure1()

        Closure closure3 = {value = 78 ->
            print "default equals 78 = "
            println value
            value + value
        }

        println closure3()

        int x = 10
        check(x>0,{println(x++)})
        println x

        check(x>0){ println x++}
    }

    static def check(boolean  condition, Closure closure){
        println "method check"
       if(condition){
           closure()
       }


    }
}
