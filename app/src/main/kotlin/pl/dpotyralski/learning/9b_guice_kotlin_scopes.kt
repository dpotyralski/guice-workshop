@file:Suppress("ktlint:standard:filename")

package pl.dpotyralski.learning

// fun main() {
//    val injector = Guice.createInjector()
//    val mySuperService = injector.getInstance<MySuperService>()
//    mySuperService.sayHello()
// }
//
// class MyFirstModule : KotlinModule() {
//    override fun configure() {
//        bind<S3ConfigurationProvider>().`in`<Singleton>()
//    }
// }
//
// class S3ConfigurationProvider {
//    fun getHelloMessage(): String {
//        return "Hello World from S3"
//    }
// }
//
// class MySuperService
//    @Inject
//    constructor(
//        private val config: S3ConfigurationProvider,
//    ) {
//        fun sayHello() {
//            println("Config provider $config")
//            println(config.getHelloMessage())
//        }
//    }
