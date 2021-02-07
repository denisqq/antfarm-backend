package ru.denisqq.antfarm

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class AntFarmApplication

fun main(args: Array<String>) {
    runApplication<AntFarmApplication>(*args)
}
