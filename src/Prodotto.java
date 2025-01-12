public class Prodotto {
        String Nome;
        double Prezzo;
        int Quantita;

        Prodotto(String Nome, double Prezzo, int Quantita) {
            this.Nome = Nome;
            this.Prezzo = Prezzo;
            this.Quantita = Quantita;
        }
        //          Per recuperare Nome e settarlo
        public String getNome() {
            return Nome;
        }
        public void setNome(String nome) {
            this.Nome = nome;
        }

        //          Per recuperare Prezzo e settarlo
        public double getPrezzo() {
            return Prezzo;
        }
         public void setPrezzo(double prezzo) {
            this.Prezzo = prezzo;
         }

        //          Per recuperare Quantita e settarlo
        public int getQuantita() {
            return Quantita;
        }
        public void setQuantita(int quantita) {
            if(quantita >= 0) {
                this.Quantita = quantita;
            } else {
                System.out.println("Errore:Quantita non puo essere negativa");
            }
        }

        void stampaDettagli() {
            System.out.println("articolo:"+ Nome+"\nPrezzo:"+ Prezzo+"$"+"\nQuantita disponibile:"+Quantita);
        }
}
