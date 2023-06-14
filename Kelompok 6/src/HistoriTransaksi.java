public class HistoriTransaksi {
    public String JenisTransaksi;
    public String IdTransaksi;
    public String NomorRekening;
    public String Saldo;
    public String DateTime;
    public HistoriTransaksi() {
    }

    public HistoriTransaksi(String JenisTransaksi, String IdTransaksi, String NomorRekening, String Saldo, String DateTime) {
        this.JenisTransaksi = JenisTransaksi;
        this.IdTransaksi = IdTransaksi;
        this.NomorRekening = NomorRekening;
        this.Saldo = Saldo;
        this.DateTime = DateTime;
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
    public String getDateTime() {
        return DateTime;
    }
    public void setDateTime(String dateTime) {
        DateTime = dateTime;
    }
    @Override
    public String toString() {
        return "{" +
            " JenisTransaksi='" + getJenisTransaksi() + "'" +
            ", IdTransaksi='" + getIdTransaksi() + "'" +
            ", NomorRekening='" + getNomorRekening() + "'" +
            ", Saldo='" + getSaldo() + "'" +
            ", DateTime='" + getDateTime() + "'" +
            "}";
    }
    
}