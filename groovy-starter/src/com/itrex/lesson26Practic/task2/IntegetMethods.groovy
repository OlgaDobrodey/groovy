package com.itrex.lesson26Practic.task2

@Category(Integer)
class IntegerMethods {

    def getCm() {
        this * 10
    }

    def getMm() {
        this
    }

    def getM() {
        getCm()*100
//        this * 1000
    }
}
