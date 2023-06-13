public class Setoran{
    public String JumlahSetoran;
    public String Saldo;
    public String IdTransaksi;

    public Setoran() {
    }

    public Setoran(String JumlahSetoran, String Saldo, String IdTransaksi) {
        this.JumlahSetoran = JumlahSetoran;
        this.Saldo = Saldo;
        this.IdTransaksi = IdTransaksi;
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
    public String getIdTransaksi() {
        return IdTransaksi;
    }
    public void setIdTransaksi(String idTransaksi) {
        IdTransaksi = idTransaksi;
    }

    @Override
    public String toString() {
        return "{" +
            " JumlahSetoran='" + getJumlahSetoran() + "'" +
            ", Saldo='" + getSaldo() + "'" +
            ", IdTransaksi='" + getIdTransaksi() + "'" +
            "}";
    }
    
    
}