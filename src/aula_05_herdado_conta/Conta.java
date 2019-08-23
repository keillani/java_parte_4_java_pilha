package aula_05_herdado_conta;

//Classe abstract: Não podem ser instanciadas. Para instanciar, devemos criar primeiro uma classe filha não abstrata.
public abstract class Conta {

    protected double saldo; //público para si e para os filhos
    private int agencia;
    private int numero;
    private Cliente titular;
    private static int total = 0;

    //construtor específico
    //Os construtores pertencem somente à sua própria classe. Os construtores não são herdados.
    public Conta(int agencia, int numero){
        Conta.total++;
        //System.out.println("O total de contas é " + Conta.total);
        this.agencia = agencia;
        this.numero = numero;
        //this.saldo = 100;
        System.out.println("Estou criando uma conta " + this.numero);
    }

    //O construtor default do java deixa de existir a partir do momento que algum é declarado na classe.
    //construtor padrão
    public Conta (){

    }

//    public void deposita(double valor) {
//        this.saldo = this.saldo + valor;
//    }

    //classes filhas deverão implementar esse método
    public abstract void deposita(double valor);

    public void saca(double valor) throws SaldoInsuficienteException{
        if(this.saldo < valor) {
            throw new SaldoInsuficienteException("Saldo: "+ this.saldo +", Valor: "+ valor);
        }

        this.saldo -= valor;
    }

    public void transfere(double valor, Conta destino) throws SaldoInsuficienteException {
        this.saca(valor);
        destino.deposita(valor);
    }

    public double getSaldo(){
        return this.saldo;
    }

    public int getNumero(){
        return this.numero;
    }

    public void setNumero(int numero){
        if(numero <= 0) {
            System.out.println("Nao pode valor menor igual a 0");
            return;
        }
        this.numero = numero;
    }

    public int getAgencia(){
        return this.agencia;
    }

    public void setAgencia(int agencia){
        if(agencia <= 0) {
            System.out.println("Nao pode valor menor igual a 0");
            return;
        }
        this.agencia = agencia;
    }

    public void setTitular(Cliente titular){
        this.titular = titular;
    }

    public Cliente getTitular(){
        return this.titular;
    }

    public static int getTotal(){
        return Conta.total;
    }

}