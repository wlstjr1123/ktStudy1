// 매개변수(dlswk(dlstn Argument), Parameter)

// Unit은 반환값이 덦는 타입을 의미한다. 즉, Unit타입이라고 한다.
// 함수를 작성하다 보면 리턴값이 필요하지 않을 경우가 있다.
// Unit는 C언어, Java언어의 void와 같다

fun main(args: Array<String>):Unit {
    val xx = aa(30)
    println(xx)

    val avg = getAvg(77, 88)

    aa2(20)
}

fun aa(x:Int):Double {
    return x*1.2 + 20
}

fun getAvg(a:Int, b:Int):Double {
    return (a + b) / 2.0
}

//fun aa2(xx:Int):Unit { // 리턴 타입이 지정되지 않으면 Unit타입이다.
//    println(xx * 1.0 + 30)
//}

fun aa2(xx:Int) = println(xx * 1.0 + 30)
