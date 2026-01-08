
import java.util.Scanner;

public class ConversorTemperatura {


    private Scanner scanner;
    public ConversorTemperatura(Scanner scanner){
this.scanner =scanner;
}

public void ConversorTemperatura(){

        System.out.println("Digite a temperatura em Celsius: ");
        double Celsius = scanner.nextDouble();
        double Fahrenheit = (Celsius * 9/5)+32;
        System.out.println(Celsius + "°C" +" = "+Fahrenheit +"°F");

}


}
