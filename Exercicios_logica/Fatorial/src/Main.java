import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número para calcular o fatorial: ");
        int number = scanner.nextInt();

        if (number > 0) {
            long fatorial = 1;
            for (int i = 1; i <= number; i++) {
                fatorial *= i;

            }
            System.out.println("O fatorial de " + number + " é " + fatorial);
        } else {
            System.out.println("O fatorial não pode ser de numero negativo");
        }
        scanner.close();
    }
}