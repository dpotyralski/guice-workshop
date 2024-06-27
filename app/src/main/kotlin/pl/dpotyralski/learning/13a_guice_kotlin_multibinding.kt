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
//        val multibinder = KotlinMapBinder.newMapBinder<String, Launcher>(kotlinBinder)
//        multibinder.addBinding("tv").to<TvLauncher>()
//        multibinder.addBinding("airCondition").to<AirCondition>()
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
//        private val launchers: Map<String, Launcher>,
//    ) {
//        fun launch() {
//            launchers.forEach { (name, launcher) ->
//                println("Key: $name")
//                launcher.launch()
//            }
//        }
//    }
