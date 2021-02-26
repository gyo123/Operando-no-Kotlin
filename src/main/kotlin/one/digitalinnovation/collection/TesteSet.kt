package one.digitalinnovation.collection

fun main() {
    val func1 = funcionario("João", 2000.0, "CLT")
    val func2 = funcionario("Taele", 7000.0, "PJ")
    val func3 = funcionario("Gyovanni", 500.0, "CLT")

    val func4 = setOf(1, 3, 2)
    val func5 = setOf(5, 4, 6)

    val func6 = func4.union(func5).sortedBy { it }

    print(func6)

}