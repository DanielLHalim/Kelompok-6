import java.util.ArrayList;

public class Pinjaman {
    private ArrayList<Nasabah> nasabah;
    private long JumlahPinjaman;
    private String IdTransaksi;
    

    public Pinjaman(ArrayList<Nasabah>nasabah, long jumlahPinjaman, String IdTransaksi) {
        this.nasabah = nasabah;
        this.JumlahPinjaman = jumlahPinjaman;
        this.IdTransaksi = IdTransaksi;
    }
    public void addnasabah(Nasabah nasabah){
        this.nasabah.add(nasabah);
    }
    public ArrayList<Nasabah> getnasabah() {
        return this.nasabah;
    }

    public void setnasabah(ArrayList<Nasabah> nasabah) {
        this.nasabah = nasabah;
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
