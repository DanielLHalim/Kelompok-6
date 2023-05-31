 /*
    - didalam transaksi dimulai dengan memasukan dan mengidentifikasikan data berupa jenis transaksi yang dilakukan.
    - apabila sudah menentukan jenis transaksi yang mau dibayar maka kita akan memproses pembayaran
    - setelah kita memilih transaksi yang akan dilakukan maka sistem akan menentukan jumlah saldo akun dan melakukan proses pembayaran dan memotong saldo akun*/

public class Transaction {
    private String JenisTransaksi;
    private int JumlahTransaksi;
    private int Saldo;


    public String getJenisTransaksi() {
        return this.JenisTransaksi;
    }

    public void setJenisTransaksi(String JenisTransaksi) {
        this.JenisTransaksi = JenisTransaksi;
    }

    public int getJumlahTransaksi() {
        return this.JumlahTransaksi;
    }

    public void setJumlahTransaksi(int JumlahTransaksi) {
        this.JumlahTransaksi = JumlahTransaksi;
    }

    public int getSaldo() {
        return this.Saldo;
    }

    public void setSaldo(int Saldo) {
        this.Saldo = Saldo;
    }


}



    


