package model;
import java.util.Date;

public class Penarikan extends Transaksi {

    public Penarikan(String nomorRekening, int Nominal, int UpdateSaldo, String IdTransaksi, Date Tanggal) {
        super(nomorRekening, Nominal, UpdateSaldo, IdTransaksi, Tanggal);
    }

    public static void penarikan() {
        System.out.println("Transaksi Berhasil dan Saldo Secara Otomatis akan Berkurang");
    }
    

}
