//산술연산자(+ - * / %)
fun main(args: Array<String>):Unit {
//    val num: Double = 10.0 + 20 - 44
    val num: Int = 10 + 20 - 17
    val num2: Int = 200 % 3
    val num3: Double = 7.5/5 + 11.1
    val num4: Double = num.toDouble()/num2 + 0.3 // toDouble() = 형변환

    println(num)
    println(num2)
    println(num3)
    println(num4)

    var aa = 10
    var bb = 5

    println(aa++ + bb)
}

// 코틀린은 타입 체크가 확실하다
// Double에 Int(정수)형 값을 넣을 수 없다 (소수점을 넣어줘야됨)