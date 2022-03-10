package com.itrex.lesson27DSL

import groovy.transform.ToString

@ToString
class MailSpecification {

    String from
    String to
    String title
    BodySpetification body

    def from(String from){
        this.from = from
    }

    def to(String to){
        this.to = to
    }

    def title(String title){
        this.title = title
    }

    def body(@DelegatesTo(BodySpetification) Closure closure){
        this.body = new BodySpetification()
        this.body.with closure
    }


}
