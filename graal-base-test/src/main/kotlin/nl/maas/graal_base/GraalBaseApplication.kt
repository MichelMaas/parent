package nl.maas.graal_base

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class GraalBaseApplication{

	init {
		test()
	}

	fun test(){
		print("Test geslaagd")
	}
}

fun main(args: Array<String>) {
	runApplication<GraalBaseApplication>(*args)
}
