package com.itrex.lesson10

class Lesson10IfElse {

    /**
     * boolean        is true
     * Collection/Map is not empty
     * Matcher        is has match
     * String/GString is not empty
     * Number/Char    !=0
     * reference      != null
     *
     * asBoolean
     */
    static void main(String[] args) {
        int x = 10
        boolean booleanResult = x > 0
        if (booleanResult) {
            println x
        }

        if (x) {
            println x
        }

        Person person = new Person(11)
        if (person) {
            println "method if"
            println person.getId()
        }
        println "person != null, so "
        println person?.id

//       def result = x !=null ? x:1
        def result = x ?: 1
        println result

        String a = /olga/
        if(a){
            println "print a = " + a
        }

    }
}
