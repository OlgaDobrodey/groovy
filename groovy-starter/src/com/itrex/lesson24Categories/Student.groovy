package com.itrex.lesson24Categories


import groovy.transform.EqualsAndHashCode
import groovy.transform.ToString
import groovy.transform.TupleConstructor
import groovy.transform.builder.Builder

@ToString
@TupleConstructor
//create all constructors
@EqualsAndHashCode
//@Canonical -== @ToString+@EqualsAndHashCode
//@Immutable //- == @Canonical + final String firstName and all
@Builder
//@Slf4j
class Student {

    String firstName
    String lastName
    Integer age

    def getAt(Integer index) {
        index == 0 ? firstName : lastName
    }

    def methodMissing(String name, Object arguments) {    //переопределяется метод
        println "missing method $name is invoked: $arguments"
//        def field = name - "findBy"
//        println "select * from Student where $field = ${arguments[0]}"
    }

    def propertyMissing(String name) {
        println "missing property $name"
        "default value"
    }
}
