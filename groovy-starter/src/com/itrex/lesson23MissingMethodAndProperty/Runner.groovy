package com.itrex.lesson23MissingMethodAndProperty

class Runner {

    static void main(String[] args) {
        def student = new Student()
//        student.test()
        println student.abc

        def map = ["1": 11, "2": 22]
        println map.abc
        println map."1"
        println map

        /*
        null
        11
        [1:11, 2:22]
         */

        // Imitate Spring Data (corrected methodMissing in Student)
        student.findByAge(90) //select * from Student where Age = 90

    }
}
