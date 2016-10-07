package com.example.controller

import com.example.service.HelloService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloController {

    @Autowired
    HelloService service

    @RequestMapping(value = "hello")
    def hello() {
        service.hello();
    }

}
