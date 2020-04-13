package br.com.newfeature.java12.StringIndent;

public class Main {

    public static void main(String[] args) {

        System.out.println("*** String sem Indent ***");
        String resultado = "Ola \nMundo..";
        System.out.println(resultado);

        System.out.println("*** String com Indent ***");
        resultado = "Ola \nMundo..".indent(3); // quantidade de espaço para identação;
        System.out.println(resultado);



    }
}
