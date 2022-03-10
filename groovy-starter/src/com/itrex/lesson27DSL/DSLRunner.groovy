package com.itrex.lesson27DSL


import static com.itrex.lesson27DSL.DslBuilder.mail

//def email = new Email()
//email.setFrom("from@mail.ru")
//email.setTo("to@mail.ru")
//email.setTitle("title")
//
//def body = new EmailBody()
//body.setText("text")
//body.setImages(List.of(e1:"image.jpg"))
//email.setBody(body)

//builder
println mail {
    from "from@mail.ru"
    to "to@mail.ru"
    title "title"
    body {
        text "text"
        images(["image.jpg", "image2.jpg"])
        image "test.jpg"
    }
}



