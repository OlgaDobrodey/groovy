package com.itrex.lesson26Practic

import com.itrex.lesson24Categories.Student

/*
ДОбавить метод иницилизации "make" для создания объектов
Метод должен проксировать вызов на соотвествующий констрктор
 */

class Task1 {

    static void main(String[] args) {
//        new HashSet<>([1,2,3,4,5])
        Class.metaClass.make = { Object[] values ->
            println "----------------------------------------------------"
            println owner
            println thisObject
            println delegate //import!

            delegate.metaClass.invokeConstructor(values)
        }

        def hashSet = HashSet.make([1, 2, 3, 4, 5])
        def student = Student.make("Ivan", "Ivanod", 29)
        def student2 = Student.make()

        println "----------------------------------------------------"
        println hashSet
        println student
        println student2
    }

}
