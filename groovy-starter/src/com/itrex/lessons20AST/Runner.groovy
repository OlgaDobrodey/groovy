package com.itrex.lessons20AST

class Runner {

    static void main(String[] args) {
        Student student = Student.builder()
        .lastName("Ivanov")
        .firstName("Ivan")
        .build()

        println student
    }
}
