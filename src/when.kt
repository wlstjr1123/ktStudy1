// swtich문과 비슷한 when문
/*
    when(타깃 표현식)
    {
        타깃표현식과 비교되는 값 ->
        {
            코드
        }
    }
 */

fun main(args:Array<String>):Unit {
    val jumsu = 66

    when(jumsu/10) {
        6 -> {
            println("D")
        }
        7 -> {
            println("C")
        }
        8 -> {
            println("B")
        }
        9, 10 -> {
            println("A")
        }
        else  -> {
            println("F")
        }
    }
}