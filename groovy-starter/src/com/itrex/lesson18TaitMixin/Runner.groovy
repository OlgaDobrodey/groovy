package com.itrex.lesson18TaitMixin

class Runner {

    static void main(String[] args) {
        def student1 = new com.itrex.lesson18TaitMixin.Student(firstName: "Ivan", lastName: "Ivanov", age: 18, id: 222)
        println student1
        println "student1 properties"
        student1.properties.each {println "           $it"}

        println "\nStudent 2"

        Student student2 = new Student()
        student2.id = -4
        println student2.validateId()  //false

        String.mixin(Runner.class)
        "Olga".printStr()

    }

    static def printStr(String self){
        println "It's mixin $self"
    }
}
