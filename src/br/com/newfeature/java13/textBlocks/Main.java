package br.com.newfeature.java13.textBlocks;

public class Main {



    public static void main(String[] args) {

        // exemplo de concatenação do tipo antigo..
        System.out.println("*** modo antigo de concat text ***");
        String sql1 = "update products " +
                           " SET quantity = ?" +
                           " modifyDate = ? " +
                           " modifyBy = ? " +
                      " WHERE product_id = ? ";

        System.out.println(sql1);

        System.out.println("*** Novo Text Blocks 0 String Literal ***");
        // novo text Blocks - String Literal
        String sql2 = """
                      update products
                         SET quantity = ?
                             modifyDate = ?
                             modifyBy = ?
                      WHERE product_id = ?
                """;

        System.out.println(sql2);



    }


}
