import java.util.ArrayList;

public class Pinjaman {
    private long JumlahPinjaman;
    private String IdTransaksi;
    private ArrayList<Nasabah> nasabahList;

    public Pinjaman(long jumlahPinjaman, String IdTransaksi, ArrayList<Nasabah> nasabah) {
        this.JumlahPinjaman = jumlahPinjaman;
        this.IdTransaksi = IdTransaksi;
        this.nasabahList = nasabahList;
    }

    public long getJumlahPinjaman() {
        return this.JumlahPinjaman;
    }

    public void setJumlahPinjaman(long JumlahPinjaman) {
        this.JumlahPinjaman = JumlahPinjaman;
    }

    public String getIdTransaksi() {
        return IdTransaksi;
    }

    public void setIdTransaksi(String idTransaksi) {
        IdTransaksi = idTransaksi;
    }

    @Override
    public String toString() {
        return "{" +
            "JumlahPinjaman='" + getJumlahPinjaman() + "'" +
            ", IdTransaksi='" + getIdTransaksi() + "'" +
            "}";
    }
}
