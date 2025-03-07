// Dependency injection


// bad code example
//class Engine () {
//    fun start() = println("The Engine is running.")
//}
 // the car class and the Engine class are strongly coupled
 // if you want to change the engine you need to change the whole car
 // also it is against the open-close principle, if we want to change the engine we need to
 // change the Car class

//class Car {
//    private val engine = Engine()
//    fun drive() = engine.start()
//}


//fun main() {
//    val car = Car()
//    car.drive()
//}

// good code example
 // in this scenario we have loose coupling between classes
// We decouple our class construction from the construction of its dependencies,
// allowing for better flexibility, testability, and maintainability.

interface Engine {
    fun start()
}

//// Different engine implementations
class DieselEngine : Engine {
    override fun start() = println("Diesel Engine is running.")
}

class ElectricEngine : Engine {
    override fun start() = println("Electric Engine is running silently.")
}

// Car now depends on the Engine interface, not a specific implementation
class Car(private val engine: Engine) {
    fun drive() = engine.start()
}

fun main() {
    val dieselCar = Car(DieselEngine())
    dieselCar.drive() // "Diesel Engine is running."

    val electricCar = Car(ElectricEngine())
    electricCar.drive() // "Electric Engine is running silently."
}


