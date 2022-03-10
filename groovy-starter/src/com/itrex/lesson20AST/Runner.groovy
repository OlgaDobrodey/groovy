package com.itrex.lesson20AST

import com.itrex.lesson23MissingMethodAndProperty.Student

class Runner {

    static void main(String[] args) {
        Student student = Student.builder()
        .lastName("Ivanov")
        .firstName("Ivan")
        .build()

        println student
    }
}
