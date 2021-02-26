package one.digitalinnovation.collection

fun main() {
    val Number = doubleArrayOf(1000.0, 2000.0)

    println("Maior salário: ${Number.maxOrNull()}")
    println("Menor Salário: ${Number.minOrNull()}")
    println("Média salarial: ${Number.average()}")

    val SalarioMaiorQue1500 = Number.filter { it > 1500.0 }
    SalarioMaiorQue1500.forEach{ println(it)}

    print("-----------------")
    // duas formas de usar o count exemplos

    println("\n Numero de elementos que estão dentro da array e são maior que 500.0 e menor que 3000.0 é " + Number.count{ it in 500.0..1500.0})
    val count2 = Number.count{it in 500.0..1500.0}
    println(count2)

    print("----------------- \n")
    println(Number.find { it == 1000.0 })
    println(Number.find { it == 500.0 })
    val find2 = Number.find { it == 2000.0 }
    print(find2)

    print("\n ----------------- \n")
//retorna true or false
    println(Number.any{it == 1000.0})  //true
    println(Number.any{it == 500.0})   //false
}
