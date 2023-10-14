package study2

// 클래스(class) : 객체를 찍어내는 틀

class Person
{
    var name:String=""
    var age:Int = 0
}

fun main(args:Array<String>):Unit {
    val person:Person
    person = Person()
    person.name = "김말똥"
    person.age = 22

    val person2 = Person()
    person.name = "고길동"
    person.age = 33

    val person3 = Person()
    person.name = "강말똥"
    person.age = 30
}