package com.itrex.lesson24Categories

@Category(Student.class)
class DefaultStudentMethods {

    def testStr(){
        println "$age, $firstName, $lastName"
    }

    static def anotherMethod(Student self, String value){   //if method static to first arg always Object self(as example Student self)
        println "$self, args: $value"
    }
}
