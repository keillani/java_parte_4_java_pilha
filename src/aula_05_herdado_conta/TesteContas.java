package aula_05_herdado_conta;

public class TesteContas {
    public static void main(String[] args) throws SaldoInsuficienteException{

        ContaCorrente cc = new ContaCorrente(111,111);
        cc.deposita(100.0);

        ContaPoupanca cp = new ContaPoupanca(222, 222);
        cp.deposita(200);


        cc.transfere(101.0, cp);

        System.out.println("CC: " + cc.getSaldo());
        System.out.println("CP: " + cp.getSaldo());
    }
}
