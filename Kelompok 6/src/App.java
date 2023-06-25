import model.Setoran;
import model.Penarikan;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.Scanner;

public class App {
        /*
         * public static void main(String[] args) throws Exception {
         * Transaksi[] Transaksi = { new Setoran(null, null, null) };
         * for (Transaksi Transaksi2 : Transaksi) {
         * Transaksi2.deposit();
         * }
         * Setoran deposit = new Setoran(null, null, null);
         * deposit.getUpdateSaldo();
         * deposit.setoran();
         * Transaksi[2].deposit();
         * 
         * Penarikan penarikan = new Penarikan(null, null, null);
         * 
         * }
         */

        static Scanner input = new Scanner(System.in);

        public static String getTimeStamp() {
                Date date = new Date();
                String timeStamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date);
                return timeStamp;
        }

        public static void main(String[] args) throws Exception {

                // Transaksi[] Transaksi = { new Setoran(null, null, null) };
                // for (Transaksi Transaksi2 : Transaksi) {
                // Transaksi2.deposit();
                // }
                // Setoran deposit = new Setoran(null, null, null);
                // deposit.getUpdateSaldo();
                // deposit.setoran();
                // Transaksi[2].deposit();

                // Penarikan penarikan = new Penarikan(null, null, null);

                boolean end = true;
                while (end) {
                        // try {
                        System.out.println("\nMenu Utama:");
                        System.out.println("1. Cek Saldo");
                        System.out.println("2. Penarikan");
                        System.out.println("3. Setoran");
                        System.out.println("4. Pinjaman");
                        System.out.println("5. Histori Transaksi");
                        System.out.println("6. Info Nasabah");

                        System.out.println("\nMasukkan pilihan: ");
                        int selectedMenu = input.nextInt();

                        /*
                         * switch (selectedMenu) {
                         * case 1:
                         * getBalance(noRekening, data);
                         * break;
                         * case 2:
                         * withdraw(noRekening, data);
                         * break;
                         * case 3:
                         * deposit(noRekening, data);
                         * break;
                         * case 4:
                         * transfer(noRekening, data);
                         * break;
                         * case 5:
                         * getHistoryTransaction(noRekening, historyQueue);
                         * break;
                         * case 6:
                         * historyQueue.add(new History(noRekening, "logout", "logout",
                         * getTimeStamp()));
                         * System.out.println("logout");
                         * end = true;
                         * break;
                         * default:
                         * System.out.println("\nInvalid Choice.");
                         * }
                         * } catch (InputMismatchException e) {
                         * System.out.println("\nInvalid Choice.");
                         * }
                         */

                        switch (selectedMenu) {
                                case 1:
                                        boolean state1 = true;
                                        while (state1) {
                                                System.out.println("ketik 'exit' untuk kembali ke menu utama");
                                                System.out.println("Masukkan Nama : ");
                                                Scanner myObj1 = new Scanner(System.in);
                                                String select1 = myObj1.nextLine();
                                                switch (select1) {
                                                        case "John":
                                                                Saldo saldoJohn = new Saldo();
                                                                saldoJohn = new Saldo(
                                                                                "1001",
                                                                                "10.000.000",
                                                                                "SDO1001");
                                                                System.out.println(saldoJohn);
                                                                break;

                                                        case "Michael":
                                                                Saldo saldoMichael = new Saldo();
                                                                saldoMichael = new Saldo(
                                                                                "1002",
                                                                                "1.000.000",
                                                                                "SDO1002");
                                                                System.out.println(saldoMichael);
                                                                break;

                                                        case "Danil":
                                                                Saldo saldoDanil = new Saldo();
                                                                saldoDanil = new Saldo(
                                                                                "1003",
                                                                                "2.000.000",
                                                                                "SDO1003");
                                                                System.out.println(saldoDanil);
                                                                break;

                                                        case "exit":
                                                                state1 = false;
                                                                break;

                                                        default:
                                                                System.out.println("Invalid Input!!");
                                                                System.out.println("");
                                                                break;
                                                }
                                        }

                                        break;
                                case 2:
                                        boolean state2 = true;
                                        while (state2) {
                                                System.out.println("ketik 'exit' untuk kembali ke menu utama");
                                                System.out.println("Masukkan Nama : ");
                                                Scanner myObj2 = new Scanner(System.in);
                                                String select2 = myObj2.nextLine();
                                                switch (select2) {
                                                        case "John":
                                                                System.out.println();
                                                                System.out.println("Penarikan :");
                                                                Penarikan penarikanJohn;
                                                                penarikanJohn = new Penarikan(
                                                                                "100.000",
                                                                                "9.900.000",
                                                                                "DB1001");
                                                                System.out.println(penarikanJohn);
                                                                Penarikan.penarikan();
                                                                break;
                                                        case "Michael":
                                                                Penarikan penarikanMichael;
                                                                penarikanMichael = new Penarikan(
                                                                                "300.000",
                                                                                "700.000",
                                                                                "DB1002");
                                                                System.out.println(penarikanMichael);
                                                                Penarikan.penarikan();
                                                                break;
                                                        case "Danil":
                                                                Penarikan penarikanDanil;
                                                                penarikanDanil = new Penarikan(
                                                                                "200.000",
                                                                                "1.800.000",
                                                                                "DB1003");
                                                                System.out.println(penarikanDanil);
                                                                Penarikan.penarikan();
                                                                break;

                                                        case "exit":
                                                                state2 = false;
                                                                break;

                                                        default:
                                                                System.out.println("Invalid Input!!");
                                                                System.out.println("");
                                                                break;
                                                }
                                        }

                                        break;

                                case 3:
                                        boolean state3 = true;
                                        while (state3) {
                                                System.out.println("ketik 'exit' untuk kembali ke menu utama");
                                                System.out.println("Masukkan Nama : ");
                                                Scanner myObj3 = new Scanner(System.in);
                                                String select3 = myObj3.nextLine();
                                                switch (select3) {
                                                        case "John":
                                                                System.out.println();
                                                                System.out.println("Setoran :");
                                                                Setoran setoranJohn;
                                                                setoranJohn = new Setoran(
                                                                                "100.000",
                                                                                "10.100.000",
                                                                                "CR1001");
                                                                System.out.println(setoranJohn);
                                                                Setoran.setoran();
                                                                break;
                                                
                                                        case "Michael":
                                                                Setoran setoranMichael;
                                                                setoranMichael = new Setoran(
                                                                                "300.000",
                                                                                "1.300.000",
                                                                                "CR1002");
                                                                System.out.println(setoranMichael);
                                                                Setoran.setoran();
                                                                break;
                                                        
                                                        case "Danil":
                                                                Setoran setoranDanil;
                                                                setoranDanil = new Setoran(
                                                                                "200.000",
                                                                                "2.200.000",
                                                                                "CR1003");
                                                                System.out.println(setoranDanil);
                                                                Setoran.setoran();
                                                                break;

                                                        case "exit":
                                                                state3 = false;
                                                                break;

                                                        default:
                                                                System.out.println("Invalid Input!!");
                                                                System.out.println("");
                                                                break;
                                                }
                                        }

                                        break;

                                case 4:
                                        boolean state4 = true;
                                        while (state4) {
                                                System.out.println("ketik 'exit' untuk kembali ke menu utama");
                                                System.out.println("Masukkan Nama : ");
                                                Scanner myObj4 = new Scanner(System.in);
                                                String select4 = myObj4.nextLine();
                                                switch (select4) {
                                                        case "John":
                                                                System.out.println();
                                                                System.out.println("Pinjaman :");
                                                                Pinjaman pinjamanJohn = new Pinjaman();
                                                                pinjamanJohn = new Pinjaman(
                                                                                "John",
                                                                                "500.000.000",
                                                                                "PIN1001");
                                                                System.out.println(pinjamanJohn);
                                                                break;

                                                        case "Michael":
                                                                Pinjaman pinjamanMichael = new Pinjaman();
                                                                pinjamanMichael = new Pinjaman(
                                                                                "Micahel",
                                                                                "100.000.000",
                                                                                "PIN1002");
                                                                System.out.println(pinjamanMichael);
                                                                break;

                                                        case "Danil":
                                                                Pinjaman pinjamanDanil = new Pinjaman();
                                                                pinjamanDanil = new Pinjaman(
                                                                                "Danil",
                                                                                "10.000.000",
                                                                                "PIN1003");
                                                                System.out.println(pinjamanDanil);
                                                                break;

                                                        case "exit":
                                                                state4 = false;
                                                                break;

                                                        default:
                                                                System.out.println("Invalid Input!!");
                                                                System.out.println("");
                                                                break;
                                                }
                                        }

                                        break;
                                
                                
                                case 5:
                                        boolean state5 = true;
                                        while (state5) {
                                                System.out.println("ketik 'exit' untuk kembali ke menu utama");
                                                System.out.println("Masukkan Nama : ");
                                                Scanner myObj5 = new Scanner(System.in);
                                                String select5 = myObj5.nextLine();
                                                switch (select5) {
                                                        case "John":
                                                                System.out.println();
                                                                System.out.println("Histori Transaksi :");
                                                                HistoriTransaksi historitransaksiJohn = new HistoriTransaksi();
                                                                historitransaksiJohn = new HistoriTransaksi(
                                                                                "Debit",
                                                                                "DB1001",
                                                                                "1001",
                                                                                "100.000",
                                                                                "12 Januari 2023 Jam 19:15");
                                                                System.out.println(historitransaksiJohn);
                                                                break;

                                                        case "Michael":
                                                                HistoriTransaksi historitransaksiMichael = new HistoriTransaksi();
                                                                historitransaksiMichael = new HistoriTransaksi(
                                                                                "Kredit",
                                                                                "CR1002",
                                                                                "1002",
                                                                                "300.000",
                                                                                "14 Juni 2022 Jam 16:45");
                                                                System.out.println(historitransaksiMichael);
                                                                break;

                                                        case "Danil":
                                                                HistoriTransaksi historitransaksiDanil = new HistoriTransaksi();
                                                                historitransaksiDanil = new HistoriTransaksi(
                                                                                "Debit",
                                                                                "DB1003",
                                                                                "1003",
                                                                                "200.000",
                                                                                "22 Februari 2023 Jam 13:00");
                                                                System.out.println(historitransaksiDanil);
                                                                break;

                                                        case "exit":
                                                                state5 = false;
                                                                break;

                                                        default:
                                                                System.out.println("Invalid Input!!");
                                                                System.out.println("");
                                                                break;
                                                }
                                        }

                                        break;

                                case 6:
                                        boolean state6 = true;
                                        while (state6) {
                                                System.out.println("ketik 'exit' untuk kembali ke menu utama");
                                                System.out.println("Masukkan Nama : ");
                                                Scanner myObj6 = new Scanner(System.in);
                                                String select6 = myObj6.nextLine();
                                                switch (select6) {
                                                        case "John":
                                                                System.out.println("Nasabah :");
                                                                Nasabah John = new Nasabah();
                                                                John = new Nasabah(
                                                                                "John",
                                                                                "1234567890",
                                                                                "1001");
                                                                System.out.println(John);
                                                                break;
                                                                
                                                        case "Michael":
                                                                Nasabah Michael = new Nasabah();
                                                                Michael = new Nasabah(
                                                                                "Michael",
                                                                                "1234567891",
                                                                                "1002");
                                                                System.out.println(Michael);
                                                                break;
                                                        case "Danil":

                                                                Nasabah Danil = new Nasabah();
                                                                Danil = new Nasabah(
                                                                                "Danil",
                                                                                "1234567892",
                                                                                "1003");
                                                                System.out.println(Danil);
                                                                break;

                                                        case "exit":
                                                                state6 = false;
                                                                break;

                                                        default:
                                                                System.out.println("Invalid Input!!");
                                                                System.out.println("");
                                                                break;
                                                }
                                        }

                                        break;
                        }
                }

        }
}