package model;
import model.Setoran;
import model.Penarikan;
import model.Transaksi;

public class Main {
    public static void main(String[] args) throws Exception {
        Transaksi[] Transaksi = { new Setoran(null, null, null) };
        for (Transaksi Transaksi2 : Transaksi) {
            Transaksi2.deposit();
        }
        Setoran deposit = new Setoran(null, null, null);
        deposit.getUpdateSaldo();
        deposit.setoran();
        Transaksi[2].deposit();

        Penarikan penarikan = new Penarikan( null, null, null);
    }
}
