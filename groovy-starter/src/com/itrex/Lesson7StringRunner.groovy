package com.itrex

/**
 * " "
 * ' '
 * """ """
 * ''' '''
 * / /
 * $/ /$
 */
def name = "Ivan \"\"  ' ' "
def value = 'Hello "Hi"'

def stringVlue = "Hello $name"
println stringVlue

value2 = """  
SELECT * 
FROM
table where name = $name
"""

println(value2)

value3 = """  
SELECT * 
FROM
table where name = ${getWithParam(name)}
"""

println(value3)
char value4 = 'H'

value5 = /Hello world $name/
println(value5)

println(name[2])
println(name[-2])
println(name[1..3])
println(name*3)
println(name -'an')

def getWithParam(String name){
    "param-$name"  //default return last line
}
