package com.itrex.lesson13Lists

class ListsRunner {

    static void main(String[] args) {
        def list = [1, 3, 4, 5]
        assert list.getClass() == ArrayList

        //read
        assert list[2] == 4
        assert list.get(2) == 4
        assert list[-1] == 5
        assert list[1..3] == [3, 4, 5]
        assert list[8] == null
        //   assert list.get(8) ==null IndexOutOfBoundsException: Index 8 out of bounds for length 4

        //write
        println list += 9
        println list << 11 << 13 << 7 << 7
        println list += [1, 6, 8]
        println list -= 7 //delete all 7
        println list -= [1, 3]
        println list *= 2

        println "method from queue"
        println list.push(999) //add first element
        println list

        println list.pop()  //remove first element
        println list
        println list.head() //show first element
        println list.tail() //show all without first

        println "flatten, reverse, intersect, disjoint"

        assert [1, 2, [4, 5, 7], 9].flatten() == [1, 2, 4, 5, 7, 9]
        assert [1, 2, 3].reverse() == [3, 2, 1]
        assert [1, 2, 3].intersect([2, 3, 7]) == [2, 3]
        assert [1, 2, 3].disjoint([5, 6, 7]) //true

        //"new operators"
        def (c, b, a) = [3, 4, 5, 6, 7]
        assert c == 3
        assert b == 4
        assert a == 5

        func(*[8, 10])
    }

    static def func(def a, def b) {
        println "method func"
        println a + b
    }
}
