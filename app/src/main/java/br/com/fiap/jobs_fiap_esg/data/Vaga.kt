package br.com.fiap.jobs_fiap_esg.data

data class Vaga(
    val id: Int,
    val titulo: String,
    val zona: String,
    val bairro: String
)

val vagasDisponiveis = listOf(
    Vaga(1, "Empacotador", "Zona Sul", "Grajaú"),
    Vaga(2, "Caixa", "Zona Leste", "Tatuapé"),
    Vaga(3, "Auxiliar de serviços gerais", "Zona Norte", "Santana"),
    Vaga(4, "Auxiliar de escritório", "Zona Central", "República"),
    Vaga(5, "Assistente administrativo", "Zona Oeste", "Lapa")
)