package nl.maas.graal_base

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class GraalBaseApplication

fun main(args: Array<String>) {
	runApplication<GraalBaseApplication>(*args)
}
