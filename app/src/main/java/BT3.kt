fun main() {
    //Tạo một nhóm từ danh sách
    val numbers = listOf(0, 3, 8, 4, 0, 5, 5, 8, 9, 2)
    val setOfNumbers = numbers.toSet() //loại bỏ phần tử trùng
    println("Transfer from list to set: $setOfNumbers")

    //Xác định một nhóm
    val set1 = setOf(1, 2, 3) //bất biến
    println("Set one: $set1")
    val set2 = mutableSetOf(4, 3, 5) //khả biên
    set2.add(6)
    set2.remove(5)
    println("Set two: $set2")

    //Phép toán trên nhóm
    set1.intersect(set2) //tìm giao của hai tập hợp
    println("Intersect: ${set1.intersect(set2)}")
    set1.union(set2) //hợp hai tập hợp loại bỏ trùng lặp
    println("Union: ${set1.union(set2)}")

    //Xác định một sơ đồ có thể thay đổi
    val peopleAges = mutableMapOf<String, Int> (
        "Freg" to 30,
        "Ann" to 23
    )
    println("People Age: $peopleAges")
    peopleAges.put("Barbara", 42) //thêm phần tử
    peopleAges["Joe"] = 51
    println("People Age: $peopleAges")

    //Lặp lại tập hợp
    peopleAges.forEach {
        println("Foreach: ${it.key} is ${it.value}")
    } //chỉ in ra không thể dùng tiếp

    //Chuyển đổi từng mục trong một tập hợp
    val result = peopleAges.map {
        "${it.key} is ${it.value}"
    }.joinToString() //có thể dùng tiếp result
    println("Result uppercase: ${result.uppercase()}")
    println("Length is: ${result.length}")

    //Lọc các mục trong một tập hợp
    val filteredNames = peopleAges.filter {
        it.key.length < 4
    }
    println("Name less than 4 chacracter: $filteredNames")

    //Các phép toán khác trên tập hợp
    val words = listOf("about", "acute", "best", "ballooon", "brief", "class")
    val filteredWords = words.filter {
        it.startsWith("b", ignoreCase = true)
    }
    println("Filtered Words: $filteredWords")
    println("Shuffled: ${filteredWords.shuffled()}") //xáo trộn ngẫu nhiên
    println("Take: ${filteredWords.take(2)}") //lấy 2 phần tử đầu sau khi xáo
    println("Sort: ${filteredWords.sorted()}") //sắp xếp lại theo thứ tự

    //Hàm phạm vi
    val name: String = "Quynh Nhu"
    name?.let {
        println("Hello $it")
    }
    val person = Person()
    person.apply {
        firstName = "Quynh"
        lastName = "Nhu"
        age = 20
    }
    println("Person: ${person.firstName} ${person.lastName}, age: ${person.age}")

    //Hàm Lambda
    val triple: (Int) -> Int = { a: Int -> a * 3 }
    println("Result of Lambda: ${triple(5)}")

    //Toán tử Elvis
    var quantity: Int? = null
    println("Result of quantyty before: ${quantity ?: 0}") // In 0
    quantity = 4
    println("Result of quantyty after: ${quantity ?: 0}")
}
class Person {
    var firstName: String = ""
    var lastName: String = ""
    var age: Int = 0
}