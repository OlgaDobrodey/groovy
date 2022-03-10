package com.itrex.lessons20AST


import groovy.transform.EqualsAndHashCode
import groovy.transform.ToString
import groovy.transform.TupleConstructor
import groovy.transform.builder.Builder

@ToString
@TupleConstructor   //create all constructors
@EqualsAndHashCode
//@Canonical -== @ToString+@EqualsAndHashCode
//@Immutable //- == @Canonical + final String firstName and all
@Builder
//@Slf4j
class Student {

    String firstName
    String lastName
    Integer age

    def getAt(Integer index){
        index == 0? firstName :lastName
    }

}
