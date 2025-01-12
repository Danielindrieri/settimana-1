public class Rettangolo extends Forma {
double altezza;
double base;

    Rettangolo(String colore,double altezza,double base) {
        super(colore);
        this.altezza = altezza;
        this.base = base;
    }

    @Override
   double calcolaArea() {
    return base*altezza;
}
}
