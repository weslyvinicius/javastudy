package br.com.newfeature.inicializacaoJava;

public class Carro {

    private String modelo;

    private int velocidadeMaxima;

    private static int limiteVelocidade = 240;

    static {
        System.out.println("Inicializando bloco de inicialização static da classe");
    }

    {
        System.out.println("Inicializando bloco de inicialização");
    }

    public Carro(){
        System.out.println("Inicialização do Construtor Vazio");
    }

    public Carro(String modelo, int velocidadeMaxima) {
        System.out.println("Inicialização do Construtor com Parametros");
        this.modelo = modelo;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(int velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "modelo='" + modelo + '\'' +
                ", velocidadeMaxima=" + velocidadeMaxima +
                ", limiteVelocidade=" + Carro.limiteVelocidade +
                '}';
    }
}
