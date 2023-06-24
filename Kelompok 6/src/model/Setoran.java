package model;
public class Setoran extends Transaksi {

    public Setoran(String Nominal, String UpdateSaldo, String IdTransaksi) {
        super(Nominal, UpdateSaldo, IdTransaksi);

    }

    @Override
    public void setoran() {
        System.out.println("Saldo Bertambah");

    }

    @Override
    public void penarikan() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'penarikan'");
    }

}
