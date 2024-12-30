import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int operacao;
        do {
            System.out.println("Escolha um operação:\n 1 - Adição \n 2 - Subtração \n 3 - Multiplicação \n 4 - Divisão");
            operacao = scanner.nextInt();
            if (operacao < 1 || operacao > 4) {
                System.out.println("Operação inválida. Numero deve estar entre 1 e 4");
            }
        } while(operacao < 1 || operacao > 4);

        System.out.println("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();
        System.out.println("Digite o segundo número: ");
        double num2 = scanner.nextDouble();
        if (operacao == 1) {
            double resultado = num1 + num2;
            System.out.println("Resultado: " + resultado);
        } else if (operacao == 2) {
            double resultado = num1 - num2;
            System.out.println("Resultado: " + resultado);
        } else if (operacao == 3) {
            double resultado = num1 * num2;
            System.out.println("Resultado: " + resultado);
        } else if (operacao == 4) {
            if (num2 != (double)0.0F) {
                double resultado = num1 / num2;
                System.out.println("Resultado: " + resultado);
            } else {
                System.out.println("Divisão por zero não permitida");
            }
        }

    }
}
