# Estruturas Excepcionais

Exceções: fluxo inesperado da aplicação. Mesmo quando ocorre, a aplicação tenta se redirecionar.

Em Java, um erro é algo irreparável, travando ou encerrando drasticamente a aplicação. Já exceções são fluxos inesperados.

## Exceções Mapeadas

- _java.lang.NullPointerException_: Obter informação de uma variável nula.
- _java.lang.ArithmeticException_: Dividir por zero.
- _java.sql.SQLException_: Erro na interação com banco de dados.
- _java.io.FileNotFoundException_: Ler ou escrever em um arquivo não existente.

## Tratamento de Exceções

- `try`: Definir um bloco de código para ser testado;
- `catch`: Definir um bloco de código a ser executado caso ocorra erro no `try` (precisa saber qual exceção);
- `finally`: Definir um bloco de código a ser executado, independentemente de ocorrer um erro ou não;

        try {
            ...
        } catch (Exception e) {
            ...            
        }

## Hierarquia das Exceções

A linguagem Java dispõe de uma variedade de classes que representam exceções, estas classes são organizadas em uma hierarquia entre _Checked_ e _Unchecked Exceptions_ (Risco de serem chamadas).

- Serializable
  - Throwable
    - Exception
      - RuntimeException
        - IllegalArgumentException
          - NumberFormatException

## Exceções customizadas

São criadas ao herdar (`extends`) de `Exception`.

`public class CepInvalidoException extends Exception {}`
