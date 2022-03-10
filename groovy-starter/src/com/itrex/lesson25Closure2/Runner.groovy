package com.itrex.lesson25Closure2

class Runner {

    static void main(String[] args) {
        Closure closure = {
            firstName = "Sveta"
        }
        println closure.thisObject //this
        println closure.owner  //where closure
        println closure.delegate //hand owner

        def student = new Student("Ivan","Ivanov", 30)
        println student

//        closure.delegate = student
//        closure()
//        println student

        student.with closure
        println student

        println "!!!!!!!!!!"

        student.getInfo()()

    }
}
