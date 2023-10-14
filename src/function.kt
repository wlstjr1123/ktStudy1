/*
    함수 : 명령어를 담는 상자
 */

fun main(args: Array<String>):Unit {
    println(myFun())
}

fun myFun():Int { // 인자(파라미터, 매개변수)가 없는 함수

    val a = 10
    val b = 11
    println("a : $a, b : $b")
    
    return a + b
}
