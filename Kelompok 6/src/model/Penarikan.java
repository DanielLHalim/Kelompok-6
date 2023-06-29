package model;

public class Penarikan extends Transaksi {

    public Penarikan(String Nominal, String UpdateSaldo, String IdTransaksi, String Date, String Saldo) {
        super(Nominal, UpdateSaldo, IdTransaksi, Date);
    }

    public void saldo(){
        System.out.println("Zombie Jalan!!!");

    }

    public static void penarikan() {
        System.out.println("Saldo Berkurang");
    }
    

}
