package me.leedo.cascadedemo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class CascadeDemoApplication

fun main(args: Array<String>) {
    runApplication<CascadeDemoApplication>(*args)
}
