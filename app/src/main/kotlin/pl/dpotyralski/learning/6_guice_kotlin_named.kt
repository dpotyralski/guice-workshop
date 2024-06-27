@file:Suppress("ktlint:standard:filename")

package pl.dpotyralski.learning

// fun main() {
//    val injector = Guice.createInjector(MyFirstModule())
//    val service =
//        injector.getInstance<MySuperService>()
//
//    service.sayHello()
// }
//
// class MyFirstModule : KotlinModule() {
//    override fun configure() {
//        bind<ConfigurationProvider>().annotatedWith(Names.named("s3")).to<S3ConfigurationProvider>()
//        bind<ConfigurationProvider>().annotatedWith(Names.named("local")).to<LocalStorageConfigurationProvider>()
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
//        @Named("s3") private val config: ConfigurationProvider,
//    ) {
//        fun sayHello() {
//            println(config.getHelloMessage())
//        }
//    }
