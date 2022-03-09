package com.itrex.lesson17OOP

import groovy.transform.ToString
import groovy.transform.TupleConstructor

@ToString
@TupleConstructor   //create all constructors
class Student {

    String firstName
    String lastName
    Integer age

    def getAt(Integer index){
        index == 0? firstName :lastName
    }

}
