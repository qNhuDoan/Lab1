//Lớp có thuộc tính và phương thức
class DiceFirst {
    var sides = 6
    fun roll() {
        val randomNumberFirst = (1..sides).random()
        println("Dice first: $randomNumberFirst")
    }
}

//Lớp có thông số
class DiceSecond (val numSides: Int) {
    fun roll(): Int {
        val randomNumberSecond = (1..numSides).random()
        return randomNumberSecond
    }
}

fun main() {
    // In kết quả DiceFirst và DiceSecond
    val myFirstDice = DiceFirst()
    myFirstDice.roll()   // tự in ra kết quả bên trong phương thức

    val mySecondDice = DiceSecond(6)
    val result = mySecondDice.roll()
    println("Dice second: $result") // in kết quả ra màn hình

    //In đơn giản
    println("Hello, VKU")
    println("This is text to print")

    //Biến
    val age = "20"
    val name = "Quynh Nhu"
    println("Age: $age!")
    println("My name is $name, I'm $age years old")
    var roll = 6
    println("Roll before: $roll")
    roll = roll + 5
    var rollValue: Int = 4
    rollValue = rollValue + 10
    println("Roll after: $roll")
    println("Roll Value: $rollValue")

    //Hàm không có đối số
    fun printHello() {
        println("Hello")
    }
    printHello()

    //Hàm có đối số
    fun printBorder(border: String, timeRepeat: Int) {
        repeat(timeRepeat) {
            print(border)
        }
        println()
    }
    printBorder("*", 10)

    //Hàm trả về một giá trị (để dùng kết quả trả về tiếp tục làm việc)
    fun roll(): Int {
        val randomNumber = (1..6).random()
        return randomNumber
    }
    fun total() {
        val total = roll() + roll()
        println("Total = $total")
    }
    total()

    //Vòng lặp
    fun printCakeBottom(age: Int, layers: Int) {
        repeat(layers) {
            repeat(age + 2) {
                print("@")
            }
            println()
        }
    }
    printCakeBottom(20, 2)

    //Câu lệnh if else
    fun main(num: Int) {
        if (num > 4) {
            println("Greater than 4")
        } else if (num == 4) {
            println("Greater equal 4")
        } else {
            println("Less than 4")
        }
    }
    main(4)

    //Câu lệnh when
    fun playDiceGame(rollResult: Int) {
        val luckyNumber = (1..6).random()
        println("Lucky number: $luckyNumber")
        println("You rolled: $rollResult")
        when (rollResult) {
            luckyNumber -> println("You won!")
            1 -> println("So sorry! You rolled a 1. Try again!")
            2 -> println("Sadly, you rolled a 2. Try again!")
            3 -> println("Unfortunately, you rolled a 3. Try again!")
            4 -> println("No luck! You rolled a 4. Try again!")
            5 -> println("Don't cry! You rolled a 5. Try again!")
            6 -> println("Apologies! You rolled a 6. Try again!")
            else -> println("Invalid roll! Please enter a number between 1 and 6.")
        }
    }
    playDiceGame(6)
}
