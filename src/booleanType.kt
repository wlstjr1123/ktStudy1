// Boolean : 참과 거짓을 표현하는 타입
/*비교연산자 :
        == : a == b
        != : a != b
        >, <, <=, >=  : a > b, a < b*/

fun main(args: Array<String>):Unit {
    var isTrue: Boolean = 199 > 3*30
    println(isTrue)

    isTrue = false;

    val a = 100
    val b = 200

    isTrue = a > b
    println(isTrue)

    isTrue = a == b
    println(isTrue)

    // 논리 연산자
            /*&&
            ||
            !*/

    val aa = 20
    val bb = 30

    val bool:Boolean = (aa - bb < aa + bb) && (aa == 20)
    println(bool)
}
