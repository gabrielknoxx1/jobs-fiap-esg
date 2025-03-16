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
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nam nec tortor in lectus cursus luctus et at purus. Interdum et malesuada fames ac ante ipsum primis in faucibus."
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
        salario = "R$ 1.700/mês",
        descricao = listOf(
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nam nec tortor in lectus cursus luctus et at purus. Interdum et malesuada fames ac ante ipsum primis in faucibus. Morbi eget magna sit amet dolor condimentum convallis."
        ),
        requisitos = listOf(
            "Pontualidade", 
            "Saber fazer contas rapidamente", 
            "Ser educado (a) com clientes"
        ),
        beneficios = listOf(
            "Benefício 1",
            "Benefício 2",
            "Benefício 3"
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
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nam nec tortor in lectus cursus luctus et at purus."
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