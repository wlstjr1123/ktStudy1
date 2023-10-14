

// 디폴트 인수를 갖는 함수(매개변수가 기본값을 갖는 함수)

fun main(args:Array<String>):Unit {
    val avg = getAvg(77, 88, true)
    println(avg);

    val avg3 = getAvg()
    println(avg3)

    val avg4 = getAvg(print = true)
    println(avg4)
}

fun getAvg(a:Int = 0, b:Int = 0, print:Boolean = false):Double { // false는 매개변수값을 넣지 않았을 때 기본값
    val result = (a+b)/2.0
    if (print)
        println(result)
    return result
}