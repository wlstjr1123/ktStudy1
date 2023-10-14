fun main(args: Array<String>):Unit {
    println("Hello kotlin!!")
    println(34 + 23 - 100)

    var sum: Int = 100 // 변수
//    sum = 100

    val a: Int = 10 + 100 - 50 // 상수 final
    println(a)

    val b: Int = 40 + 70 + a
    println(b)

    sum = a + b
    println(sum);

    var aa = 10 + 10 + 20 // Int로 자동 인식
    println(aa)
}