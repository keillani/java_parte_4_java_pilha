package aula_05;

public class TesteContaComExcecaoChecked {
    public static void main(String[] args) {
        Conta c = new Conta();
        try{
            c.deposita();
        } catch (MinhaExcecao ex){
            System.out.println("tratamento ...");
        }
    }
}
