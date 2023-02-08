fun main() {
    greeting("Abigail")
     division()
     var results =add(88, 34, 456, 987)
    println(results)
    type()
}

fun greeting(name: String){
    println("Hello"+ " " + "" + name)
}
fun division(){
    var num1 = 654
    var num2 = 13
    println(num1/num2)
}
fun add(x: Int, y: Int, z: Int, p: Int): Int{
    var sum = x+y+z+p
    return sum
}
fun type(){
    println("Lucky Wangari is a smart young lass that is smart and openminded with an interest to " +
            "change the norm using technology")
}





