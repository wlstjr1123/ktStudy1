// 정수타입 :
// Byte(1바이트)   : -128 ~ 127
// short(2바이트)  : `3만 2768 ~ 3만 2767


fun main(args: Array<String>): Unit {
    val a: Byte = 125
    val b: Short = (10+1000)*10
    var cc:Int = 1_000_000_000 // 언더스코어로 알아보기 쉽게 설정 가능
    cc=0xFF_AA_77 // 16진수 표현
    cc=0b10101010_01110111 // 2진수 표현
    var d:Long = 233_343_456_456_786

    cc = a + b
    d = cc + 10L

    var ee:Float = 45.4f // Float 타입은 리터럴 뒤에 f, F를 덧붙여 선언한다.

    val dd:Double = 45.34

    ee = (ee + dd).toFloat()
    println(ee)

    println(0.1f + 0.1f + 0.1f + 0.1f + 0.1f)
    println(0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f) // 0.1dl 2진수로 변환할 때 값의 정확한 표현의 한계가 있음

    println(0.1 * 10)
}