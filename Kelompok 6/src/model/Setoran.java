package model;
import java.util.Date;

public class Setoran extends Transaksi {

    // public Setoran(String nomorRekening, long saldo, int nominal, int updateSaldo, String idTransaksi, Date tanggal) {
    //     super(nomorRekening, 0, nominal, updateSaldo, idTransaksi, tanggal);
    // }


    public Setoran(String nomorRekening, long saldo, long nominal, long updateSaldo1, String idTransaksi1,
            Date tanggalDate1) {
                super(nomorRekening, 0, nominal, updateSaldo1, idTransaksi1, tanggalDate1);
    }


    public static void setoran() {
        System.out.println("Transaksi Berhasil dan Saldo Secara Otomatis akan Bertambah");
    }
}