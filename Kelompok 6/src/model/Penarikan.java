package model;
public class Penarikan extends Transaksi {

    public Penarikan(String Nominal, String UpdateSaldo, String IdTransaksi) {
        super(Nominal, UpdateSaldo, IdTransaksi);
    }

    @Override
    public void penarikan () {
        System.out.println("Saldo Berkurang");
    }

    @Override
    public void setoran() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setoran'");
    }

}
