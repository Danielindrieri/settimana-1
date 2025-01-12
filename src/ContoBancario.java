public class ContoBancario {

    String numeroConto;
    double saldo;

    ContoBancario(String numeroConto, double saldo) {
        this.numeroConto = numeroConto;
        this.saldo = saldo;
    }
    public String getNumeroConto() {
        return numeroConto;
    }
    public void setNumeroConto(String numeroConto) {
        this.numeroConto = numeroConto;
    }
    public double getSaldo() {
        return saldo ;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    void deposita(double importo) {
        if (importo > 0) {
        saldo += importo;
            System.out.println("Importo versato con successo \n" + saldo);
        }else {
            System.out.println("Importo da depositare deve essere positivo");
        }
    }
    void preleva(double importo) {
        if (importo > 0 && importo <= saldo) {
        saldo -= importo;
            System.out.println("prelievo effettuato con successo \nNuovo saldo:" + saldo);
        }else if(importo > saldo) {
            System.out.println("Errore:saldo insufficente\n" + importo);
        }
    }
    void stampaDettagli() {
        System.out.println("NumeroConto:" +numeroConto +"\nSaldo:"+saldo + "$");
    }
}
