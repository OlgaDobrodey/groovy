package com.itrex.lesson14Maps

class Runner {

    static void main(String[] args) {
        def map = ["one":1, "two":2]
        //def map= [:] -empty map

        assert  map.getClass() == LinkedHashMap
        assert map.one == 1 //invokeMissingProperty
        assert map.get("qwe",10) == 10 //

        //write
        map.one = 111
        map.three = 123
        println map //[one:111, two:2, qwe:10, three:123]

        //new method
        assert map.subMap("one","two") ==  ['one':111, 'two':2]

        //new operator
        var newMap = ["q":22, "rt":99, *:map]
        println newMap //[q:22, rt:99, one:111, two:2, qwe:10, three:123]



    }
}
