public class Penarikan{
    private String JumlahPenarikan;
    private String Saldo;

    public Penarikan() {
    }

    public Penarikan(String JumlahPenarikan, String Saldo) {
        this.JumlahPenarikan = JumlahPenarikan;
        this.Saldo = Saldo;
    }

    public String getJumlahPenarikan() {
        return this.JumlahPenarikan;
    }

    public void setJumlahPenarikan(String JumlahPenarikan) {
        this.JumlahPenarikan = JumlahPenarikan;
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
            " JumlahPenarikan='" + getJumlahPenarikan() + "'" +
            ", Saldo='" + getSaldo() + "'" +
            "}";
    }
}