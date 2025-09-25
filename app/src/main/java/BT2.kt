import kotlin.math.PI

//Lớp trừu tượng
abstract class Dwelling() {
    abstract val buidingMaterial: String
    abstract fun floorArea(): Double
}
class SquareCabin(val side: Double) : Dwelling() {
    override val buidingMaterial = "Wood"
    override fun floorArea() = side * side
}

//Đánh dấu một lớp là open để lớp đó có thể phân lớp con
open class RoundHut(resident: Int) {
    open fun floor(): Double {
        return 100.0 //mặc định diện tính 100
    }
}

//Tạo lớp con bằng cách mở rộng lớp mẹ
class SquareHut(val floors: Int) : RoundHut(5) {
    override fun floor(): Double {
        return super.floor() * floors
    }
}

fun main() {
    val cabin = SquareCabin(10.5)
    println("Cabin material: ${cabin.buidingMaterial}, area: ${cabin.floorArea()}")

    //Sử dụng with để đơn giản hóa việc truy cập vào một đối tượng
    with(cabin) {
        println("Cabin material by with: $buidingMaterial")
        println("Ares by with: ${floorArea()}")
    }
    val hut = SquareHut(5)
    println("Hut Area: ${hut.floor()}")

    //Danh sách
    val numbers = listOf(1, 2, 3,4 ,5 ,6)
    println("Size: ${numbers.size}")
    println("Number First: ${numbers[0]}")
    println("Reversed List: ${numbers.reversed()}")

    //Xác định một danh sách các chuỗi có thể thay đổi
    val entrees = mutableListOf<String>()
    println("Entrees Before: $entrees")
    entrees.add("spaghetti")
    println("Entrees Add: $entrees")
    entrees[0] = "lasagna"
    println("Entrees Change: $entrees")
    entrees.remove("lasagna")
    println("Entrees Remove: $entrees")

    //Vòng lặp với for và while
    val myList = listOf("Orange", "Apple", "Bannana")
    println("---Element os list---")
    for (element in myList) {
        println(element)
    }
    println("---Index of list---")
    var index = 1
    while (index < myList.size) {
        println(myList[index])
        index++
    }

    //Số ký tự trong một chuỗi
    val name = "Android"
    println("Number Character: ${name.length}")

    //Sử dụng một biến trong mẫu chuỗi
    val number = 10
    println("$number people")

    //Sử dụng một biểu thức trong mẫu chuỗi
    val members = 10
    val groups = 5
    println("Total members: ${members * groups}")

    //Sử dụng thư viện toán học Kotlin với thư viện import kotlin.math.PI
    val radius = 5
    val areaCircle = PI * radius * radius
    println("Area Circle: $areaCircle")
}