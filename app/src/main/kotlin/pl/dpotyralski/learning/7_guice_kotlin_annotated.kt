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
//        bind<ConfigurationProvider>().annotatedWith<S3>().to<S3ConfigurationProvider>()
//        bind<ConfigurationProvider>().annotatedWith<LocalStorage>().to<LocalStorageConfigurationProvider>()
//    }
// }
//
// @Qualifier
// @Target(AnnotationTarget.FIELD, AnnotationTarget.TYPE_PARAMETER, AnnotationTarget.VALUE_PARAMETER)
// @Retention(AnnotationRetention.RUNTIME)
// annotation class S3
//
// @Qualifier
// @Target(AnnotationTarget.FIELD, AnnotationTarget.TYPE_PARAMETER, AnnotationTarget.VALUE_PARAMETER)
// @Retention(AnnotationRetention.RUNTIME)
// annotation class LocalStorage
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
//        @LocalStorage private val config: ConfigurationProvider,
//    ) {
//        fun sayHello() {
//            println(config.getHelloMessage())
//        }
//    }
