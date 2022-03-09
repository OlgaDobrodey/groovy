package com.itrex.lesson11

import com.itrex.lesson10.Person

class SwitchRunner {

    static void main(String[] args) {
        int x = 12
        //byte, short, int, char, String, enum, -java
        switch (x) {
            case new Person(29):    //person.isCase(x)
                println 6
                break
            case String: //isInstance
                println(0)
                break
            case 5:       // equals == ===
                println 1
                break
            case Integer:
                println 2
                break
//            case int:                  don't work code - because all int - always Integer
//                println 3
//                break
            case ~/\d+/:  //pattern.matcher(12.toString).matcher
                println 3
                break
            case { it % 5 == 2 }:   //closure
                println 4
                break
            case [1, 3, 5, 9, 12]:   // list.isCase
                println 5
                break
            default: println "None"
                break

        }

        if(x in [1,3,6,12]){
            println "get x.isCase"
            println x
        }
    }
}
