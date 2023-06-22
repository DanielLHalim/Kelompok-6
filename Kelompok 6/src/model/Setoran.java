package model;

class Setoran extends Transaksi {

    public Setoran(String Nominal, String UpdateSaldo, String IdTransaksi) {
        super(Nominal, UpdateSaldo, IdTransaksi);

    }

    @Override
    public void setoran() {
        System.out.println("Saldo Bertambah");

    }

}
