package com.itrex.lesson18TaitMixin

import groovy.transform.ToString
import groovy.transform.TupleConstructor

@ToString
@TupleConstructor   //create all constructors
//@Mixin(WithId.class)   -deprecated
class Student implements WithId{

    String firstName
    String lastName
    Integer age

    def getAt(Integer index){
        index == 0? firstName :lastName
    }

}
