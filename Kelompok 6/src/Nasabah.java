public class Nasabah {
   
    private String Nik;
    private String NomorRekening;
    private String Nama;

    public Nasabah() {
    }

    public Nasabah(String Nik, String NomorRekening, String Nama) {
        this.Nik = Nik;
        this.NomorRekening = NomorRekening;
        this.Nama = Nama;
    }

    public String getNik() {
        return this.Nik;
    }

    public void setNik(String Nik) {
        this.Nik = Nik;
    }

    public String getNomorRekening() {
        return this.NomorRekening;
    }

    public void setNomorRekening(String NomorRekening) {
        this.NomorRekening = NomorRekening;
    }

    public String getNama() {
        return this.Nama;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    @Override
    public String toString() {
        return "{" +
            " Nik='" + getNik() + "'" +
            ", NomorRekening='" + getNomorRekening() + "'" +
            ", Nama='" + getNama() + "'" +
            "}";
    }


    

    

}
