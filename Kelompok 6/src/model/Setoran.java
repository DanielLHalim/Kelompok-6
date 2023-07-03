package model;

import java.util.Date;

public class Setoran extends Transaksi {

    public Setoran(
        String nomorRekening,
        int Nominal, 
        int UpdateSaldo, 
        String IdTransaksi, 
        Date Tanggal) {
        super(nomorRekening, Nominal, UpdateSaldo, IdTransaksi, Tanggal);
    }


    public static void setoran() {
        System.out.println("Transaksi Berhasil dan Saldo Secara Otomatis akan Bertambah");

    }

}
