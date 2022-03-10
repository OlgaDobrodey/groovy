package com.itrex.lesson24Categories

class Runner {

    static void main(String[] args) {
        def student = new Student(age: 18, firstName: "Ivan")
        use(DefaultStudentMethods.class) {
            student.testStr()
            student.anotherMethod("anotherMethod")
        }
        println "without category: "
        student.testStr()
    }
}
