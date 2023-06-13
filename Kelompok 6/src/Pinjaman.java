public class Pinjaman {
    private String Nasabah;
    private String JumlahPinjaman;

    public Pinjaman() {
    }

    public Pinjaman(String Nasabah, String JumlahPinjaman) {
        this.Nasabah = Nasabah;
        this.JumlahPinjaman = JumlahPinjaman;
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


    @Override
    public String toString() {
        return "{" +
            " Nasabah='" + getNasabah() + "'" +
            ", JumlahPinjaman='" + getJumlahPinjaman() + "'" +
            "}";
    }


}
