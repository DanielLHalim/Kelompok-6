import java.text.SimpleDateFormat;
import java.util.*;
import java.util.Scanner;
import model.Penarikan;
import model.Setoran;

import java.util.Date;
import java.util.InputMismatchException;

    public class tes {
    static Scanner input = new Scanner(System.in);
    public static String getTimeStamp() {
        Date date = new Date();
        String timeStamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date);
        return timeStamp;
    }

public static void main(String[] args) throws Exception {
    boolean end = false;
    while (!end) {
        try {
            System.out.println("\nMenu Utama:");
            System.out.println("1. Check Balance");
            System.out.println("2. Withdraw");
            System.out.println("3. Deposit");
            System.out.println("4. Pinjaman");
            System.out.println("5. Transaction History");
            System.out.println("6. Info Nasabah");

            System.out.println("\nMasukkan pilihan: ");
            int selectedMenu = input.nextInt();

            switch (selectedMenu) {
                case 1:
                    System.out.println();
                    System.out.println("Saldo :");
                    Saldo saldoJohn = new Saldo("1001", "10.000.000", "SDO1001");
                    System.out.println(saldoJohn);

                    Saldo saldoMichael = new Saldo("1002", "1.000.000", "SDO1002");
                    System.out.println(saldoMichael);

                    Saldo saldoDanil = new Saldo("1003", "2.000.000", "SDO1003");
                    System.out.println(saldoDanil);
                    break;
                case 2:
                    System.out.println();
                    System.out.println("Penarikan :");
                    Penarikan penarikanJohn = new Penarikan("100.000", "9.900.000", "DB1001");
                    System.out.println(penarikanJohn);

                    Penarikan penarikanMichael = new Penarikan("300.000", "700.000", "DB1002");
                    System.out.println(penarikanMichael);

                    Penarikan penarikanDanil = new Penarikan("200.000", "1.800.000", "DB1003");
                    System.out.println(penarikanDanil);
                    break;
                case 3:
                    System.out.println();
                    System.out.println("Transaksi :");
                    Setoran setoranJohn = new Setoran("100.000", "10.100.000", "CR1001");
                    System.out.println(setoranJohn);

                    Setoran setoranMichael = new Setoran("300.000", "1.300.000", "CR1002");
                    System.out.println(setoranMichael);

                    Setoran setoranDanil = new Setoran("200.000", "2.200.000", "CR1003");
                    System.out.println(setoranDanil);
                    break;
                case 4:
                    System.out.println();
                    System.out.println("Pinjaman :");
                    Pinjaman pinjamanJohn = new Pinjaman("John", "500.000.000", "PIN1001");
                    System.out.println(pinjamanJohn);

                    Pinjaman pinjamanMichael = new Pinjaman("Michael", "100.000.000", "PIN1002");
                    System.out.println(pinjamanMichael);

                    Pinjaman pinjamanDanil = new Pinjaman("Danil", "10.000.000", "PIN1003");
                    System.out.println(pinjamanDanil);
                    break;
                case 5:
                    System.out.println();
                    System.out.println("Histori Transaksi :");
                    HistoriTransaksi historiTransaksiJohn = new HistoriTransaksi("Debit", "DB1001", "1001", "100.000",
                            "12 Januari 2023 Jam 19:15");
                    System.out.println(historiTransaksiJohn);

                    HistoriTransaksi historiTransaksiMichael = new HistoriTransaksi("Kredit", "CR1002", "1002", "300.000",
                            "14 Juni 2022 Jam 16:45");
                    System.out.println(historiTransaksiMichael);

                    HistoriTransaksi historiTransaksiDanil = new HistoriTransaksi("Debit", "DB1003", "1003", "200.000",
                            "22 Februari 2023 Jam 13:00");
                    System.out.println(historiTransaksiDanil);
                    break;
                case 6:
                    System.out.println();
                    System.out.println("Nasabah :");
                    Nasabah john = new Nasabah("John", "1234567890", "1001");
                    System.out.println(john);

                    Nasabah michael = new Nasabah("Michael", "1234567891", "1002");
                    System.out.println(michael);

                    Nasabah danil = new Nasabah("Danil", "1234567892", "1003");
                    System.out.println(danil);
                    break;
                default:
                    System.out.println("\nInvalid Choice.");
            }
        } catch (InputMismatchException e) {
            System.out.println("\nInvalid Choice.");
        }
    }
}
}