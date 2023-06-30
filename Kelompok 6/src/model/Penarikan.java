package model;

public class Penarikan extends Transaksi {

    public Penarikan(String Nominal, int UpdateSaldo, String IdTransaksi, String date) {
        super(Nominal, UpdateSaldo, IdTransaksi, date);
    }

    public static void penarikan() {
        System.out.println("Saldo Berkurang");
    }
    

}
