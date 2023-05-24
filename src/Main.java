public class Main {
    public static void main(String[] args) {
        Icarros renault = new Renault(2019, 60.00, "Preto", 4);
        System.out.println(" Carro 1 " );
        System.out.println(renault.Marca + " ano  " +renault.Ano + " Valor " + renault.Valor + " Mil, Cor " + renault.Cor + " "+ renault.Portas + " portas ");


        System.out.println(" Iniciando o motor ... minha velocidade esta em " + renault.Velocidade+ "Km/h");
        renault.acelerar();
        System.out.println(" Acelerando... minha velocidade esta em... " + renault.Velocidade +"Km/h");
        renault.frear();
        System.out.println("Freando... minha velocidade esta em " +renault.Velocidade+ "Km/h");
        renault.acelerar();
        System.out.println("Acelerando... minha velocidade esta em " + renault.Velocidade+ "Km/h");


        System.out.println("-----------------------------------------------------------");



        Icarros fiat = new fiat("fiat",2020, 15.00, "Vermelho", 3);
        System.out.println(" Carro 2 " );
        System.out.println(fiat.Marca + " ano  " +fiat.Ano + " Valor " + fiat.Valor + " Mil, Cor " + fiat.Cor + " "+ fiat.Portas + " portas ");


        System.out.println(" Iniciando o motor ... minha velocidade esta em " + fiat.Velocidade + "Km/h");
        fiat.acelerar();

        System.out.println(" Acelerando... minha velocidade esta em... " + fiat.Velocidade+ "Km/h");
        fiat.frear();

        System.out.println("Freando... minha velocidade esta em " +fiat.Velocidade+ "Km/h");

        System.out.println("-----------------------------------------------------------");


        Icarros hyundai = new Hyundai("Hyundai", 2000, 12.000, "Branco", 4);
        System.out.println(" Carro 3 " );
        System.out.println(hyundai.Marca + " ano  " +hyundai.Ano + " Valor " + hyundai.Valor + " Mil, Cor " + hyundai.Cor + " "+ hyundai.Portas + " portas ");


        System.out.println(" Iniciando o motor ... minha velocidade esta em " + hyundai.Velocidade+ "Km/h");
        hyundai.acelerar();

        System.out.println(" Acelerando... minha velocidade esta em... " + hyundai.Velocidade+ "Km/h");
        hyundai.frear();

        System.out.println("Freando... minha velocidade esta em " +hyundai.Velocidade+ "Km/h");

    }
}