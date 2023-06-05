public class DataNasabah {
   
    private String Nama;
    private String Saldo;
    private String NoRek;
    private String Nik;

    public DataNasabah() {
    }

    public DataNasabah(String Nama, String Saldo, String NoRek, String Nik) {
        this.Nama = Nama;
        this.Saldo = Saldo;
        this.NoRek = NoRek;
        this.Nik = Nik;
    }
   

    public String getNama() {
        return this.Nama;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public String getSaldo() {
        return this.Saldo;
    }

    public void setSaldo(String Saldo) {
        this.Saldo = Saldo;
    }

    public String getNoRek() {
        return this.NoRek;
    }

    public void setNoRek(String NoRek) {
        this.NoRek = NoRek;
    }

    public String getNik() {
        return this.Nik;
    }

    public void setNik(String Nik) {
        this.Nik = Nik;
    }

    @Override
    public String toString() {
        return "{" +
            " Nama='" + getNama() + "'" +
            ", Saldo='" + getSaldo() + "'" +
            ", NoRek='" + getNoRek() + "'" +
            ", Nik='" + getNik() + "'" +
            "}";
    }
}
