package nl.maas.graal_base

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import java.nio.file.Files
import java.nio.file.Paths
import kotlin.io.path.name
import kotlin.jvm.optionals.getOrNull

@RestController
class HelloController {

    @GetMapping("/hello")
    fun hello(name:String):String{
        val folderPath = Paths.get("./").toRealPath()
        val textFile = Files.find(folderPath,10, {it, _ -> it.name.equals("text.txt") }).findFirst().getOrNull()
        val text = Files.readString(textFile)
        return text
    }
}