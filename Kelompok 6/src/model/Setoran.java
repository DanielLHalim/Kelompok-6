package model;
public class Setoran extends Transaksi {

    public Setoran(String Nominal, String UpdateSaldo, String IdTransaksi) {
        super(Nominal, UpdateSaldo, IdTransaksi);

    }

    public static void setoran() {
        System.out.println("Saldo Bertambah");

    }

}
