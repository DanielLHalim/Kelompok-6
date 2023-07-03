package model;
import java.util.Date;

public abstract class Transaksi {
    private String nomorRekening;
    private int nominal;
    private int updateSaldo;
    private String idTransaksi;
    private Date tanggal;

    public Transaksi(String nomorRekening, int nominal, int updateSaldo, String idTransaksi, Date tanggal) {
        this.nomorRekening = nomorRekening;
        this.nominal = nominal;
        this.updateSaldo = updateSaldo;
        this.idTransaksi = idTransaksi;
        this.tanggal = tanggal;
    }

    public void setNomorRekening(String nomorRekening) {
        this.nomorRekening = nomorRekening;
    }

    public String getNomorRekening() {
        return nomorRekening;
    }

    public int getNominal() {
        return nominal;
    }

    public void setNominal(int nominal) {
        this.nominal = nominal;
    }

    public int getUpdateSaldo() {
        return updateSaldo;
    }

    public void setUpdateSaldo(int updateSaldo) {
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
                ", nominal='" + getNominal() + "'" +
                ", updateSaldo='" + getUpdateSaldo() + "'" +
                ", idTransaksi='" + getIdTransaksi() + "'" +
                ", tanggal='" + getTanggal() + "'" +
                "}";
    }
}
