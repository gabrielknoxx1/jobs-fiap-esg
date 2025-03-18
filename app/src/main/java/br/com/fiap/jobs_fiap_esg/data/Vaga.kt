package br.com.fiap.jobs_fiap_esg.data

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

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
data class VagaDescricao(
    val id: Int,
    val titulo: String,
    val empresa: String,
    val tipoTrabalho: String,
    val tipoContrato: String,
    val salario: String,
    val descricao: List<String>,
    val requisitos: List<String>,
    val beneficios: List<String>,
    val atividades: List<String>
)

val vagaDescricao = listOf(
    VagaDescricao(
        id = 1,
        titulo = "Empacotador",
        empresa = "Mercado DIA",
        tipoTrabalho = "Presencial",
        tipoContrato = "CLT",
        salario = "R$ 1.700/mês",
        descricao = listOf(
            "O empacotador é responsável por embalar e arrumar as mercadorias nas prateleiras, realizar a reposição de estoque, auxiliar na abertura e fechamento da loja, realizar a limpeza e organização do setor de vendas. O empacotador também é responsável por atender aos clientes e sanar dúvidas sobre os produtos e serviços da loja. Além disso, o profissional deve ser capaz de trabalhar em equipe e realizar outras tarefas que sejam necessárias para o bom funcionamento da loja. O cargo exige pontualidade, responsabilidade e habilidades de comunicação. O horário de trabalho é de segunda a sexta-feira, das 8h às 18h, com uma hora de almoço. O salário é de R$ 1.700,00 por mês. O contratado receberá vale-transporte, vale-refeição e plano de saúde.",
            "."
        ),
        requisitos = listOf(
            "Pontualidade", 
            "Saber fazer contas rapidamente", 
            "Ser educado (a) com clientes"
        ),
        beneficios = listOf(
            "Vale-transporte",
            "Vale-refeição",
            "Plano de saúde"
        ),
        atividades = listOf(
            "Atender cliente no caixa de seg a sab das 14h as 22h", 
            "Fazer fechamento e abertura de caixa", 
            "Abrir a loja"
        )
    ),
    VagaDescricao(
        id = 2,
        titulo = "Caixa",
        empresa = "Mercado Dia",
        tipoTrabalho = "Presencial",
        tipoContrato = "CLT", 
        salario = "R$ 1.900/mês",
        descricao = listOf(

            "O caixa de mercado é responsável por registrar as compras dos clientes, manusear pagamentos em dinheiro ou cartão, e fornecer um atendimento cordial. É essencial ter agilidade, atenção aos detalhes e habilidades de comunicação."
        ),
        requisitos = listOf(
            "Pontualidade", 
            "Agilidade",
            "Ser educado (a) com clientes"
        ),
        beneficios = listOf(
            "Vale Transporte",
            "Vale Refeição",
            "Plano de Saude"
        ),
        atividades = listOf(
            "Atender cliente no caixa de seg a sab das 14h as 22h", 
            "Fazer fechamento e abertura de caixa", 
            "Abrir a loja"
        )
    ),
    // Adicione mais descrições para os outros IDs...
    VagaDescricao(
        id = 3,
        titulo = "Auxiliar de serviços gerais",
        empresa = "Empresa XYZ",
        tipoTrabalho = "Presencial",
        tipoContrato = "CLT",
        salario = "R$ 1.600/mês",
        descricao = listOf(
            "Oportunidade para profissional organizado e com boa comunicação para atuar em serviços gerais na região central. "
        ),
        requisitos = listOf(
            "Experiência na função",
            "Disponibilidade de horário",
            "Ensino fundamental completo"
        ),
        beneficios = listOf(
            "Vale-transporte",
            "Vale-alimentação",
            "Convênio médico"
        ),
        atividades = listOf(
            "Limpeza e manutenção das áreas comuns",
            "Organização do ambiente de trabalho",
            "Apoio a equipe operacional"
        )
    ),
    VagaDescricao(
        id = 4,
        titulo = "Auxiliar de escritório",
        empresa = "Escritório Central",
        tipoTrabalho = "Híbrido",
        tipoContrato = "CLT",
        salario = "R$ 1.800/mês",
        descricao = listOf(
            "Oportunidade para profissional organizado e com boa comunicação para atuar em escritório na região central."
        ),
        requisitos = listOf(
            "Ensino médio completo",
            "Conhecimento básico de informática",
            "Boa comunicação"
        ),
        beneficios = listOf(
            "Vale-transporte",
            "Vale-refeição",
            "Seguro de vida"
        ),
        atividades = listOf(
            "Atendimento telefônico",
            "Organização de documentos",
            "Apoio administrativo geral",
            "Controle de agenda"
        )
    ),
    VagaDescricao(
        id = 5,
        titulo = "Assistente administrativo",
        empresa = "Empresa ABC",
        tipoTrabalho = "Presencial",
        tipoContrato = "CLT",
        salario = "R$ 2.000/mês",
        descricao = listOf(
            "Vaga para assistente administrativo com experiência em rotinas de escritório e bom conhecimento em Excel."
        ),
        requisitos = listOf(
            "Ensino superior cursando ou completo",
            "Experiência prévia na função",
            "Conhecimento avançado em Excel"
        ),
        beneficios = listOf(
            "Vale-transporte",
            "Vale-refeição",
            "Plano de saúde",
            "Plano odontológico"
        ),
        atividades = listOf(
            "Controle de planilhas",
            "Emissão de relatórios",
            "Arquivamento de documentos",
            "Suporte às áreas administrativas"
        )
    )
)


var vagasSalvas = mutableListOf<Int>()