@file:Suppress("ktlint:standard:filename")

package pl.dpotyralski.learning

// fun main() {
//    val injector = Guice.createInjector(MyFirstModule())
//
//    val customerResource =
//        injector.getInstance<CustomerResource>()
//    val companyResource =
//        injector.getInstance<CompanyResource>()
//
//    customerResource.start()
//    companyResource.start()
// }
//
// class MyFirstModule : KotlinModule() {
//    override fun configure() {
//        bind<ConfigurationProvider>().to<S3ConfigurationProvider>().`in`<Singleton>()
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
// @Inject
// constructor(
//    private val config: ConfigurationProvider,
// ) {
//    fun sayHello() {
//        println("Config provider " + config)
//        println(config.getHelloMessage())
//    }
// }
//
// class AnotherService
// @Inject
// constructor(
//    private val config: ConfigurationProvider,
// ) {
//    fun sayHello() {
//        println("Config provider " + config)
//        println(config.getHelloMessage())
//    }
// }
//
// class CustomerResource
// @Inject
// constructor(
//    private val mySuperService: MySuperService,
//    private val anotherService: AnotherService,
// ) {
//    fun start() {
//        mySuperService.sayHello()
//        anotherService.sayHello()
//        println(mySuperService)
//        println(anotherService)
//    }
// }
//
// class CompanyResource
// @Inject
// constructor(
//    private val mySuperService: MySuperService,
//    private val anotherService: AnotherService,
// ) {
//    fun start() {
//        mySuperService.sayHello()
//        anotherService.sayHello()
//        println(mySuperService)
//        println(anotherService)
//    }
// }
