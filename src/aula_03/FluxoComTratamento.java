package aula_03;

//pilha de execução = first in last out

import aula_02.Conta;

public class FluxoComTratamento {

    public static void main(String[] args) {
        System.out.println("Ini do main");
        metodo1();
        System.out.println("Fim do main");
    }

    private static void metodo1() {
        System.out.println("Ini do metodo1");
        metodo2();
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() {
        System.out.println("Ini do metodo2");

//Como lançar exceções
//        ArithmeticException exception = new ArithmeticException();
//        throw exception;
//         ou
        throw new ArithmeticException("Deu erro dentro método 2"); //atribuir uma mensagem à exceção

//        System.out.println("Fim do metodo2");
    }
}
