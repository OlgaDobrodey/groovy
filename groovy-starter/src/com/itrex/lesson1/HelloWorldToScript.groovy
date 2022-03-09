package com.itrex.lesson1

/*
result:
Hello World
null
2
2
2
 */

Integer value //default private

println "Hello World"
println value
Integer param = new HelloWorldToScript().value
println(param)
println(getValue())
println anyThing
println(HelloWorldToScript.getClassLoader()) //groovy.lang.GroovyClassLoader$InnerLoader@4218500f


Integer getValue() {
    value = 2
    return value;
}

Integer getAnyThing() {
    return value;
}

