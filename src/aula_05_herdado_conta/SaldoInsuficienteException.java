package aula_05_herdado_conta;

public class SaldoInsuficienteException extends Exception{//checked
    public SaldoInsuficienteException(String msg){
        super(msg);
    }
}
