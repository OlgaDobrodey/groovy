package com.itrex.lesson15Ranges
//Range - new collection [1..3]
class Runner {

    static void main(String[] args) {
        var range = 2..<8 //range = 2..8  - include 8
        assert range.class == IntRange

        assert range.get(3) == 5
        assert range.contains(7)

        range.each { print it}
        print "\nchar each: "
        ('a'..'d').each {print it}

        print("\n week day: ")
        (WeekDay.MO..WeekDay.FR).each {print(" $it")}
        print("\n week day reverse: ")
        (WeekDay.SU..WeekDay.MO).each {print(" $it")}
        print("\n week day reverse: ")
        var weekDay =(WeekDay.SU..WeekDay.MO).reverse()
        println weekDay

        (WeekDay.SU..WeekDay.MO).eachWithIndex{ WeekDay entry, int i -> println "$i $entry"}



    }

}
