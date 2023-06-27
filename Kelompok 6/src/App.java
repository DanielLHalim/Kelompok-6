import model.Setoran;
import model.Penarikan;

import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.*;

public class App {
    
    public static void main(String[] args) throws Exception {
        boolean end = true;
        while (end) {
            System.out.println("\nMenu Utama:");
            System.out.println("1. Cek Saldo");
            System.out.println("2. Penarikan");
            System.out.println("3. Setoran");
            System.out.println("4. Pinjaman");
            System.out.println("5. Histori Transaksi");
            System.out.println("6. Info Nasabah");
            System.out.println("7. Keluar");

            System.out.println("\nMasukkan pilihan: ");
            Scanner input = new Scanner(System.in);
            int selectedMenu = input.nextInt();
            input.nextLine(); // Membuang karakter newline setelah memasukkan nomor menu

            switch (selectedMenu) {
                case 1:
                    System.out.println("\nCek Saldo:");
                    System.out.println("Masukkan Nama : ");
                    String select1 = input.nextLine();
                    switch (select1) {
                        case "John":
                            Saldo saldoJohn = new Saldo("1001", "10.000.000", "SDO1001");
                            System.out.println(saldoJohn);
                            break;
                        case "Michael":
                            Saldo saldoMichael = new Saldo("1002", "1.000.000", "SDO1002");
                            System.out.println(saldoMichael);
                            break;
                        case "Danil":
                            Saldo saldoDanil = new Saldo("1003", "2.000.000", "SDO1003");
                            System.out.println(saldoDanil);
                            break;
                        default:
                            System.out.println("Invalid Input!!");
                            break;
                    }
                    break;

                case 2:
                    System.out.println("\nPenarikan:");
                    System.out.println("Masukkan Nama : ");
                    String select2 = input.nextLine();
                    switch (select2) {
                        case "John":
                            Penarikan penarikanJohn = new Penarikan("100.000", "9.900.000", "DB1001");
                            System.out.println(penarikanJohn);
                            Penarikan.penarikan();
                            break;
                        case "Michael":
                            Penarikan penarikanMichael = new Penarikan("300.000", "700.000", "DB1002");
                            System.out.println(penarikanMichael);
                            Penarikan.penarikan();
                            break;
                        case "Danil":
                            Penarikan penarikanDanil = new Penarikan("200.000", "1.800.000", "DB1003");
                            System.out.println(penarikanDanil);
                            Penarikan.penarikan();
                            break;
                        default:
                            System.out.println("Invalid Input!!");
                            break;
                    }
                    break;

                case 3:
                    System.out.println("\nSetoran:");
                    System.out.println("Masukkan Nama : ");
                    String select3 = input.nextLine();
                    switch (select3) {
                        case "John":
                            Setoran setoranJohn = new Setoran("200.000", "10.200.000", "CR1001");
                            System.out.println(setoranJohn);
                            Setoran.setoran();
                            break;
                        case "Michael":
                            Setoran setoranMichael = new Setoran("500.000", "1.500.000", "CR1002");
                            System.out.println(setoranMichael);
                            Setoran.setoran();
                            break;
                        case "Danil":
                            Setoran setoranDanil = new Setoran("300.000", "2.300.000", "CR1003");
                            System.out.println(setoranDanil);
                            Setoran.setoran();
                            break;
                        default:
                            System.out.println("Invalid Input!!");
                            break;
                    }
                    break;

                case 4:
                    System.out.println("\nPinjaman:");
                    System.out.println("Masukkan Nama : ");
                    String select4 = input.nextLine();
                    switch (select4) {
                        case "John":
                            System.out.println("Masukkan jumlah pinjaman:");
                            double amountJohn = input.nextDouble();
                            Pinjaman pinjamanJohn = new Pinjaman("John","100.000.000", "PNJ1001" );
                            System.out.println(pinjamanJohn);
                            break;
                        case "Michael":
                            System.out.println("Masukkan jumlah pinjaman:");
                            double amountMichael = input.nextDouble();
                            Pinjaman pinjamanMichael = new Pinjaman("Michael","500.000.000", "PNJ1002");
                            System.out.println(pinjamanMichael);
                            break;
                        case "Danil":
                            System.out.println("Masukkan jumlah pinjaman:");
                            double amountDanil = input.nextDouble();
                            Pinjaman pinjamanDanil = new Pinjaman("Danil","1.000.000.000", "PNJ1003");
                            System.out.println(pinjamanDanil);
                            break;
                        default:
                            System.out.println("Invalid Input!!");
                            break;
                    }
                    break;

                case 5:
                    System.out.println("\nHistori Transaksi:");
                    System.out.println("Masukkan Nama : ");
                    String select5 = input.nextLine();
                    switch (select5) {
                        case "John":
                            HistoriTransaksi historiJohn = new HistoriTransaksi("Debit","DB1001","1001", "100.000", dateTime());
                            System.out.println(historiJohn);
                            break;
                        case "Michael":
                            HistoriTransaksi historiMichael = new HistoriTransaksi("Kredit","CR1002","1002", "500.000", dateTime());
                            System.out.println(historiMichael);
                            break;
                        case "Danil":
                            HistoriTransaksi historiDanil = new HistoriTransaksi("Pinjaman","PNJ1003","1003", "1.000.000.000", dateTime());
                            System.out.println(historiDanil);
                            break;
                        default:
                            System.out.println("Invalid Input!!");
                            break;
                    }
                    break;

                case 6:
                    System.out.println("\nInfo Nasabah:");
                    System.out.println("Masukkan Nama : ");
                    String select6 = input.nextLine();
                    switch (select6) {
                        case "John":
                            Nasabah infoJohn = new Nasabah("John", "1001", "081234567890");
                            System.out.println(infoJohn);
                            break;
                        case "Michael":
                            Nasabah infoMichael = new Nasabah("Michael", "1002", "081234567891");
                            System.out.println(infoMichael);
                            break;
                        case "Danil":
                            Nasabah infoDanil = new Nasabah("Danil", "1003", "081234567892");
                            System.out.println(infoDanil);
                            break;
                        default:
                            System.out.println("Invalid Input!!");
                            break;
                    }
                    break;

                case 7:
                    end = false;
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
                    break;
            }
        }
    }

private static String dateTime() {
        return null;
}
}
