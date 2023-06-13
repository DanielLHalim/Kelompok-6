public class Setoran{
    public String JenisSetoran;
    public String JumlahSetoran;
    public String Saldo;

    public Setoran() {
    }

    public Setoran(String JenisSetoran, String JumlahSetoran, String Saldo) {
        this.JenisSetoran = JenisSetoran;
        this.JumlahSetoran = JumlahSetoran;
        this.Saldo = Saldo;
    }

    public String getJenisSetoran() {
        return this.JenisSetoran;
    }

    public void setJenisSetoran(String JenisSetoran) {
        this.JenisSetoran = JenisSetoran;
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
            " JenisSetoran='" + getJenisSetoran() + "'" +
            ", JumlahSetoran='" + getJumlahSetoran() + "'" +
            ", Saldo='" + getSaldo() + "'" +
            "}";
    }
}