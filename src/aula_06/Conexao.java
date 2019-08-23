package aula_06;

public class Conexao implements AutoCloseable{
    public Conexao() {
        System.out.println("Abrindo conexao");
//        throw new IllegalStateException(); não será mais necessário pois o médoto close retorna exception
    }

    public void leDados() {
        System.out.println("Recebendo dados");
        throw new IllegalStateException();
    }

    @Override
    public void close() {
        System.out.println("Fechando conexao");
    }
}
