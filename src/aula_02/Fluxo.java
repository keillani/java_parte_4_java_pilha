package aula_02;

//pilha de execução = first in last out

public class Fluxo {

    public static void main(String[] args) {
        System.out.println("Ini do main");

        //blocos try-catch
        try{
        metodo1();
        } catch (ArithmeticException| NullPointerException ex){
            String msg = ex.getMessage();
            System.out.println("Exception" + msg);
            ex.printStackTrace(); //rastro de exceções
        }

        System.out.println("Fim do main");
    }

    private static void metodo1() {
        System.out.println("Ini do metodo1");
//        try{
        metodo2();
//        } catch (ArithmeticException ex){
//            String msg =ex.getMessage();
//            System.out.println("Exception:" +msg);
//            ex.printStackTrace();
//        }

        System.out.println("Fim do metodo1");
    }

    private static void metodo2() {
        System.out.println("Ini do metodo2");
        for(int i = 1; i <= 5; i++) {
            System.out.println(i);
//            int a = i/0; //divisão por zero
            Conta c = null;//referência nula
            c.deposita();
        }
        System.out.println("Fim do metodo2");
    }
}
