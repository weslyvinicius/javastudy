package br.com.newfeature.java12.StringTransform;

public class Main {

    public static void main(String[] args) {

        System.out.println("*** String new metodo Transform ***");
        String resultado = "Ola "
                .transform( s -> s + ", Mundo!!\n")
                .transform( s -> s + "New Featue Java 12 ");
        System.out.println(resultado);

        resultado = resultado.transform(String::toUpperCase);
        System.out.println(resultado);



    }
}
