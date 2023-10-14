fun main(args: Array<String>): Unit {
    // Char 타입 : 문자를 저장할 수 있는 타입 (Cfaracter 줄임말)

    var ch:Char = 'A'
    println(ch.toInt())

    ch = '\uAC00' // \u는 유니코드를 의미함
    println(ch)

    ch = '코'
    println(ch.toInt())
}