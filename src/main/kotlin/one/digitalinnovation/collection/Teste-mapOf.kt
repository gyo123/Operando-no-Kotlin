package one.digitalinnovation.collection

fun main() {
    val x: Pair<String, Int> = Pair("João", 1)
    val z = mapOf(x)




    z.forEach{ c, a -> print("Chave: $c e Valor: $a \n") }

    val a = mapOf("Taele" to 2500,"Douglas" to 20000 )

    a.forEach { c, a -> print("\n Nome: $c Salario: $a") }
}