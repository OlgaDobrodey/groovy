package com.itrex.lesson10IfElse

import groovy.transform.ToString

@ToString
class Person {

    final Integer id

    Person(Integer id) {
        this.id = id
    }

    Integer getId() {
        return id
    }

    boolean asBoolean() {
        id > 10
    }

    boolean isCase(Object switchValue) {
        println "invoke isCase: $switchValue"
        false
    }

}
