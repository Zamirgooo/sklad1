
fun main() {
    val warehouse = Warehouse()

    while (true) {
        println("\n1. Add product")
        println("2. Search by name")
        println("3. Search by date")
        println("4. Winter product")
        println("5. Remove zero quantity")
        println("6. show all")
        println("7. Save & Exit")


        when (readLine()) {
            "1" -> {
                println("Name: ")
                val name = readLine()!!

                println("Season: ")
                val season = readLine()!!

                println("Quantity: ")
                val quantity = readLine()!!.toInt()

                println("Price: ")
                val price = readLine()!!.toDouble()

                println("Date: ")
                val date = readLine()!!

                println("Type: ")
                val type = readLine()!!

                warehouse.addProduct(Product(name, season, quantity, price, date, type))
            }

            "2" -> {
                println("Enter date: ")
                val date = readLine()!!
                warehouse.SearchByDate(date).forEach { println(it) }
            }

            "3" -> {
                println("Enter season: ")
                val season = readLine()!!
                warehouse.SearchBySeason(season).forEach { println(it) }
            }

            else -> return
        }
    }


}
