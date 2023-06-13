public class HistoriTransaksi {
    public String JenisTransaksi;
    public String IdTransaksi;
    public String NomorRekening;
    public String Saldo;

    public HistoriTransaksi() {
    }

    public HistoriTransaksi(String JenisTransaksi, String IdTransaksi, String NoRek, String Saldo) {
        this.JenisTransaksi = JenisTransaksi;
        this.IdTransaksi = IdTransaksi;
        this.NomorRekening = NomorRekening;
        this.Saldo = Saldo;
    }

    public String getJenisTransaksi() {
        return this.JenisTransaksi;
    }

    public void setJenisTransaksi(String JenisTransaksi) {
        this.JenisTransaksi = JenisTransaksi;
    }

    public String getIdTransaksi() {
        return this.IdTransaksi;
    }

    public void setIdTransaksi(String IdTransaksi) {
        this.IdTransaksi = IdTransaksi;
    }

    public String getNomorRekening() {
        return this.NomorRekening;
    }

    public void setNomorRekening(String NomorRekening) {
        this.NomorRekening = NomorRekening;
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
            ", IdTransaksi='" + getIdTransaksi() + "'" +
            ", NomorRekening='" + getNomorRekening() + "'" +
            ", Saldo='" + getSaldo() + "'" +
            "}";
    }

}
