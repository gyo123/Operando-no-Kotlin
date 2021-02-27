package one.digitalinnovation.collection

fun main() {

    val x = mutableMapOf<Int, String>()
    x[2] = "gabriel"
    x[1] =  "dois"
    x[3] = "canadá"
    print("Agora irei mostrar o primeiro que é " + x[1]) //dois
    print("\n Agora o 3 que é " + x.getValue(3)) // canadá
    print("\n Agora o 2 que é " + x[2]) // gabriel
    print("\n -----------")

    val z = mutableMapOf("Gyo" to 1, 20 to 2, )
    print("\n entradas: " + z.entries) //Gyo=1, 20=2
    print("\n chaves: " + z["Gyo"]) // 1
    print("\n valor: " + z.values) // 1, 2 (primeiro define a chave e depois o valor)
    print("\n " + z) // Gyo=1, 20=2
    print("\n ---------\n")


    val c = mutableMapOf(1 to "Gyo", 2 to 20)
    print("\n Agora o 2 que é " + c[2]) // 20
    print("\n Agora o 1 que é " + c[1]) // Gyo
    print("\n ---------\n")

    val b = mutableMapOf<Int, String>()
    b[2] = "Gabriel"
    b.put(1, "Gyo")
    print(b.values) // Gabriel, Gyo
    print(b.keys) // 2, 1
    print("\n" + b[1]) // Gyo
    print(b) // 2=Gabriel, 1=Gyo


}