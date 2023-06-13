public class Saldo {
  private String nomorRekening;
  private String saldo;
  private String idTransaksi;


  public Saldo() {
  }

  public Saldo(String nomorRekening, String saldo, String idTransaksi) {
    this.nomorRekening = nomorRekening;
    this.saldo = saldo;
    this.idTransaksi = idTransaksi;
  }

  public String getNomorRekening() {
    return this.nomorRekening;
  }

  public void setNomorRekening(String nomorRekening) {
    this.nomorRekening = nomorRekening;
  }

  public String getSaldo() {
    return this.saldo;
  }

  public void setSaldo(String saldo) {
    this.saldo = saldo;
  }

  public String getIdTransaksi() {
    return this.idTransaksi;
  }

  public void setIdTransaksi(String idTransaksi) {
    this.idTransaksi = idTransaksi;
  }


  @Override
  public String toString() {
    return "{" +
      " nomorRekening='" + getNomorRekening() + "'" +
      ", saldo='" + getSaldo() + "'" +
      ", idTransaksi='" + getIdTransaksi() + "'" +
      "}";
  }
  
}