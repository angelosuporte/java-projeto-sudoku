# Projeto Sudoku
Desenvolvendo para entrega do Desafio de Projeto Bootcamp Bradesco - Java Cloud Native

    class Jogo {
        -tabuleiro: Tabuleiro
        -jogador: Jogador
        +iniciarJogo(): void
        +resolverTabuleiro(): void
        +verificarVitoria(): bool
    }

    class Tabuleiro {
        -celulas[9][9]: Célula
        +preencherCelula(linha: int, coluna: int, valor: int): void
        +mostrarTabuleiro(): void
        +resetarTabuleiro(): void
    }

    class Célula {
        -valor: int
        -fixada: bool
        +getValor(): int
        +setValor(valor: int): void
        +isFixada(): bool
    }

    class Validador {
        +validarLinha(linha: int): bool
        +validarColuna(coluna: int): bool
        +validarBloco(bloco: int): bool
        +validarTabuleiro(): bool
    }

    class Jogador {
        -nome: string
        +fazerJogada(linha: int, coluna: int, valor: int): void
        +verificarEntrada(): bool
    }

    Jogo "1" --> "1" Tabuleiro: tem
    Jogo "1" --> "1" Jogador: tem
    Tabuleiro "9x9" --> "81" Célula: contém
    Tabuleiro "1" --> "1" Validador: usa
    Jogador "1" --> "1" Validador: usa
