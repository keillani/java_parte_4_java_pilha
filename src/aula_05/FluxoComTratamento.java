package aula_05;

//pilha de execução = first in last out

public class FluxoComTratamento {

    public static void main(String[] args) {
        System.out.println("Ini do main");
        try{
        metodo1();
        } catch (Exception ex){ //catch genérico, capturando qq exceção
            String msg = ex.getMessage();
            System.out.println("Exception: "+ msg);
            ex.printStackTrace();
        }
        System.out.println("Fim do main");
    }

//    private static void metodo1(){ //unchecked
    private static void metodo1() throws MinhaExcecao { //checked
        System.out.println("Ini do metodo1");
        metodo2();
        System.out.println("Fim do metodo1");
    }
//    private static void metodo2() //unchecked
    private static void metodo2() throws MinhaExcecao { //checked
        System.out.println("Ini do metodo2");


        throw new MinhaExcecao("Deu muito errado"); //atribuir uma mensagem à exceção

//        System.out.println("Fim do metodo2");
    }
}
