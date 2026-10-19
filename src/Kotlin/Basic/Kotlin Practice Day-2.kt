package Kotlin.Basic

// Day 2 , kotlin learning
data class Student(var name: String, var age: Int,var gpa : Double)


fun main(){

//                      Example of let

    val nullAbleName : String? = "Abir"
    nullAbleName?.let{
        println("Student name is: $it")
        println("Name length is: ${it.length}")
    }

//              Example Apply

    val student1 = Student("ASP",15,2.0).apply {
       age = 20
        gpa = 5.0
        name = "Abir Asp"
    }

    println("Updated Student Info : $student1")
}