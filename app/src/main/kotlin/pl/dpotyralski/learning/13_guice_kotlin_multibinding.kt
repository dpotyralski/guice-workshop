@file:Suppress("ktlint:standard:filename")

package pl.dpotyralski.learning

// fun main() {
//    val injector = Guice.createInjector(MyFirstModule())
//    val service =
//        injector.getInstance<MySuperService>()
//    service.launch()
// }
//
// class MyFirstModule : KotlinModule() {
//    override fun configure() {
//        bind<TvLauncher>().`in`<Singleton>()
//        bind<AirCondition>().`in`<Singleton>()
//
//        val multibinder = KotlinMultibinder.newSetBinder<Launcher>(kotlinBinder)
//        multibinder.addBinding().to<TvLauncher>()
//        multibinder.addBinding().to<AirCondition>()
//    }
// }
//
// interface Launcher {
//    fun launch()
// }
//
// class TvLauncher() : Launcher {
//    override fun launch() {
//        println("Lunching tv")
//    }
// }
//
// class AirCondition() : Launcher {
//    override fun launch() {
//        println("Lunching air condition")
//    }
// }
//
// class MySuperService
//    @Inject
//    constructor(
//        private val launchers: Set<Launcher>,
//    ) {
//        fun launch() {
//            launchers.forEach { it.launch() }
//        }
//    }
