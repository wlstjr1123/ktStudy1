fun main(args: Array<String>):Unit {
    val data1 = "hello"

    when(data1) {
        "hello" -> println("data1은 hello 입니다.")
        "Kotlin" -> println("data1은 Kotlin 입니다.")
        else -> println("data1은 hello도 Kotlin도 아닙니다.")
    }

    // 범위 지정 해서 when쓸때
    val data2 = 35

    when(data2) {
        !in 1..100 -> println("invalid data 범위 밖의 수 입니다.")
        in 31..40-> println("31 <= data2 <= 40에 해당하는 수 입니다.") // 30~40 포함되면
        in 21..30 -> println("21 <= data2 <= 30에 해당하는 수 입니다.")
        in 11..20 -> println("11 <= data2 <= 20에 해당하는 수 입니다.")
        in 1..10 -> println("1 <= data2 <= 10에 해당하는 수입니다.")
        else -> println("data2 > 40에 해당하는 수입니다.")
    }
}