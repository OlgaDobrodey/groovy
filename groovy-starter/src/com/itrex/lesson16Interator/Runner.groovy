package com.itrex.lesson16Interator

import com.itrex.lesson10IfElse.Person

class Runner {

    static void main(String[] args) {
        assert [1, 4, 7, 9].any { it % 2 == 0 } // true
        assert [1, 4, 7, 9].find { it % 2 == 0 } == 4
        assert [1, 4, 7, 9].findAll { it % 2 != 0 } == [1, 7, 9]
        assert (2..4).collect() == [2, 3, 4]

        var person = new Person(25)
        person.each { println(it) }

        var list = ["asd", "wer", "123", "456"].grep(~/\d+/)  //isCase, switch, in, grep
        println list //[123, 456]
        var a = list[0]
        var list2 = ["asd", "wer67", "1233", "456"].grep { it.length() >= 4 }  //isCase, switch, in, grep
        println list2 //[123, 456]
        var list3 = ["asd", "wer67", "1233", "456"].grep{it.length}

    }
}
