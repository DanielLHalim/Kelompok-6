
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import model.Transaksi;
import model.TransaksiPerbankan;

public class TransaksiPerbankanImplementasi implements TransaksiPerbankan {
    // Simpan riwayat transaksi dalam List
    private List<Transaksi> riwayatTransaksi;

    public TransaksiPerbankanImplementasi() {
        this.riwayatTransaksi = new ArrayList<>();
    }

    @Override
    public void setoran(String nomorRekening, int Nominal, int UpdateSaldo, String IdTransaksi, Date Tanggal) {
        // Logika untuk melakukan setoran tunai ke nomor rekening yang diberikan
        // ...

        // Tambahkan transaksi ke riwayat transaksi
        Transaksi transaksi = new Transaksi(nomorRekening, Nominal, UpdateSaldo, IdTransaksi, Tanggal);
        riwayatTransaksi.add(transaksi);
    }

    @Override
    public void penarikan(String nomorRekening, int Nominal, int UpdateSaldo, String IdTransaksi, Date Tanggal) {
        // Logika untuk melakukan penarikan tunai dari nomor rekening yang diberikan
        // ...

        // Tambahkan transaksi ke riwayat transaksi
        Transaksi transaksi = new Transaksi(nomorRekening, Nominal, UpdateSaldo, IdTransaksi, Tanggal);
        riwayatTransaksi.add(transaksi);
    }

    @Override
    public List<Transaksi> riwayatTransaksi(String nomorRekening) {
        // Logika untuk mendapatkan riwayat transaksi berdasarkan nomor rekening
        // ...

        return riwayatTransaksi;
    }
}
