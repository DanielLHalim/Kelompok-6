package model;
import java.util.Date;

public class Penarikan extends Transaksi{

    // public Penarikan(String nomorRekening, long saldo, int Nominal, int UpdateSaldo, String IdTransaksi, Date Tanggal) {
    //     super(nomorRekening,saldo, Nominal, UpdateSaldo, IdTransaksi, Tanggal);
    // }

    public Penarikan(String nomorRekening, long saldo, long nominal, long updateSaldo2, String idTransaksi2,
            Date tanggalDate2) {
                super(nomorRekening,saldo, nominal, updateSaldo2, idTransaksi2, tanggalDate2);
    }

    public static void penarikan() {
        System.out.println("Transaksi Berhasil dan Saldo Secara Otomatis akan Berkurang");
    }
    

}
