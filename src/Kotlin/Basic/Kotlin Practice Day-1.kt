package Kotlin.Basic/*
fun main(){
    print("Tomar nam lekho:")
    val name = readLine()!!
    print("Math cq te koto paicho?")
    val mathCQ = readLine()!!.toInt()
    print("Math mcq te koto paicho?")
    val mathMCQ = readLine()!!.toInt()
    fun add(cq : Int,maq : Int) = cq + maq
    val result = add(mathCQ,mathMCQ)
    val grade = when (result){
      in 80..100 -> "A+"
      in 70..79 -> "A"
      in 60..69 -> "A-"
      in 50..59 -> "B"
      in 40..49 -> "C"
      in 0..39 -> "F"
      else -> "Something wrong"
    }

    println("\n-----Result-----")
    println("Your name is: $name")
    println("Your total marks is: $result")
    println("Your grade is: $grade")

}
*/

/*
fun printUserInfo(Name : String ,Age: Int = 18,Country : String = "Bangladesh"){
    println("Your name is $Name,your age is: $Age , Country is: $Country")
}
fun main(){
    printUserInfo(Name = "Abir Hossen",Age = 16, Country = "Bangladesh")
    printUserInfo("Abir")
} */
/*
fun main(){
    print("Enter your message: ")
    val message = readLine()!!
    print("Enter your message amount: ")
    val amount = readLine()!!.toInt()
    println("\n----------------")
    if(amount<10000) {
        for (i in 1..amount) {
            println("[$i] => $message")
        }
    } else {
        println("You reached your maximum amount.")
    }
}
*/

//                              Default Arguments &amp; Named Arguments
/*
fun calculateBill(amount : Double , taxPercent: Double = 5.0, discount: Double = 0.0) {
   println("Your total bill is: ${amount + (amount  * taxPercent / 100) - discount}")
}
*/

/*
fun main(){
    calculateBill(100.00)
    calculateBill(amount = 23.00,discount = 20.00)
    calculateBill(amount = 50.00,taxPercent = 10.00,discount = 12.00)

    print("Enter your age: ")
    val age = readln().toIntOrNull() ?: 0
    println("Your age is $age")

    var name: String? = "Abir"
    name =
}
*/

/*
fun main(){
    val name : String? = null
    val length  = name?.length ?: 5
    println(" $length")

    val userName : String? = null
    val displayName = userName?: "Guest"
    println(displayName)
}
*/
/*
fun getStudentName(name: String?){
    println("Your name length is ${name?.length ?: 0}")
}

fun main(){
    getStudentName(null)
    getStudentName("Abir")
}

class Student{}
*/


/*
fun main(){
    val tasks = mutableListOf("Read Book","Practice Kotlin","Exercise")
    tasks.add("Learn Jetpack Compose")
    tasks.removeAt(0) // tasks.remove("Read Book")
    println("-------Result------")
    for(i in tasks){
        println(i)
    }
}
*/
/*
data class Student(val name: String, val age : Int)
fun main(){
    val student1 = Student("Abir",15)
    val student2 = Student("Mim",17)

    println(student1)
    println(student2)
    val student3 = student1.copy()
    println(student3 == student1)
}
*/


data class Book(val title: String, val author: String, val price : Double)
fun main(){
    val book1 = Book("Poddoja","Joy Amir",150.00)
    val book2 = book1.copy(title = "Kumar Golpo",price = 300.00)
    val bookList = mutableListOf(book1,book2)
    for( i in bookList){
        println("Book name: ${i.title}, Author: ${i.author} and price: ${i.price}")
    }
// Apply scope fun
    val text = StringBuilder().apply {
        append("Hello ")
        append("Abir")
    }.toString()
    println(text)
}


/*
fun main(){
    val name =  "Abir"
    val age = 15
    val isDeveloper = true

    println("Name is $name, the age is $age")
    if (isDeveloper) {
        println("Yes he is an verified developer")
    } else {
        println("No he is not an verified developer")

    }
    when(name){
        "Abir" -> println("Her name is Abir")
        "Mim" -> println("Her name is Mim")
        else -> println("Her name is Unknown")
    }

}
 */