/*
    for 문

    for(변수 in 리스트) {

    }
 */

/*
    for (i in 리스트 until) {}
 */

fun main(args:Array<String>):Unit {
    var sum = 0
    val max = 10

    for(i in 1..max) {
        sum += i
    }

    println(sum)

//    for (i in 1 until 100) { // 1~99까지 출력 until은 자신은 포함하지 않음(100은 100을 포함하지 않는다
//        println(i)
//    }

    val a = 100
    for (i in 1..a step 2) { // 단위로 출력 step 2는 2씩 증가
        println(i)
    }

    for(x in 10 downTo 1) { // 숫자를 감소시키면서 출력할 때
        println(x)
    }
}