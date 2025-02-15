fun main() {
    val favfruits = mutableListOf("Apple", "Mango", "Orange")
    favfruits.add("Pineapple")
    favfruits.removeAt(1)
    println(favfruits)

    val unique = mutableSetOf(1,2,3,4,5,5)
    unique.add(3)
    unique.add(6)
    println(unique)

    val maps = mutableMapOf("USA" to "Washington", "France" to "Paris", "Germany" to "Berlin")
    maps["Kuwait"] = "Kuwait City"
    println("Countries: ${maps.keys}")
    println("Capitals: ${maps.values}")
    maps.remove("USA")
    println("Final Map: $maps")

    val carsCompanies = arrayListOf("BMW", "Toyota", "Honda", "Ford")
    carsCompanies.add("BMW")
    carsCompanies.add("Tasla")
    carsCompanies.remove("Honda")
    println(carsCompanies)

    val numList = listOf(10,5,20,15,25,30)
    val greatthan = numList.filter { it > 15 }
    val ascendingOrder = numList.sorted()
    println("Numbers Greater than 15: $greatthan")
    println("Sorted List: $ascendingOrder")

    val douList = listOf(2.5, 7.1, 3.8, 9.2, 5.6)
    val maxNum = douList.maxOrNull()
    val minNum = douList.minOrNull()

    println("Largest number: $maxNum")
    println("Smallest number: $minNum")

}