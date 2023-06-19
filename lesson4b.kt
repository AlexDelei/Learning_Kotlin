fun main () {
    booking(30)
    subtraction(10, 5)
}

fun booking(age : Int) {
    if (age < 5) {
        println("Free")
    }
    else if (age >= 5&& age < 20) {
        println("Pay 500")
    }
    else if (age >= 20 && age <65) {
        println("Pay 1000")
    }
    else {
        println("Free")
    }
}

fun subtraction(x : Int ,y : Int){
    val ans = x - y
    println(ans)
}