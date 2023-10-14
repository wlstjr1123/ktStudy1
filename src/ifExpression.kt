// if문이 표현식이 될수 있다.
// if문이 표현식이 되려면 if와 else를 모두 갖춰져 있어야 된다.

// 코틀린에서는 삼항 연산자가 없다
// 삼항 연산자는 if표현식으로 해결된다.
fun main(args: Array<String>):Unit {
    val aa:Int = if (10 > 1) {
        println("10은 1보다 크다.")
        10
    } else {
        println("거짓 입니다.")
        1
    }

    println(aa)

}