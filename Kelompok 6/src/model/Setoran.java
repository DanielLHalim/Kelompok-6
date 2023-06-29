package model;

public class Setoran extends Transaksi {

    public Setoran(
        String Nominal, 
        String UpdateSaldo, 
        String IdTransaksi, 
        String Date) {
        super(Nominal, UpdateSaldo, IdTransaksi, Date);
    }

    public static void setoran() {
        System.out.println("Saldo Bertambah");

    }

}
