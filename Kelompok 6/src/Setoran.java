public class Setoran{
    public String JenisTransaksi;
    public String JumlahSetoran;
    public String Saldo;

    public Setoran() {
    }

    public Setoran(String JenisTransaksi, String JumlahSetoran, String Saldo) {
        this.JenisTransaksi = JenisTransaksi;
        this.JumlahSetoran = JumlahSetoran;
        this.Saldo = Saldo;
    }

    public String getJenisTransaksi() {
        return this.JenisTransaksi;
    }

    public void setJenisTransaksi(String JenisTransaksi) {
        this.JenisTransaksi = JenisTransaksi;
    }

    public String getJumlahSetoran() {
        return this.JumlahSetoran;
    }

    public void setJumlahSetoran(String JumlahSetoran) {
        this.JumlahSetoran = JumlahSetoran;
    }

    public String getSaldo() {
        return this.Saldo;
    }

    public void setSaldo(String Saldo) {
        this.Saldo = Saldo;
    }

    @Override
    public String toString() {
        return "{" +
            " JenisTransaksi='" + getJenisTransaksi() + "'" +
            ", JumlahSetoran='" + getJumlahSetoran() + "'" +
            ", Saldo='" + getSaldo() + "'" +
            "}";
    }
}