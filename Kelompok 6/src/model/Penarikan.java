package model;
public class Penarikan extends Transaksi {

    public Penarikan(String Nominal, String UpdateSaldo, String IdTransaksi) {
        super(Nominal, UpdateSaldo, IdTransaksi);
    }

    @Override
    public void setoran() {
        System.out.println("Saldo Berkurang");
    }

}
