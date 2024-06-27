@file:Suppress("ktlint:standard:filename")

package pl.dpotyralski.learning

// fun main() {
//    val injector = Guice.createInjector(MyFirstModule())
//
//    val service =
//        injector.getInstance<MySuperService>()
//
//    val anotherService =
//        injector.getInstance<AnotherService>()
//
//    service.sayHello()
//    anotherService.sayHello()
// }
//
// class MyFirstModule : KotlinModule() {
//    override fun configure() {
//        bind<ConfigurationPotato>().to<S3ConfigurationProvider>().`in`<Singleton>()
//    }
// }
//
// interface ConfigurationPotato {
//    fun getHelloMessage(): String
// }
//
// class S3ConfigurationProvider : ConfigurationPotato {
//    override fun getHelloMessage(): String {
//        return "Hello World from S3"
//    }
// }
//
// class MySuperService
//    @Inject
//    constructor(
//        private val config: ConfigurationPotato,
//    ) {
//        fun sayHello() {
//            println("Config provider " + config)
//            println(config.getHelloMessage())
//        }
//    }
//
// class AnotherService
//    @Inject
//    constructor(
//        private val config: ConfigurationPotato,
//    ) {
//        fun sayHello() {
//            println("Config provider " + config)
//            println(config.getHelloMessage())
//        }
//    }
//
// fun ScopedBindingBuilder.asSingleton() {
//    this.`in`(Scopes.SINGLETON)
// }
