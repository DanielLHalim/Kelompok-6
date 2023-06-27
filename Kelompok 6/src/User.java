public class User {
    public String nama;
    public String usia;
    public String NIK;
    public String jenisKelamin;
    public String nomorTelepon;

    public User() {
    }
    public User(String nama, String usia, String NIK, String jenisKelamin, String nomorTelepon) {
    this.nama = nama;
    this.usia = usia;
    this.NIK = NIK;
    this.jenisKelamin = jenisKelamin;
    this.nomorTelepon = nomorTelepon;  
  }
  public void setNama(String nama) {
      this.nama = nama;
  }
  public String getNama() {
      return nama;
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

    @Override
    public String toString() {
        return "{" +
            " nama='" + getNama() + "'" +
            ", usia='" + getUsia() + "'" +
            ", NIK='" + getNIK() + "'" +
            ", jenisKelamin='" + getJenisKelamin() + "'" +
            ", nomorTelepon='" + getNomorTelepon() + "'" +
            "}";
    }


}