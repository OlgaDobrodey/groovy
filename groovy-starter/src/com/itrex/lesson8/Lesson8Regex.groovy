package com.itrex.lesson8

import java.util.regex.Matcher
import java.util.regex.Pattern

class Lesson8Regex {

    static void main(String[] args) {
        String value = " one 1 two 22 three 333"
//        String regex = "\\w+ \\d+ " - java
        String regex = /(\w+) (\d+)/

//        Pattern pattern = Pattern.compile(regex)
        Pattern pattern = ~regex
//        Matcher matcher = pattern.matcher(value)
        Matcher matcher = value=~regex

//        boolean  result = matcher.matches()
        boolean result = value==~regex
        println result //false

        while(matcher.find()){
            println matcher.group()
            println matcher.group(1)
            println matcher.group(2)
            println "-------"
        }

        println matcher[0]
        println matcher[1][2]
        println matcher[2]
        println matcher[1..2]
//        println matcher[3] //exception

        println "EACH"
        matcher.each {println(it)}

        println "EACH 2"
        matcher.each { println it[2]}

    }

}
