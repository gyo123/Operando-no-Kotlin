package one.digitalinnovation.collection

fun main() {
    val values = intArrayOf(1, 5, 10, 20, 50, 5, 9)
    val z = arrayOf("Hello", "gabriel", "Mundo")
    z.forEach { println(it) }
    println(" \n ----------------- \n")

    for (valu in values){
        println(valu)

    }

    println("------------------------")
    values.sort()
    values.forEach {

        println(it)
    }

}