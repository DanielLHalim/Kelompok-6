package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public abstract class Transaksi {
    private String nomorRekening;
    private long saldo;
    private long nominal;
    private long updateSaldo;
    private String idTransaksi;
    private Date tanggal;

    public Transaksi(String nomorRekening, long saldo, long nominal, long updateSaldo, String idTransaksi, Date tanggal) {
        this.nomorRekening = nomorRekening;
        this.nominal = nominal;
        this.updateSaldo = updateSaldo;
        this.idTransaksi = idTransaksi;
        this.tanggal = tanggal;
        this.saldo = saldo;
    }

    public void setNomorRekening(String nomorRekening) {
        this.nomorRekening = nomorRekening;
    }

    public String getNomorRekening() {
        return nomorRekening;
    }

    public void setSaldo(long saldo) {
        this.saldo = saldo;
    }

    public long getSaldo() {
        return saldo;
    }

    public long getNominal() {
        return nominal;
    }

    public void setNominal(long nominal) {
        this.nominal = nominal;
    }

    public long getUpdateSaldo() {
        return updateSaldo;
    }

    public void setUpdateSaldo(long updateSaldo) {
        this.updateSaldo = updateSaldo;
    }

    public void setIdTransaksi(String idTransaksi) {
        this.idTransaksi = idTransaksi;
    }

    public String getIdTransaksi() {
        return idTransaksi;
    }

    public void setTanggal(Date tanggal) {
        this.tanggal = tanggal;
    }

    public Date getTanggal() {
        return tanggal;
    }

    @Override
    public String toString() {
        return "{" +
            " nomorRekening='" + getNomorRekening() + "'" +
            ", saldo='" + getSaldo() + "'" +
            ", nominal='" + getNominal() + "'" +
            ", updateSaldo='" + getUpdateSaldo() + "'" +
            ", idTransaksi='" + getIdTransaksi() + "'" +
            ", tanggal='" + getTanggal() + "'" +
            "}";
    }

}

interface TransaksiPerbankan {
    void setoran(String nomorRekening, long saldo, long nominal, long updateSaldo, String idTransaksi, Date tanggal);

    void penarikan(String nomorRekening, long saldo, long nominal, long updateSaldo, String idTransaksi, Date tanggal);

    List<Transaksi> riwayatTransaksi(String nomorRekening);
}

class TransaksiPerbankanImplementasi implements TransaksiPerbankan {
    // Simpan riwayat transaksi dalam List
    private List<Transaksi> riwayatTransaksi;

    public TransaksiPerbankanImplementasi() {
        this.riwayatTransaksi = new ArrayList<>();
    }

    @Override
    public void setoran(String nomorRekening, long saldo, long nominal, long newSaldo, String idTransaksi1, Date tanggalDate1) {

        long updateSaldo1 = saldo + nominal;

        // Tambahkan transaksi ke riwayat transaksi
        Setoran setoran = new Setoran(nomorRekening, saldo, nominal, updateSaldo1, idTransaksi1, tanggalDate1);
        riwayatTransaksi.add(setoran);
    }

    @Override
    public void penarikan(String nomorRekening, long saldo, long nominal, long newSaldo, String idTransaksi2, Date tanggalDate2) {
        long updateSaldo2 = saldo - nominal;

        Transaksi transaksi = new Penarikan(nomorRekening, saldo, nominal, updateSaldo2, idTransaksi2, tanggalDate2);
        riwayatTransaksi.add(transaksi);
    }

    @Override
    public List<Transaksi> riwayatTransaksi(String nomorRekening) {
        List<Transaksi> riwayatTransaksiNomorRekening = new ArrayList<>();
        for (Transaksi transaksi : riwayatTransaksi) {
            if (transaksi.getNomorRekening().equals(nomorRekening)) {
                riwayatTransaksiNomorRekening.add(transaksi);
            }
        }

        return riwayatTransaksiNomorRekening;
    }
}
