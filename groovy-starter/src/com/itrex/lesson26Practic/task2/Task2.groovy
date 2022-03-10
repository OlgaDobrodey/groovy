package com.itrex.lesson26Practic.task2

/*
Добавить возможность складывать различные единицы измерения
Пример:
3.cm + 1.m -25.mm = 1005 (mm)
 */

class Task2 {

    static void main(String[] args) {
        firstOption()
        secondOption()
        thirdOption()
    }

    private static Object firstOption() {
        println "firstOption"
        use(IntegerMethods) {
            println(3.cm + 1.m - 25.mm)
        }
    }

    private static Object secondOption() {
        println "secondOption"
        Integer.metaClass.getCm = {
            delegate * 10
        }
        Integer.metaClass.getMm = {
            delegate
        }
        Integer.metaClass.getM = {
            delegate.cm * 100
        }

        println(3.cm + 1.m - 25.mm)
    }

    private static Object thirdOption() {
        println "thirdOption"
        Integer.metaClass {
            getCm = {
                delegate * 10
            }
            getMm = {
                delegate
            }
            getM = {
                delegate.cm * 100
            }
        }
        println(3.cm + 1.m - 25.mm)
    }
}
