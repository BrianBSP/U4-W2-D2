package es3;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class Rubrica {
    Map<String, String> rubrica = new HashMap<>();

    // inserisci un nuovo contatto
    public void aggiungiContatto(String nome, String numero) throws NullPointerException {
        this.rubrica.putIfAbsent(nome.toLowerCase(), numero);
    }

    // cancella un contatto
    public void rimuoviContatto(String nome) throws NullPointerException {
        this.rubrica.remove(nome.toLowerCase());
    }

    // cerca contatto tramite numero
    public String cercaContatto(String numero) throws NessunContattoException {
        Set<String> nomeContatti = this.rubrica.keySet();
        for (String nome : nomeContatti) {
            if (Objects.equals(this.rubrica.get(nome), numero)) {
                return nome;
            }
        }
        throw new NessunContattoException("Nessun contatto con questo numero!");
    }

    // cerca contatto tramite nome
    public String cercaContattoNome(String nome) throws NessunContattoException {
        String numero = this.rubrica.get(nome.toLowerCase());
        if (numero == null) {
            throw new NessunContattoException("Nessun contatto con questo numero.");
        }
        return numero;
    }

    // stampa tutti i contatti
    public void stampaContatti() {
        System.out.println("--------- RUBRICA ---------");
        Set<String> nomeContatti = this.rubrica.keySet();
        for (String nome : nomeContatti) {
            System.out.println("Nome: " + nome + " Numero: " + rubrica.get(nome));
        }
    }

}
