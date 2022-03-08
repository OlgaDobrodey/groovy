package com.itrex


import groovy.transform.CompileStatic

//примитивные типы данных и переменные
/*
byte,short, int, long, BigInteger
float, double, BigDecimal
chart
boolean
 */

@CompileStatic // if want static compile
static void main(String[] args) {
    //int value = 5 - wrapper auto Integer
    Integer value = 5 //default Integer
    BigInteger value2 = 36G
    BigDecimal value3 = 3.6G
    new Date()
//    new Sql()

    def value4 = 36G
}

