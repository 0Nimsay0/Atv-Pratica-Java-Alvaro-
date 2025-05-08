#  Sistema de Pagamentos - Java

Bem-vinda, desenvolvedora! 💜  
Este projeto foi criado com carinho para demonstrar o uso de **abstração** e **polimorfismo** na linguagem Java, através de um sistema de pagamentos semanal para diferentes tipos de funcionários.

##  Objetivo

Simular o cálculo de pagamentos em uma empresa, considerando dois tipos de funcionárias(os):

- **Assalariadas(os):** recebem um valor fixo por semana.
- **Horistas:** recebem com base nas horas trabalhadas e o valor por hora.

##  Funcionalidades

- Definição de uma classe abstrata `Funcionario` com métodos comuns.
- Implementação de subclasses `Assalariado` e `Horista` com regras próprias de pagamento.
- Utilização de **polimorfismo** para cálculo dos salários.
- Impressão de informações individuais de cada funcionária(o), tipo e valor do pagamento.

- ##  Estrutura do Projeto

```bash
src/
├── Funcionario.java        # Classe abstrata base
├── Assalariado.java        # Funcionário com salário fixo semanal
├── Horista.java            # Funcionário que recebe por hora trabalhada
└── Main.java               # Classe principal com execução do programa
