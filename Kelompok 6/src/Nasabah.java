public class Nasabah {
   
    private String NomorTelepon;
    private String NomorRekening;
    private String Nik;

    public Nasabah() {
    }

    public Nasabah(String NomorTelepon, String NomorRekening, String Nik) {
        this.NomorTelepon = NomorTelepon;
        this.NomorRekening = NomorRekening;
        this.Nik = Nik;
    }

    public String getNomorTelepon() {
        return this.NomorTelepon;
    }

    public void setNomorTelepon(String NomorTelepon) {
        this.NomorTelepon = NomorTelepon;
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
            " NomorTelepon='" + getNomorTelepon() + "'" +
            ", NomorRekening='" + getNomorRekening() + "'" +
            ", Nik='" + getNik() + "'" +
            "}";
    }
    


    

    

}
