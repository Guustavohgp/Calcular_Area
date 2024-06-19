# Projeto Formas Geométricas

Este projeto consiste em uma aplicação Java para calcular a área de diferentes formas geométricas como círculo, quadrado, retângulo, trapézio e triângulo retângulo.

## Classes e Funcionalidades

### `Formas`

- Classe abstrata que serve como base para todas as formas geométricas.
- Define o método abstrato `area()` para calcular a área da forma.
- Sobrescreve o método `toString()` para fornecer uma representação em formato de string da forma.

### `Circulo`

- Representa um círculo.
- Possui um atributo `raio`.
- Implementa o método `area()` para calcular a área do círculo.
- Sobrescreve o método `toString()` para fornecer uma descrição do círculo, incluindo sua área.

### `Quadrado`

- Representa um quadrado.
- Possui um atributo `lado`.
- Implementa o método `area()` para calcular a área do quadrado.
- Sobrescreve o método `toString()` para fornecer uma descrição do quadrado, incluindo sua área.

### `Retangulo`

- Representa um retângulo.
- Possui atributos `largura` e `altura`.
- Implementa o método `area()` para calcular a área do retângulo.
- Sobrescreve o método `toString()` para fornecer uma descrição do retângulo, incluindo sua área.

### `Trapezio`

- Representa um trapézio.
- Possui atributos `baseMaior`, `baseMenor` e `altura`.
- Implementa o método `area()` para calcular a área do trapézio.
- Sobrescreve o método `toString()` para fornecer uma descrição do trapézio, incluindo sua área.

### `Triangulo retângulo`

- Representa um triângulo.
- Possui atributos `base` e `altura`.
- Implementa o método `area()` para calcular a área do triângulo.
- Sobrescreve o método `toString()` para fornecer uma descrição do triângulo, incluindo sua área.

### `CreateFormas`

- Classe utilitária para criar instâncias das formas geométricas com base em uma sigla fornecida.
- Define o método estático `createForma()` para criar a forma apropriada com base na sigla especificada.

### `Program`

- Classe principal que contém o método `main()` para execução da aplicação.
- Solicita ao usuário o número de formas a serem calculadas.
- Solicita ao usuário o tipo de cada forma e seus parâmetros.
- Calcula a área de cada forma e exibe os resultados.

## Como Executar

Para executar a aplicação, siga estas etapas:

1. Clone o repositório para sua máquina local.
2. Certifique-se de ter o Java Development Kit (JDK) instalado em seu sistema.
3. Navegue até o diretório raiz do projeto no terminal.
4. Compile os arquivos Java executando o comando `javac application/*.java entities/*.java`.
5. Execute a aplicação com o comando `java application.Program`.


Este README fornece uma visão geral das classes, métodos e funcionalidades do projeto. 


## Autor
Guustavohgp