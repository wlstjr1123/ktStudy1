package study2

// 객체(Object)
fun main(args:Array<String>):Unit{
    var person = object
    {
        // object 객체에 포함된 변수들을 프로퍼티(Property)
        val name:String = "김말똥"
        val age:Int = 33
    }

    println(person.name)
    println(person.age)
}