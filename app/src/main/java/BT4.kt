import kotlinx.coroutines.*

//Khai báo hàm tạm ngưng
suspend fun getValue(): Double {
    delay(1000) // giả lập tác vụ tốn thời gian (1 giây)
    return 42.0
}

//Gọi hàm tạm ngưng từ một hàm tạm ngưng khác
suspend fun processValue() {
    val value = getValue()
    val newValue = value + 10
    println("Result after processValue: $newValue")
}

fun main() = runBlocking {
    //Chạy một hàm tạm ngưng trong GlobalScope
    GlobalScope.launch {
        val output = getValue()
        println("Result from GlobalScope.launch: $output")
    }
    delay(1500) // giữ main thread để coroutine ở trên kịp chạy

    //Gọi hàm tạm ngưng từ hàm tạm ngưng khác
    processValue()

    //Truy cập vào một Tác vụ coroutine (Job)
    val job: Job = GlobalScope.launch {
        val output = getValue()
        println("Output from Job: $output")
    }
    delay(500) // đợi một chút cho coroutine chạy nhưng không đợi được
    //Hủy một Tác vụ coroutine
    job.cancel()

    //Chạy một hàm tạm ngưng và chặn luồng hiện tại cho đến khi hàm này hoàn tất
    val blockingResult = getValue()
    println("Result from run Blocking: $blockingResult")

    //Sử dụng đồng bộ để cho phép trì hoãn hàm tạm ngưng
    val deferred = async { getValue() } // async trả về Deferred
    println("Result from deferred: ${deferred.await()}")
}
