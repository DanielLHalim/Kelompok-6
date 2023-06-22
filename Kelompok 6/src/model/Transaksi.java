package model;

public abstract class Transaksi {

    public String Nominal;
    public String UpdateSaldo;
    public String IdTransaksi;

    public Transaksi(String Nominal, String UpdateSaldo, String IdTransaksi) {
        this.Nominal = Nominal;
        this.UpdateSaldo = UpdateSaldo;
        this.IdTransaksi = IdTransaksi;
    }

    public abstract void setoran();

    public void deposit() {
        System.out.println("Saldo Bertambah");
    }

    public void withdraw() {
        System.out.println("Saldo Berkurang");
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

    @Override
    public String toString() {
        return "{" +
            " Nominal='" + getNominal() + "'" +
            ", UpdateSaldo='" + getUpdateSaldo() + "'" +
            ", IdTransaksi='" + getIdTransaksi() + "'" +
            "}";
    }

}