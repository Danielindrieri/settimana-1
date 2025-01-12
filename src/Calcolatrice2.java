public class Calcolatrice2 {
    int somma(int a, int b) {
        return a + b;
    }

    int moltiplicazione(int a, int b) {
        return a * b;
    }

    int sottrazione(int a, int b) {
        return a - b;
    }

    double divisione(int a, int b) {
        if (b != 0) {
            return (double) a / b;
        } else {
            System.out.println("Errore:divisione per zero non consentita");
            return 0;
        }
    }

    void stampaDettagli(int a, int b) {
        System.out.println("La somma è: " + somma(a, b));
        System.out.println("La sottrazione è: " + sottrazione(a, b));
        System.out.println("La moltiplicazione è: " + moltiplicazione(a, b));
        System.out.println("La divisione è: " + divisione(a, b));
    }
}
