@file:Suppress("ktlint:standard:filename")

package pl.dpotyralski.learning

import com.google.inject.Guice
import com.google.inject.Provides
import dev.misfitlabs.kotlinguice4.KotlinModule
import dev.misfitlabs.kotlinguice4.getInstance
import jakarta.inject.Inject

//fun main() {
//    val injector = Guice.createInjector(MyFirstModule())
//    val service =
//        injector.getInstance<MySuperService>()
//    service.sayHello()
//}
//
//class MyFirstModule : KotlinModule() {
//    override fun configure() {
//    }
//
//    // Must be inside module
//    @Provides
//    fun createConfigurationProvider(s3Config: S3Config): ConfigurationProvider {
//        return S3ConfigurationProvider(s3Config)
//    }
//
//    @Provides
//    fun s3Config(): S3Config {
//        return S3Config("user", "token")
//    }
//}
//
//interface ConfigurationProvider {
//    fun getHelloMessage(): String
//}
//
//class S3ConfigurationProvider(val config: S3Config) : ConfigurationProvider {
//    override fun getHelloMessage(): String {
//        println("User: ${config.username}, Token: ${config.token}")
//        return "Hello World from S3"
//    }
//}
//
//data class S3Config(val username: String, val token: String)
//
//class MySuperService
//    @Inject
//    constructor(
//        private val config: ConfigurationProvider,
//    ) {
//        fun sayHello() {
//            println(config.getHelloMessage())
//        }
//    }
