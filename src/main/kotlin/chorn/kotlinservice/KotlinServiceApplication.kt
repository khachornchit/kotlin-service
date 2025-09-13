package chorn.kotlinservice

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
@RestController
class KotlinServiceApplication

fun main(args: Array<String>) {
    runApplication<KotlinServiceApplication>(*args)
}