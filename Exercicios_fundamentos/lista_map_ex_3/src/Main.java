import java.util.*;
public class Main {
    public static void main(String[] args) {
        Map<String, Integer> listaNomes = new HashMap<>();
        //System.out.println("Insira nome e idade: ");
        listaNomes.put("Pedro", 20);
        listaNomes.put("Marcos", 32);
        listaNomes.put("Alice", 46);
        listaNomes.put("José", 35);
        listaNomes.put("Ana", 38);
        listaNomes.put("Lucas", 40);
        listaNomes.put("Beatriz", 50);
        listaNomes.put("Maria", 25);

        Set<String> maiores30 = new TreeSet<>();
        for (String value : listaNomes.keySet()) {
            if (listaNomes.get(value) > 30) {
                maiores30.add(value);
            }
        }
        System.out.println("Os maiores de 30 anos são: " + maiores30);
    }
}