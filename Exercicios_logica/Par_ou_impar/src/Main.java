import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numbero inteiro: ");
        int number = scanner.nextInt();

        if(number % 2 == 0){
            System.out.println("O numero " + number + " é par.");
        } else {
            System.out.println("O numero " + number + " é impar.");
        }
        scanner.close();
    }
}