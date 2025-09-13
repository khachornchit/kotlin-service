package chorn.kotlinservice.controller

import chorn.kotlinservice.model.Message
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/hello")
class HelloController {

    @GetMapping("/")
    fun hello(@RequestParam(defaultValue = "World") name: String): String {
        return "Hello, $name!"
    }

    @GetMapping("/message")
    fun getMessage(): Message {
        return Message(
            sender = "Alice", recipient = "Bob", content = "Hello from Spring Boot + Kotlin!"
        )
    }
}