# Projeto Sudoku
Desenvolvendo para entrega do Desafio de Projeto Bootcamp Bradesco - Java Cloud Native

   ```mermaid
graph TD;
    A[Início] --> B{Verificar se há células preenchidas};
    B -->|Sim| C[Preencher números lógicos];
    B -->|Não| D[Escolher número para preencher];
    C --> E{Verificar regras};
    D --> E;
    E -->|Regras violadas| F[Voltar e tentar outro número];
    E -->|Regras OK| G{Sudoku completo?};
    F --> B;
    G -->|Sim| H[Fim];
    G -->|Não| C;
    H --> I[Parabéns!];

```
