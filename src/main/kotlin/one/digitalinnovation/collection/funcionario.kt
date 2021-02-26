package one.digitalinnovation.collection

data class funcionario(val nome: String, val salario: Double, val Contrato: String) {
    override fun toString(): String =
        """
            Nome: $nome
            Salario: $salario
            Tipo de contratação: $Contrato
            
        """.trimIndent()
}
