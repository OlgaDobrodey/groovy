package com.itrex.lesson22MetaClass

import com.itrex.lesson23MissingMethodAndProperty.Student
import org.codehaus.groovy.runtime.DefaultGroovyMethods

class Runner {

    static void main(String[] args) {
        def customMettaClass = new CustomMetaClass()
//        println "Hello"
        def method = DefaultGroovyMethods.class.getMethod("println", Object.class, Object.class)
        customMettaClass.methods.put("println", method)
        def printlnMethod = customMettaClass.methods.get("println")

        def student = new Student("Ivan", "Ivanov", 222)

        printlnMethod.invoke(student, student, "test 2")
        // student.println("Test2")

        //MetaClassImp
        println "MetaClassImp: "+student.metaClass
        println "meta class methods"
        student.metaClass.methods.each { println it}

        println "Properties\n"
        student.metaClass.properties.each { println it.properties}
    }
}

