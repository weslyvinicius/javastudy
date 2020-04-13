package br.com.newfeature.inicializacaoJava;

public class Main {

    public static void main(String[] args) {

        System.out.println("##### Inicilização da Classe #####");

        Carro c1 = new Carro("BMW", 280);
        Carro c2 = new Carro("Ferrari", 260);
        Carro c3 = new Carro("Masserati", 270);

        System.out.println("##### Finalizando Classe #####");

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

    }

}
