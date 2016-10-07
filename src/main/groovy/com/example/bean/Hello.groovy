package com.example.bean

import groovy.transform.Canonical

@Canonical
class Hello {

    String message
    Long timestamp

    Hello(String message, Long timestamp) {
        this.message = message
        this.timestamp = timestamp
    }

}
