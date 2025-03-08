//Singleton
// kotlin has a very simple way of creating Singleton object

object DatabaseManager {
    private var connectionInitialized = false

    init {
        println("initialising: $this")
    }
    @Synchronized // also a good practice is to add @Synchronized to make sure that only one thread can
    // modify connection state
    fun connectToDb() {
        if (connectionInitialized) {
            println("connected to db")
        } else {
            println("connecting to db...")
            connectionInitialized = true
        }
    }
    @Synchronized
    fun disconnect() {
        if (connectionInitialized) {
            println("disconnecting from db...")
            connectionInitialized = false
        } else {
            println("there is no active connection.")
        }
    }
}


fun main() {
    val databaseManager1 = DatabaseManager
    val databaseManager2 = DatabaseManager

    println(databaseManager2 == databaseManager1) // true but if we change object to class we will receive false

    databaseManager1.connectToDb() // connecting to db ...
    databaseManager2.connectToDb() // connected to db
    DatabaseManager.disconnect() // disconnecting from db...
    DatabaseManager.disconnect() // there is no active connection.
}
