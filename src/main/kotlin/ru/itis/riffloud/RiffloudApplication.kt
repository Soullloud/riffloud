package ru.itis.riffloud

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class RiffloudApplication

fun main(args: Array<String>) {
	runApplication<RiffloudApplication>(*args)
}
