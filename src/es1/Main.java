package es1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // utilizzato List per i duplicati
        List<String> paroleDuplicate = new ArrayList<>();

        Set<String> paroleDistinte = new HashSet<>();

        System.out.println("Inserisci un numero N: ");
        int num = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < num; i++) {
            System.out.println("Inserisci " + (num - i) + " parole");
            String parola = scanner.nextLine();
            // se la parola è gia presente in paroleDistinte, aggiungila a paroleDuplicate
            if (!paroleDistinte.add(parola)) {
                paroleDuplicate.add(parola);
            }
        }
        // stampa parole duplicate
        for (String parola : paroleDuplicate) {
            System.out.println("Le parole duplicate sono: " + parola);
        }
        // stampa il numero di paroleDistinte
        System.out.println("Numero di parole distinte: " + paroleDistinte.size());

        // stampa elenco di paroleDistinte
        System.out.println("Elenco parole distinte: ");
        for (String parola : paroleDistinte) {
            System.out.println(parola);
        }

    }
}