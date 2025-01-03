import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [][] matriz = new int[3][3];
        int soma = 0;
        int [] somaLinha = new int[3];

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
            System.out.println("Digite o valor " + (j+1) + " da linha " + (i+1) + ": ");
            matriz[i][j] = scanner.nextInt();
        }}

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                soma += matriz[i][j];
                somaLinha[i] += matriz[i][j];
            }
        }
        System.out.println("A soma dos itens da matriz é: " + soma);

        for (int i = 0; i < 3; i++) {
            System.out.println("Soma do itens da linha " + (i+1) + ": " + somaLinha[i]);

        }
    }
}