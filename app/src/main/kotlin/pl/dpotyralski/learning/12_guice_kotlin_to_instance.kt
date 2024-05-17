@file:Suppress("ktlint:standard:filename")

package pl.dpotyralski.learning

import com.google.inject.Guice
import com.google.inject.name.Names
import dev.misfitlabs.kotlinguice4.KotlinModule
import dev.misfitlabs.kotlinguice4.getInstance
import jakarta.inject.Inject

fun main() {
    val injector = Guice.createInjector(MyFirstModule())
    val service =
        injector.getInstance<MySuperService>()
    service.sayHello()
}

class MyFirstModule : KotlinModule() {
    override fun configure() {
        // Avoid using .toInstance with objects that are complicated to create, since it can slow down application startup. You can use an @Provides method instead.
        bind<ConfigurationProvider>().toInstance(S3ConfigurationProvider())
        bind<String>().annotatedWith(Names.named("option")).toInstance("s3")
//        bind<String>().toInstance("s3x")
    }
}

interface ConfigurationProvider {
    fun getHelloMessage(): String
}

class S3ConfigurationProvider : ConfigurationProvider {
    override fun getHelloMessage(): String {
        return "Hello World from S3"
    }
}

class MySuperService
    @Inject
    constructor(
        private val config: ConfigurationProvider,
        private val storage: String,
    ) {
        fun sayHello() {
            println(storage)
            println(config.getHelloMessage())
        }
    }
