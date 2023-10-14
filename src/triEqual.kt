// ===(두 참조변수가 같은 객체를 가리키고 있는지 여부를 조사하는 연산자), !=== 연산자


fun main(args: Array<String>):Unit {
    var a = "first"
    var b = "first"
    // 같은 문자열일 경우 새로만들지않고 똑같은 데이터를 참조

    println(a===b) // ===는 두 참조변수가 같은 객체를 참조할 경우에 true 리턴

    b = "fir"
    b += "st"

    println(a === b)
}