public class Nasabah {
    public String nama;
    public String nomorRekening;
    public String usia;
    public String NIK;
    public String jenisKelamin;
    public String nomorTelepon;
    public String saldo;
    public String idTransaksi;
    

    public Nasabah (String saldo){
        this.saldo = saldo;
    }


    public Nasabah() {
    }
    public Nasabah(String nama,String nomorRekening, String usia, String NIK, String jenisKelamin, String nomorTelepon, String saldo, String idTransaksi) {
    this.nama = nama;
    this.nomorRekening = nomorRekening;
    this.usia = usia;
    this.NIK = NIK;
    this.jenisKelamin = jenisKelamin;
    this.nomorTelepon = nomorTelepon;  
    this.saldo = saldo;
    this.idTransaksi = idTransaksi;
  }
  public void setNama(String nama) {
      this.nama = nama;
  }
  public String getNama() {
      return nama;
  }
  public void setNomorRekening(String nomorRekening) {
      this.nomorRekening = nomorRekening;
  }
  public String getNomorRekening() {
      return nomorRekening;
  }
  public void setUsia(String usia) {
      this.usia = usia;
  }
  public String getUsia() {
      return usia;
  }
  public void setJenisKelamin(String jenisKelamin) {
      this.jenisKelamin = jenisKelamin;
  }
  public String getJenisKelamin() {
      return jenisKelamin;
  }
  public void setNIK(String nIK) {
      NIK = nIK;
  }
  public String getNIK() {
      return NIK;
  }
  public void setNomorTelepon(String nomorTelepon) {
      this.nomorTelepon = nomorTelepon;
  }
  public String getNomorTelepon() {
      return nomorTelepon;
  }
  public String getSaldo() {
      return saldo;
  }
  public void setSaldo(String saldo) {
      this.saldo = saldo;
  }
  public String getIdTransaksi() {
      return idTransaksi;
  }
  public void setIdTransaksi(String idTransaksi) {
      this.idTransaksi = idTransaksi;
  }


    @Override
    public String toString() {
        return "{" +
            " " + getNama() + "'" +
            " " + getNomorRekening() + "'" +
            " " + getUsia() + "'" +
            " " + getNIK() + "'" +
            " " + getJenisKelamin() + "'" +
            " " + getNomorTelepon() + "'" +
            " " + getSaldo() + "'" +
            " " + getIdTransaksi() + "'" +
            "}";
    }
    
    


}