package model;

import java.util.Date;

public interface TransaksiPerbankan {
    void setoran(String nomorRekening,long saldo, long Nominal, long UpdateSaldo, String IdTransaksi, Date Tanggal);
    void penarikan(String nomorRekening,long saldo, long Nominal, long UpdateSaldo, String IdTransaksi, Date Tanggal);
}
