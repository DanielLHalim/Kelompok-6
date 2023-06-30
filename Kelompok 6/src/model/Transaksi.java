package model;
public abstract class Transaksi {

    public String Nominal;
    public int UpdateSaldo;
    public String IdTransaksi;
    public String Date;

     public Transaksi(String Nominal, int UpdateSaldo, String IdTransaksi, String date2) {
        this.Nominal = Nominal;
        this.UpdateSaldo = UpdateSaldo;
        this.IdTransaksi = IdTransaksi;
        this.Date = date2;
    }

    

    public String getNominal() {
        return this.Nominal;
    }

    public void setNominal(String Nominal) {
        this.Nominal = Nominal;
    }

    public int getUpdateSaldo() {
        return this.UpdateSaldo;
    }

    public void setUpdateSaldo(int UpdateSaldo) {
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
            " " + getNominal() + "'" +
            " " + getUpdateSaldo() + "'" +
            " " + getIdTransaksi() + "'" +
            " " + getDate() + "'" +
            "}";
    }
   
}