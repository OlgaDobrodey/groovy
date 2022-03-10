package com.itrex.lesson26Practic.task3

/*
Реализовать механизм тестирования через BDD:
given {
    a = 2
    b = 4
} when {
    result = a + b
} then {
    result == 6
}
 */

class Task3 {

    static void main(String[] args) {
        //given(Closure{}).when(Closure{}).then(Closure{})
        given {
            a = 2 //map.a = 2 - propertyMissing -> map.put("a")
            b = 4
        } when {
            result = 1 + b
        } then {
            result == 6
        }
    }

    static def given(Closure closure) {
        def valueHolder = [:]
        closure.delegate = valueHolder
        closure.resolveStrategy = Closure.DELEGATE_ONLY
        println valueHolder
        closure()
        ["when": { Closure whenClosure ->
            {
                whenClosure.delegate = valueHolder
                whenClosure.resolveStrategy = Closure.DELEGATE_ONLY
                println valueHolder
                whenClosure()
                [then: { Closure thenClosure ->
                    {
                        thenClosure.delegate = valueHolder
                        thenClosure.resolveStrategy = Closure.DELEGATE_ONLY
                        println valueHolder
                        println valueHolder.result == 6
                        assert thenClosure()
                        println valueHolder
                    }

                }]
            }

        }]

    }
}
