package one.digitalinnovation.collection

fun main() {
    val func1 = funcionario("João", 2000.0, "CLT")
    val func2 = funcionario("Taele", 7000.0, "PJ")
    val func3 = funcionario("Gyovanni", 500.0, "CLT")

    val funcionarios = listOf(func1, func2, func3)

    val listaOrdernada = funcionarios.sortedBy { it.salario }
    print(listaOrdernada)

    print("\n --------- \n")

    val x = listOf("ab", "c", "def")
    val z = x.groupBy { it.length }
    print(z.values)
    print("\n ---------\n ")

    println("\n" + funcionarios.filter { it.salario > 1000.0 })
    println("\n" + funcionarios.find { it.salario == 500.0 })



}

