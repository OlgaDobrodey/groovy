package com.itrex.lesson22MetaClass

import java.lang.reflect.Field
import java.lang.reflect.Method

class CustomMetaClass {

    Map<String, Method> methods = new HashMap<>()
    Map<String, Field> fields = new HashMap<>()
}
