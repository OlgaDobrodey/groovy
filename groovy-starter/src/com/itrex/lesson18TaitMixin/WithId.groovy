package com.itrex.lesson18TaitMixin

trait WithId {

    Integer id

    boolean validateId() {       //analag default method
        id > 0
    }

}