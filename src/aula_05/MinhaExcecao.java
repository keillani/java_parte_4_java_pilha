package aula_05;

//public class MinhaExcecao extends RuntimeException { //unchecked
public class MinhaExcecao extends Exception { //checked
    //construtor
    public MinhaExcecao(String message) {
        super(message);
    }
}
