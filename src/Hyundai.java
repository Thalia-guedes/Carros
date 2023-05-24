public class Hyundai extends Icarros{
    public Hyundai(String marca, int ano, double valor, String cor, int portas) {
        super("Hyundai", 2000, 12.000, "Branco", 4);
        this.Velocidade =5;
    }
    @Override
    public void partida() {
        System.out.println(" A minha velocidade esta em " + Velocidade) ;
    }

    @Override
    public void frear() {
        Velocidade -=2;
    }

    @Override
    public void acelerar() {
        Velocidade +=15;
    }
}
