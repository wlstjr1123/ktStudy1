fun main(args: Array<String>):Unit {
    // 조건문 if

    var aa = 10
    var bb = 20

    if(aa < bb) {
        println("조건이 참입니다!!")
        bb -= aa
    } else {
        println("조건이 거짓입니다!!")
        aa += bb
    }

    println(bb)
    println(aa)

    val a = 100
    val b = 50

    if (a < b) println("if문")
    else println("else문")

    if (a > b) println("a가 큽니다")
    else println("b는 a보다 크거나 같다")

    val jumsu = 85

    if (jumsu >= 90) {
        println("A학점")
    } else {
        println("B학점")
    }
}