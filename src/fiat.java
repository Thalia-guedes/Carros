public class fiat extends Icarros{


    public fiat(String marca, int ano, double valor, String cor, int portas) {
        super("Fiat", 2015, 15.000, "vermelho", 3);
        this.Velocidade = 3;
    }

    @Override
    public void partida() {
        System.out.println(" A minha velocidade esta em " + Velocidade) ;
    }

    @Override
    public void frear() {
        Velocidade -=5;
    }

    @Override
    public void acelerar() {
        Velocidade +=12;
    }
}
