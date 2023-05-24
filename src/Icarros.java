public abstract class Icarros {
    protected String Marca;
    protected int Ano;
    protected double Valor;
    protected String Cor;
    protected int Portas;
    protected int Velocidade;

    public Icarros(String marca, int ano, double valor, String cor, int portas) {
        this.Marca = marca;
        this.Ano = ano;
        this.Valor = valor;
        this.Cor = cor;
        this.Portas = portas;

    }

    public void partida(){
        System.out.println(" Iniciando o motor ... minha velocidade esta em ");
    }
    public void frear(){
        System.out.println(" Freando ... minha velocidade esta em ... " );
    }

    public void acelerar(){
        System.out.println(" Acelerando ... minha velocidade esta em ");
    }
}
