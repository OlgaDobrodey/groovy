package com.itrex

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
Integer param = new com.itrex.HelloWorldToScript().value
println(param)
println(getValue())
println anyThing


Integer getValue() {
    value = 2
    return value;
}

Integer getAnyThing() {
    return value;
}

