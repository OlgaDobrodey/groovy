package com.itrex.lesson10IfElse

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


    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                '}';
    }
}
