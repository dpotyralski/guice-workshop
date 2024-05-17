@file:Suppress("ktlint:standard:filename")

package pl.dpotyralski.learning

// fun main() {
//    val injector = Guice.createInjector(MyFirstModule())
//    val service =
//        injector.getInstance<MySuperService>()
//    service.sayHello()
// }
//
// class MyFirstModule : KotlinModule() {
//    override fun configure() {
//        bind<String>().annotatedWith(Names.named("option")).toInstance("s3")
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
// class LocalStorageConfigurationProvider : ConfigurationProvider {
//    override fun getHelloMessage(): String {
//        return "Hello World from Local Storage"
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
