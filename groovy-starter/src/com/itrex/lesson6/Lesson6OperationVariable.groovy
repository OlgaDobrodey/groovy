package com.itrex.lesson6

import groovy.transform.EqualsAndHashCode

//https://groovy-lang.org/operators.html


class Lesson6OperationVariable {

    static void main(String[] args) {

        listOperation()

        def result = (int) (3 / 2)
        def result2 = (3 / 2) as Integer //def asType(clazz)

        println(result<=29)
        println result == 1 // true Integer.valueOf(1) equls link
        println result * 130 === 130 // false Integer.valueOf(130) max size 127
        println result <=> 130 //-1
        println result <=> 1  // 0    -comparable
        println result <=> -130 // 1


    }

    static listOperation(){
        assert 1 + 2 == 3
        assert 4 - 3 == 1
        assert 3 * 5 == 15
        assert 3 / 2 == 1.5
        assert 3.intdiv(2) == 1 //how java
        assert 10 % 3 == 1
        assert 2**3 == 8


        assert +3 == 3
        assert -4 == 0 - 4

        assert -(-1) == 1


        def a = 2
        def b = a++ * 3

        assert a == 3 && b == 6

        def c = 3
        def d = c-- * 2

        assert c == 2 && d == 6

        def e = 1
        def f = ++e + 3

        assert e == 2 && f == 5

        def g = 4
        def h = --g + 1

        assert g == 3 && h == 4

    }


    @EqualsAndHashCode
    private class Creature {

        static void main(String[] args) {
            def cat = new Creature(type: 'cat')
            def copyCat = cat
            def lion = new Creature(type: 'cat')

            assert cat.equals(lion) // Java logical equality
            assert cat == lion      // Groovy shorthand operator

            assert cat.is(copyCat)  // Groovy identity
            assert cat === copyCat  // operator shorthand
            assert cat !== lion     // negated operator shorthand
        }
    }

}
