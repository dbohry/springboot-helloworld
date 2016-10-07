package com.example.service

import com.example.bean.Hello
import org.springframework.stereotype.Component

import java.time.Instant

@Component
class HelloService {

    Hello hello() {
        def msg = "hello dude!"
        def time = Instant.now().epochSecond

        new Hello(msg, time)
    }

}
