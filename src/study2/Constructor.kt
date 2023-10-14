package study2

// 생성자(Constructor)
// 생성자는 객체를 초기화하는 맴버함수라고 생각하면 된다.

// 생성자를 만드는 형식
/*
    class 클래스명 constructor(생성자의 매개변수 선언)
    { .... }

    위에서 constructor 키워드는 생략이 가능하다.
 */

//class Human constructor(name:String, age:Int){
class Human(name:String, age:Int){
    var name:String
    var age:Int

    init {
        this.name = name
        this.age = age
    }
}

fun main(agrs:Array<String>):Unit {
    val human = Human("홍길동", 10)

    println(human.name)
    println(human.age)
}