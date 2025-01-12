public class Studente {

    String nome;
    String cognome;
    int matricola;

    Studente(String nome, String cognome, int matricola) {
        this.nome = nome;
        this.cognome = cognome;
        this.matricola = matricola;

    }
    void stampaDettagli() {
        System.out.println("Nome:"+nome+"\nCognome:"+ cognome+"\nMatricola:"+ matricola);
    }
}