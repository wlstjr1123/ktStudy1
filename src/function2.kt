fun main(args:Array<String>):Unit {
    val aaValue = aa()
    println(aaValue)
}

//fun aa():Double {
//    return 3.0 + 100
//}

// 위의 함수를 간단히 줄여서 다음과 같이 사용할 수 있다. 블록을 =로 표현한다.
//fun aa():Double = 3.0 + 100 // 여기서 return은 반드시 생략한다

fun aa() = 3.0 + 100 // 타입을 생략할 수 있다.