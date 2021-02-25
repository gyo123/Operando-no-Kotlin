package one.digitalinnovation.collection

fun main() {
    val values = intArrayOf(1, 5, 10, 20, 50, 5, 9)
    val z = arrayOf("Hello", "gabriel", "Mundo")
    z.forEach { println(it) }
    println(" \n ----------------- \n")
    val q = DoubleArray(5)

    q[0] = 10000.0
    q[1] = 3000.0
    q[2] = 5000.0
    q[3] = 20000.0
    q[4] = 6000.0
    q.sort()
    q.forEach { i -> print("$i (Gyo te amo) \n") }

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