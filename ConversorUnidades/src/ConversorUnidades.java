import java.util.Scanner;

public class ConversorUnidades {

    public static void main(String[] args){
         Scanner scanner = new Scanner(System.in);

         //criando objetos!
        ConversorTemperatura ct = new ConversorTemperatura(scanner);
        ConversorMoeda cm = new ConversorMoeda(scanner);
        ConversorComprimento cc = new ConversorComprimento(scanner);

         int opcao;

         //Escolha a opção que vai querer usar

         do{
             System.out.println("1 Conversor de Unidades");
             System.out.println(" ");
             System.out.println("Escolha uma opção: ");
             System.out.println("Digite 0 para sair.");
             System.out.println("1 temperatura");
             System.out.println("2 Moeda");
             System.out.println("3 Comprimento");
             opcao = scanner.nextInt();

             //leva caso para sua ação
             switch (opcao){
                 case 1:
                     ct.ConversorTemperatura();
                     break;
                 case 2:
                     cm.conversorMoeda();
                     break;
                 case 3:
                     cc.conversorComprimento();
                     break;
                 case 0:
                     System.out.println("encerrando o programa !");
                     break;
                 default:

             }

         }while (opcao !=0);
        }
    }


