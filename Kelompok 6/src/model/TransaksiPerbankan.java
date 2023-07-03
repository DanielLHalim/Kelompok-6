package model;

import java.util.Date;
import java.util.List;

public interface TransaksiPerbankan {
    void setoran(String nomorRekening, int Nominal, int UpdateSaldo, String IdTransaksi, Date Tanggal);
    void penarikan(String nomorRekening, int Nominal, int UpdateSaldo, String IdTransaksi, Date Tanggal);
    List<Transaksi> riwayatTransaksi(String nomorRekening);
    // Metode lain yang diperlukan
}
