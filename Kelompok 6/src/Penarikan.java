public class Penarikan{
    private String JumlahPenarikan;
    private String SisaSaldo;
    private String IdTransaksi;

    public Penarikan() {
    }

    public Penarikan(String JumlahPenarikan, String SisaSaldo, String IdTransaksi) {
        this.JumlahPenarikan = JumlahPenarikan;
        this.SisaSaldo = SisaSaldo;
        this.IdTransaksi = IdTransaksi;
    }

    public String getJumlahPenarikan() {
        return this.JumlahPenarikan;
    }

    public void setJumlahPenarikan(String JumlahPenarikan) {
        this.JumlahPenarikan = JumlahPenarikan;
    }

    public String getSisaSaldo() {
        return this.SisaSaldo;
    }

    public void setSisaSaldo(String SisaSaldo) {
        this.SisaSaldo = SisaSaldo;
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
            " JumlahPenarikan='" + getJumlahPenarikan() + "'" +
            ", Saldo='" + getSisaSaldo() + "'" +
            ", IdTransaksi='" + getIdTransaksi() + "'" +
            "}";
    }
    
    
}