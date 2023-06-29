package model;
public abstract class Transaksi {

    public String Nominal;
    public String UpdateSaldo;
    public String IdTransaksi;
    public String Date;

     public Transaksi(String Nominal, String UpdateSaldo, String IdTransaksi, String Date) {
        this.Nominal = Nominal;
        this.UpdateSaldo = UpdateSaldo;
        this.IdTransaksi = IdTransaksi;
        this.Date = Date;
    }

    

    public String getNominal() {
        return this.Nominal;
    }

    public void setNominal(String Nominal) {
        this.Nominal = Nominal;
    }

    public String getUpdateSaldo() {
        return this.UpdateSaldo;
    }

    public void setUpdateSaldo(String UpdateSaldo) {
        this.UpdateSaldo = UpdateSaldo;
    }

    public void setIdTransaksi(String idTransaksi) {
        IdTransaksi = idTransaksi;
    }

    public String getIdTransaksi() {
        return IdTransaksi;
    }
    public void setDate(String date) {
        Date = date;
    }
    public String getDate() {
        return Date;
    }


    @Override
    public String toString() {
        return "{" +
            " Nominal='" + getNominal() + "'" +
            ", UpdateSaldo='" + getUpdateSaldo() + "'" +
            ", IdTransaksi='" + getIdTransaksi() + "'" +
            ", Date='" + getDate() + "'" +
            "}";
    }
   
}