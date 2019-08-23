package aula_06;

public class TesteConexao {
    public static void main(String[] args) {
//        Conexao con = null;
//     try{
//        con = new Conexao();
//        con.leDados();
//        con.fecha();

        //try-with-resources: o finally é criado automaticamente e o recurso precisa implementar o método close
        try (Conexao conexao= new Conexao()){
            conexao.leDados();
        }
      catch (IllegalStateException ex){
         System.out.println("Deu erro na conexao");
//         con.fecha();
     }
//     finally { //bloco opcional que podemos colocar no final e que sempre será executado, com ou sem erro
//         System.out.println("finally");
//         if(con != null) {
//             con.close();
//         }
//     }
    }
}
