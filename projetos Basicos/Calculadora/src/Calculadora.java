import java.util.Scanner;

public class  Calculadora {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro Numero: ");
        double num1 = scanner.nextDouble();

        System.out.print("Digite o segundo numero: ");
        double num2 = scanner.nextDouble();

        System.out.println("Escolha a operação: ");
        System.out.println("+ Soma");
        System.out.println("- subtração");
        System.out.println("* multiplicação");
        System.out.println("/ divisão");

        char operacao = scanner.next().charAt(0); //usado para posssibilitar a escolha do operador
        double resultado = 0;
        boolean operacaoValidada = true;

        // poderia utilizar a linha de codigo (operacaoValida = true;) para os casos verdadeiros, mas não é necessario
        switch (operacao) {
            case '+':
                resultado = num1 + num2;
                break;

            case '-':
                resultado = num1 - num2;
                break;
            case '*':
                resultado = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    resultado = num1 / num2;
                } else {
                    System.out.println("Erro: divisão por 0 não é permitida. ");
                    operacaoValidada = false;
                }
                break;

            default:
                System.out.println("Operação invalida !");
                operacaoValidada = false;
        }
        if (operacaoValidada) {
            System.out.println("Resultado: " + resultado);
        }

        scanner.close();
    }

}

//calculadora simples !!