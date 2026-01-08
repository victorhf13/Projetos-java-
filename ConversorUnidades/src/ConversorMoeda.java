import java.util.Scanner;

public class ConversorMoeda {


    private Scanner scanner;
    public ConversorMoeda(Scanner scanner){
        this.scanner =scanner;
    }


    public void conversorMoeda(){

        System.out.println("Digite o valor em reais: ");
        double Reais = scanner.nextDouble();
        double Dolar = (Reais * 5.00);

        System.out.println(Reais +"R$"+" = "+Dolar+ "$");

    }
}

