/*
    반복문(while)

    while(Boolean 표현식)
    {
        코드
    }
 */

/*
    do while문

    do {
        실행시킬 코드
    } while(Boolean 표현식)
 */

/*
    continue 문
        반복문의 일부 코드를 무시하고 건너뛸때 사용하는 키워드
 */

/*
    break
        반복문 종료
 */

fun main(ags: Array<String>):Unit {
    var i = 1

    while(i < 10) {
        println(i)
        i += 1
    }

    var a = 1
    do {
        println("먼저 실행되는 코드")
    } while(a==0)

    var aa = 0

    while(aa < 10) {
        aa == aa + 1
        if (aa % 2 == 0)
            continue
        println(aa)
    }

    var ii = 0
    while(true) {
        ii += 1
        if (i > 10) break
        println(i)
    }
}