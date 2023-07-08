import java.util.ArrayList;

public class Pinjaman {
    private ArrayList<Nasabah> nomorRekening;
    private long JumlahPinjaman;
    private String IdTransaksi;
    

    public Pinjaman(long jumlahPinjaman, String IdTransaksi, ArrayList<Nasabah> nomorRekening) {
        this.nomorRekening = nomorRekening;
        this.JumlahPinjaman = jumlahPinjaman;
        this.IdTransaksi = IdTransaksi;
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
