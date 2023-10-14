// 가변인수 : vararg 키워드를 이용하여 가변적으로 매개변수를 사용할 수 있다.

fun main(args: Array<String>):Unit {
    val sum1 = getTotal(1, 2, 3)
    val sum2 = getTotal(10, 11, 22, 33, 44, 55)
    val sum3 = getTotal(11, 22, 33, 44, 55, 66, 77, 88, 99, 100)
    var sum4 = getTotal()
}

fun getTotal(vararg number:Int):Int {
    val cnt = number.size // 변수의 개수 type = Int
    var i = 0; var sum = 0

    while (i < cnt) {
        sum += number[i]
        i++
    }

    return sum
}

/* 가변 인수와 일반 변수를 같이 사용할 수 있다.
    주의점(가변인수는 일반 인수의 오른쪽에 배치된다.)
    fun myFunc(something:Char, vararg numbers:Int):Int

    fun myFunc(vararg number:Int, something:Char):Int // 오류 발생

    fun myFunc(vararg numbers:Int, somethis = Char타입 인수):Int
 */