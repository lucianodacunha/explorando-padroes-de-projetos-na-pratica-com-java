# Explorando Padrões de Projetos na Prática com Java

## Tópicos abordados

- Padrões de Projeto
- Praticando com Java puro
- Praticando com Spring
- Desafio

## Padrões de Projeto 

- soluções para problemas recorrentes
- criacionais: principal objeto a criação de objetos
- comportamentais: relação com a definição de certos comportamentos
- estruturais: orquestra a apresentar de dados
- Singleton: instância única de uma classe
- Strategy: variações de um algoritmo que respeita uma interface
- Facade: abstrai a complexidade de uma integração interna

## Projetos

### Padrões de Projeto com Java Puro

Implementação de dois padrões de projeto, `singleton`, `facade` e `strategy`, utilizando Java puro.

### Como utilizar

- Requisito: Java 11
- Baixe o projeto 
- Importe ou abra utilizando o Intellij
- Execute a classe Main.java, existente em cada pacote com o nome do padrão de projeto.

```
├── facade
│   ├── Main.java
│   ├── SistemaEletrico.java
│   ├── SistemaFacade.java
│   ├── SistemaHidraulico.java
│   └── SistemaMecanico.java
├── singleton
│   ├── Main.java
│   └── SingletonLazy.java
└── strategy
    ├── Action.java
    ├── Fly.java
    ├── Main.java
    ├── Move.java
    ├── Run.java
    └── Vehicle.java

```

### Padrões de Projeto com Java Spring

Projeto com implementação de uma API, cliente e documentação, que demonstra como o Spring implementa padrões de projetos em sua estrtutura.

### Como utilizar

- Requisito: Java 11
- Baixe o projeto 
- Importe ou abra utilizando o Intellij
- Atualize as dependências do Maven.
- Inicie a aplicação/servidor.
- Acesse o endereço [http://localhost:8080/swagger-ui/index.html](http://localhost:8080/swagger-ui/index.html)