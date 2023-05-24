public class Renault extends Icarros{

    public Renault (int Ano, double Valor,  String Cor, int Portas){
        super("Renault", 2019, 60.00 , "Preto", 4 );
        this.Velocidade = 0;

    }

    @Override
    public void partida() {
        System.out.println(" A minha velocidade esta em " + Velocidade) ;
    }

    @Override
    public void acelerar() {
        Velocidade +=10;

    }

    @Override
    public void frear() {
        Velocidade -=5;

    }
}
