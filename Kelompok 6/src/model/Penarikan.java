package model;
public class Penarikan extends Transaksi {

    public Penarikan(String Nominal, String UpdateSaldo, String IdTransaksi) {
        super(Nominal, UpdateSaldo, IdTransaksi);
    }

    public static void penarikan() {
        System.out.println("Saldo Berkurang");
    }

}
