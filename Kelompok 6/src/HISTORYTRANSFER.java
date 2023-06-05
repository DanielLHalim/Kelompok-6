public class HISTORYTRANSFER {
        /* history transfer merupakan suatu fitur yang menunjukkan beberapa jejak-jejak dari beberapa jenis operasi
           yang dilakukan oleh pengguna , contohnya seperti : withdraw , transfer , deposit.Dan dari history transfer,
           kita dapat melihat data-data berupa jumlah uang yang ditransaksi , nomor telepon tujuan transaksi , dan
           tanggal dan waktu kita melakukan operasi itu.
          */

          private String noRek;
          private String jenistransaksi;
          private String saldo;
          private String tanggal;
          private String waktu;


        public String getNoRek() {
                return this.noRek;
        }

        public void setNoRek(String noRek) {
                this.noRek = noRek;
        }

        public String getJenistransaksi() {
                return this.jenistransaksi;
        }

        public void setJenistransaksi(String jenistransaksi) {
                this.jenistransaksi = jenistransaksi;
        }

        public String getSaldo() {
                return this.saldo;
        }

        public void setSaldo(String saldo) {
                this.saldo = saldo;
        }

        public String getTanggal() {
                return this.tanggal;
        }

        public void setTanggal(String tanggal) {
                this.tanggal = tanggal;
        }

        public String getWaktu() {
                return this.waktu;
        }

        public void setWaktu(String waktu) {
                this.waktu = waktu;
        }
          
}
