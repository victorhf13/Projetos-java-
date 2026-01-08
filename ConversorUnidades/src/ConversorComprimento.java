import java.util.Scanner;

public class ConversorComprimento {

    // reutilizando o scanner do main
    private Scanner scanner;
    public ConversorComprimento(Scanner scanner){
        this.scanner =scanner;
    }

    public void conversorComprimento(){

        System.out.println("Digite uma medida em metros");
        double Metros = scanner.nextDouble();
        double Centimetros = (Metros * 100);

        System.out.println(Metros+ "Metros" +" = " + Centimetros + "Centimetros");


    }
}
