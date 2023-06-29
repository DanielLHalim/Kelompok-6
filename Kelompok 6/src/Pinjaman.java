import java.util.ArrayList;

public class Pinjaman {
    private String JumlahPinjaman;
    private String IdTransaksi;


    public Pinjaman( String JumlahPinjaman, String IdTransaksi, ArrayList<Nasabah> nasabah) {
        this.JumlahPinjaman = JumlahPinjaman;
        this.IdTransaksi = IdTransaksi;
    }

    public String getJumlahPinjaman() {
        return this.JumlahPinjaman;
    }

    public void setJumlahPinjaman(String JumlahPinjaman) {
        this.JumlahPinjaman = JumlahPinjaman;
    }
    public void setIdTransaksi(String idTransaksi) {
        IdTransaksi = idTransaksi;
    }
    public String getIdTransaksi() {
        return IdTransaksi;
    }


    @Override
    public String toString() {
        return "{" +
            ", JumlahPinjaman='" + getJumlahPinjaman() + "'" +
            ", IdTransaksi='" + getIdTransaksi() + "'" +
            "}";
    }
    

}
