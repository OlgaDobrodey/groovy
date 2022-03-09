package com.itrex.lesson17OOP

class Runner {

    static void main(String[] args) {
        def student = new Student()
        student.firstName = "Ivan" // setFirstName
        println("student.firstName: $student.firstName") //getFirstName
        println "student.\"firstName\": "+ student."firstName"
        println student["firstName"]
        println student.@firstName //bad practice

        def student1 = new Student(firstName: "Ivan", lastName: "Ivanov", age: 18)
        println(student1)

        Student student2 = ["Sveta","Kovoleva", 20]
        println student2

        def (fn, ln) = student2    //programme have to create method getAt(Integer index)
        println fn
        println ln

        [student1,student2].collect{ print it.firstName+" "} //Ivan Sveta
        println ("\n"+[student1,student2]*.firstName) ///[Ivan, Sveta]

    }
}
