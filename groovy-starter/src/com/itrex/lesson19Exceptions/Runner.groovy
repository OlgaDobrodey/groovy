package com.itrex.lesson19Exceptions

import groovy.io.FileType

class Runner {

    static void main(String[] args) {
        File file = new File(".gitignore")
        println file.text

        println file.lastModified()
        println file.properties

        println "for line read"
        file.each {println("$it !")}

        file.withInputStream {
            def allText = new String(it.readAllBytes())
            println allText
        }

        def writer = new StringWriter()
        try(def reader =file.newReader()){
            writer << reader
        }

        var file2  = new File("text.txt")
        file2.text = "Some text1"
        file2 << "Some text2"

        def scrDir = new File("src")
        scrDir.eachDir {println(it)}

        println "each"
        scrDir.eachDirRecurse{println(it)}
        println "!!!each!!!!"
        scrDir.eachFileRecurse(FileType.FILES){println(it)}
    }
}
