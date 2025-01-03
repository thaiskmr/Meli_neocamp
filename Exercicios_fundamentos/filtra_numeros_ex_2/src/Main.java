import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> number = new ArrayList<>();

        System.out.println("Digite os numeros inteiros: ");
        while (true) {
            int numero = scanner.nextInt();
            if (numero <= 0){
                break;
            }
            number.add(numero);
        }
        //Impar + dobrar
        List<Integer> lista = new ArrayList<>();
        for (int num : number) {
            if (num % 2 != 0) {
                lista.add(num*2);
            }
        }


        Collections.sort(lista);

        System.out.println("Lista final: " + lista);

        scanner.close();
    }
}