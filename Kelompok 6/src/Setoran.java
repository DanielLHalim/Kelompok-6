public class Setoran{
    public String JumlahSetoran;
    public String Saldo;

    public Setoran() {
    }

    public Setoran(String JenisTransaksi, String JumlahSetoran, String Saldo) {
        this.JumlahSetoran = JumlahSetoran;
        this.Saldo = Saldo;
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
            " JumlahSetoran='" + getJumlahSetoran() + "'" +
            ", Saldo='" + getSaldo() + "'" +
            "}";
    }
    
}