abstract class Forma {
    String colore;

    protected Forma(String colore) {
       this.colore = colore;
   }
   abstract double calcolaArea();

   void stampaColore() {
       System.out.println("Colore:" + colore);
   }
}

