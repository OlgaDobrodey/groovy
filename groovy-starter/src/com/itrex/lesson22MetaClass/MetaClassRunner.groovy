package com.itrex.lesson22MetaClass

import com.itrex.lesson20AST.Student

class MetaClassRunner {

    static void main(String[] args) {

        def student = new Student()

        //MetaClassImp
        println "MetaClassImp: " + student.metaClass

        //ExpandoMetaClass
        student.metaClass.abc = "Test property" //create dynamic property
        student.metaClass.testMethod = {      //create dynamic method
            println "THis is a new method"
        }

        student.testMethod()
        println student.abc

        println "ExpandoMetaClass: " + student.metaClass

        student.class.metaClass.newMethod = { int value ->
            println "\nnew method in class Student $value "
        }

        new Student().newMethod(28) //only new object , who create after was created newMethod

        //ProxyMetaClass - interceptors
    }
}
