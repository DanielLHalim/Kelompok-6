public class Pinjaman {
    private String Nasabah;
    private String JumlahPinjaman;
    private String IdTransaksi;

    public Pinjaman() {
    }

    public Pinjaman(String Nasabah, String JumlahPinjaman, String IdTransaksi) {
        this.Nasabah = Nasabah;
        this.JumlahPinjaman = JumlahPinjaman;
        this.IdTransaksi = IdTransaksi;
    }

    public String getNasabah() {
        return this.Nasabah;
    }

    public void setNasabah(String Nasabah) {
        this.Nasabah = Nasabah;
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
            " Nasabah='" + getNasabah() + "'" +
            ", JumlahPinjaman='" + getJumlahPinjaman() + "'" +
            ", IdTransaksi='" + getIdTransaksi() + "'" +
            "}";
    }
    

}
