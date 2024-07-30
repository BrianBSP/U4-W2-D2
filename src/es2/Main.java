package es2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("----------- Esercizio 2 ------------");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci un numero N: ");
        int num = Integer.parseInt(scanner.nextLine());
        // primo metodo
        System.out.println("Lista Ordinata:\n" + listaCasuale(num));
        // secondo metodo
        System.out.println("Lista inversa:\n" + listaInversa(listaCasuale(num)));
        // terzo  metodo
        boolean pari = true;
        boolean dispari = false;
        System.out.println("Pari o Dispari?\n");
        pariDispari(listaCasuale(num), pari);

        scanner.close();
    }

    public static List<Integer> listaCasuale(int num) {
        Random random = new Random();
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            int n = random.nextInt(0, 100);
            numbers.add(n);
        }
        Collections.sort(numbers);

        return numbers;
    }

    public static List<Integer> listaInversa(List<Integer> listaNumeri) {
        List<Integer> nuovaLista = new ArrayList<>(listaNumeri);
        List<Integer> inversa = new ArrayList<>(listaNumeri);
        Collections.reverse(inversa);
        nuovaLista.addAll(inversa);
        return nuovaLista;
    }

    public static void pariDispari(List<Integer> listaNumeri, boolean booleano) {
        if (booleano) {
            System.out.println("Stampa delle posizioni PARI:");
            for (int i = 0; i < listaNumeri.size(); i += 2) {
                System.out.println(listaNumeri.get(i) + " ");
            }
        } else {
            System.out.println("Stampa delle posizioni DISPARI: ");
            for (int i = 0; i < listaNumeri.size(); i += 2) {
                System.out.println(listaNumeri.get(i) + " ");
            }
        }
    }
}
