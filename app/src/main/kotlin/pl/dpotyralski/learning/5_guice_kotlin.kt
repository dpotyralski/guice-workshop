@file:Suppress("ktlint:standard:filename")

package pl.dpotyralski.learning

// import com.google.inject.Guice
// import dev.misfitlabs.kotlinguice4.KotlinModule
// import dev.misfitlabs.kotlinguice4.getInstance
// import jakarta.inject.Inject
//
// fun main() {
//    val injector = Guice.createInjector(MyFirstModule())
//    val service = injector.getInstance<MySuperService>() // getInstance is a helper method that simplifies the creation of instances
//    service.sayHello()
// }
//
// class MyFirstModule : KotlinModule() { // KotlinModule is a helper class that simplifies the creation of modules
//    override fun configure() {
//        // bind(ConfigurationProvider::class.java).to(S3ConfigurationProvider::class.java)
//        bind<ConfigurationProvider>().to<S3ConfigurationProvider>()
//    }
// }
//
// interface ConfigurationProvider {
//    fun getHelloMessage(): String
// }
//
// class S3ConfigurationProvider : ConfigurationProvider {
//    override fun getHelloMessage(): String {
//        return "Hello World from S3"
//    }
// }
//
// class MySuperService
//    @Inject
//    constructor(
//        private val config: ConfigurationProvider,
//    ) {
//        fun sayHello() {
//            println(config.getHelloMessage())
//        }
//    }
