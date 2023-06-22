public class Nasabah {
   
    private String Nama;
    private String NomorRekening;
    private String Nik;

    public Nasabah() {
    }

    public Nasabah(String Nama, String NomorRekening, String Nik) {
        this.Nama = Nama;
        this.NomorRekening = NomorRekening;
        this.Nik = Nik;
    }

    public String getNama() {
        return this.Nama;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public String getNomorRekening() {
        return this.NomorRekening;
    }

    public void setNomorRekening(String NomorRekening) {
        this.NomorRekening = NomorRekening;
    }


    public String getNik() {
        return this.Nik;
    }

    public void setNik(String Nik) {
        this.Nik = Nik;
    }



    @Override
    public String toString() {
        return "{" +
            " Nama='" + getNama() + "'" +
            ", NomorRekening='" + getNomorRekening() + "'" +
            ", Nik='" + getNik() + "'" +
            "}";
    }
    


    

    

}
