package one.digitalinnovation.collection

fun main() {
    val a = mutableListOf(1, 2 , 3 ,4)
    a.add(5)
    print(a)
    a.remove(2)
    print(a)

    print("_____________")
    val d = mutableSetOf<Int>(1, 2, 3)
    d.add(2)
    print(d)


}