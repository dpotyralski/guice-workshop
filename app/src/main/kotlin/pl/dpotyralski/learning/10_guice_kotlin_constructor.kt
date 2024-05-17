@file:Suppress("ktlint:standard:filename")

package pl.dpotyralski.learning

// fun main() {
//    val injector = Guice.createInjector(MyFirstModule())
//    val service = injector.getInstance<MySuperService>()
//    service.sayHello()
// }
//
// class MyFirstModule : KotlinModule() {
//    override fun configure() {
//        bind<MySuperService>().toConstructor(MySuperService::class.java.getConstructor(ConfigurationProvider::class.java))
//    }
// }
//
// class MySuperService(
//    private val config: ConfigurationProvider,
// ) {
//    fun sayHello() {
//        println(config.getHelloMessage())
//    }
// }
//
// class ConfigurationProvider {
//    fun getHelloMessage(): String {
//        return "Hello World"
//    }
// }
