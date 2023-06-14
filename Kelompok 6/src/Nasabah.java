public class Nasabah {
   
    private String Nama;
    private String Nik;
    private String NomorRekening;

    public Nasabah() {
    }

    public Nasabah(String Nama, String Nik, String NomorRekening) {
        this.Nik = Nik;
        this.NomorRekening = NomorRekening;
        this.Nama = Nama;
    }

    public void setNama(String nama) {
        Nama = nama;
    }public String getNama() {
        return Nama;
    }public void setNik(String nik) {
        Nik = nik;
    }public String getNik() {
        return Nik;
    }public void setNomorRekening(String nomorRekening) {
        NomorRekening = nomorRekening;
    }public String getNomorRekening() {
        return NomorRekening;
    }

    @Override
    public String toString() {
        return "{" +
            " Nama='" + getNama() + "'" +
            ", Nik='" + getNik() + "'" +
            ", NomorRekening='" + getNomorRekening() + "'" +
            "}";
    
    
    }


    

    

}
