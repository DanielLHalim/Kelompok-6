import model.Setoran;
import model.Penarikan;
import java.util.*;

public class tes {
    private static List<Nasabah> nasabah;

    public static void main(String[] args) throws Exception {
        nasabah = new ArrayList<>(); // ArrayList untuk menyimpan objek Mahasiswa

        init();

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
            try{
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
                            Pinjaman pinjamanJohn = new Pinjaman("John", "100.000.000", "PNJ1001");
                            System.out.println(pinjamanJohn);
                            break;
                        case "Michael":
                            System.out.println("Masukkan jumlah pinjaman:");
                            double amountMichael = input.nextDouble();
                            Pinjaman pinjamanMichael = new Pinjaman("Michael", "500.000.000", "PNJ1002");
                            System.out.println(pinjamanMichael);
                            break;
                        case "Danil":
                            System.out.println("Masukkan jumlah pinjaman:");
                            double amountDanil = input.nextDouble();
                            Pinjaman pinjamanDanil = new Pinjaman("Danil", "1.000.000.000", "PNJ1003");
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
                            HistoriTransaksi historiJohn = new HistoriTransaksi("Debit", "DB1001", "1001", "100.000", dateTime());
                            System.out.println(historiJohn);
                            break;
                        case "Michael":
                            HistoriTransaksi historiMichael = new HistoriTransaksi("Kredit", "CR1002", "1002", "500.000", dateTime());
                            System.out.println(historiMichael);
                            break;
                        case "Danil":
                            HistoriTransaksi historiDanil = new HistoriTransaksi("Pinjaman", "PNJ1003", "1003", "1.000.000.000", dateTime());
                            System.out.println(historiDanil);
                            break;
                        default:
                            System.out.println("Invalid Input!!");
                            break;
                    }
                    break;

                case 6:
                    System.out.println("\nNasabah:");
                    System.out.println("Masukkan Nama : ");
                    String select6 = input.nextLine();
                    switch (select6) {
                        case "John":
                            inputDataNasabah();
                            break;
                        case "Michael":
                            inputDataNasabah();
                            break;
                        case "Danil":
                            inputDataNasabah();
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
            } catch (NoSuchElementException e) {
                System.out.println("Tidak ada input yang tersedia.");
                end = false; // Menghentikan perulangan saat tidak ada input yang tersedia
            }
        }
    }

    private static void inputDataNasabah() {
        Scanner input = new Scanner(System.in);
        String noTelepon = "", nomorRekening = "", NIK = "";

        System.out.print("Nomor Telepon\t: ");
        if (input.hasNextLine())
            noTelepon = input.nextLine();

        System.out.print("Nomor Rekening\t: ");
        if (input.hasNextLine())
            nomorRekening = input.nextLine();

        System.out.print("NIK\t: ");
        if (input.hasNextLine())
            NIK = input.nextLine();

        nasabah.add(new Nasabah(noTelepon, nomorRekening, NIK));

        input.close();
        System.out.println();
    }
    public static void cetakDataNasabah(){
        for (Nasabah nasabah2 : nasabah) {
            System.out.println(nasabah2);
        }
    }
     public static void init(){
        Nasabah John = new Nasabah("1234567890",
        "1001",
        "03081220001");

        Nasabah Michael = new Nasabah("1234567891",
        "1002",
        "03081220002");

        Nasabah Danil = new Nasabah("1234567892",
        "1003",
        "03081220025");

        nasabah.add(John);
        nasabah.add(Michael);
        nasabah.add(Danil);
     }
    private static String dateTime() {
        Date date = new Date();
        return date.toString();
    }
}
