//오버로딩 : 같은이름의 함수를 매개변수를 다르게 해서 여러개 정의 하는 것
// 매개변수를 다르게 한다는 것은 타입이나 갯수를 다르게 한다는 의미이다

// 함수 시그니처(Function Signiture)란 함수를 만들 때 가장 기본적인 형태
// fun avg(one:Int, two:Int):Double

fun some(a:String) {
    println("some(aLString) 호출....")
}

fun some(a:Int) {
    println("some(a:Int) 호출....")
}

fun some(a:Int, b:String) {
    println("some(a:Int, b:String) 호출....")
}

fun main(args:Array<String>):Unit {
    some("Hello")
    some(100)
    some(100, "hello")
}