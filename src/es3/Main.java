package es3;

public class Main {
    public static void main(String[] args) {
        Rubrica rubrica = new Rubrica();
        // creata rubrica
        rubrica.aggiungiContatto("Aldo", "3209595999");
        rubrica.aggiungiContatto("Giovanni", "3209595998");
        rubrica.aggiungiContatto("Giacomo", "3209595997");
        rubrica.aggiungiContatto("Ajeje", "3209595996");
        rubrica.aggiungiContatto("DonGenovese", "3209595995");
        rubrica.aggiungiContatto("LaZiaDiDonGenovese", "3209595994");

        // stampa contatti
        rubrica.stampaContatti();

        // cancella contatto
        rubrica.rimuoviContatto("dongenovese");
        rubrica.stampaContatti();

        // cerca contatto tramite numero
        System.out.println("--------------------");
        try {
            System.out.println("Il numero di Giovanni è: " + rubrica.cercaContattoNome("giovanni"));
        } catch (NessunContattoException e) {
            System.out.println(e.getMessage());
        }
        // cerca contatto tramite nome
        System.out.println("--------------------");
        try {
            System.out.println("Il numero cercato è di: " + rubrica.cercaContatto("3209595997" +
                    ""));
        } catch (NessunContattoException e) {
            System.out.println(e.getMessage());
        }

    }
}
