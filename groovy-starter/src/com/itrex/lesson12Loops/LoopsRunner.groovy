package com.itrex.lesson12Loops

class LoopsRunner {

    static void main(String[] args) {
        //while/for
        def list = [1, 2, 3, 4]
        for (i in 0..<list.size()) {
            print i + " "
        }
        println "\ninclude 4"
        for (i in 0..list.size()) {
            print i
        }
        println ""
        println "for each"
        for (value in list) {
            print value
        }
        println ""
        println "list each"
        list.each { print it }

        println "\nmethod upto"
        0.upto(list.size()){ print it}
        println "\nmethod upto from 3 "
        3.upto(list.size()){ print it}

        println "\nmethod downto 0 "
        list.size().downto(0){ print it}

        println "\nmethod times"
        list.size().times {print(it)}

        println "\nmethod step"  //the last number don't include
        0.step(10,2){print(it)}
    }
}
