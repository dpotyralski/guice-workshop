@file:Suppress("ktlint:standard:filename")

package pl.dpotyralski.learning

// fun main() {
//    val injector = Guice.createInjector(MyFirstModule())
//    val service = injector.getInstance(MySuperService::class.java)
//    service.sayHello()
// }
//
// class MyFirstModule : AbstractModule() { // modules are used to configure bindings
//    override fun configure() {
//        bind(ConfigurationProvider::class.java).to(S3ConfigurationProvider::class.java)
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
