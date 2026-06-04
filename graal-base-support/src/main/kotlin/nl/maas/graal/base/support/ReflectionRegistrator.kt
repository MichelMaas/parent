package nl.maas.graal.base.support

import org.springframework.aot.hint.MemberCategory
import org.springframework.aot.hint.RuntimeHints
import org.springframework.aot.hint.RuntimeHintsRegistrar
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.ImportRuntimeHints
import kotlin.reflect.KClass

abstract class ReflectionRegistrator(vararg val reflectedClasses:KClass<*>):RuntimeHintsRegistrar {
    override fun registerHints(hints: RuntimeHints, classLoader: ClassLoader?) {

        reflectedClasses.forEach {
            hints.reflection().registerType(
                it.java,
                *MemberCategory.values()
            )
        }
    }
}