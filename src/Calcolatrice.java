public class Calcolatrice {
    int somma(int a,int b) {
        return a+b;
    }
    double somma(double a, double b) {
        return a+b;
    }
    int somma(int a,int b,int c) {
       return a+b+c;
    }
    void stampaDettagli() {
        System.out.println("la somma è:" +somma(5,3));
        System.out.println("la somma è:" + somma(4.4,4.3));
        System.out.println("la somma e:" + somma(1,2,3));
    }
}
