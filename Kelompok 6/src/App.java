import java.text.SimpleDateFormat;
import java.util.*;
import java.util.Scanner;

public class App {
    static Scanner input = new Scanner(System.in);

    public static String getTimeStamp() {
        Date date = new Date();
        String timeStamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date);
        return timeStamp;
    }
    public static void main(String[] args) throws Exception{
            boolean end = false;
            while (!end) {
                //try {
                    System.out.println("\nMenu Utama:");
                    System.out.println("1. Check Balance");
                    System.out.println("2. Withdraw");
                    System.out.println("3. Deposit");
                    System.out.println("4. Pinjaman");
                    System.out.println("5. Transaction History");
                    System.out.println("6. Info Nasabah");

                    System.out.println("\nMasukkan pilihan: ");
                     int selectedMenu = input.nextInt();

                    /*switch (selectedMenu) {
                        case 1:
                            getBalance(noRekening, data);
                            break;
                        case 2:
                            withdraw(noRekening, data);
                            break;
                        case 3:
                            deposit(noRekening, data);
                            break;
                        case 4:
                            transfer(noRekening, data);
                            break;
                        case 5:
                            getHistoryTransaction(noRekening, historyQueue);
                            break;
                        case 6:
                            historyQueue.add(new History(noRekening, "logout", "logout", getTimeStamp()));
                            System.out.println("logout");
                            end = true;
                            break;
                        default:
                            System.out.println("\nInvalid Choice.");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("\nInvalid Choice.");
                }*/
            
        
        init ();
        switch(selectedMenu){
            case 6:
        System.out.println("Nasabah :");
        Nasabah John = new Nasabah();
        John = new Nasabah(
        "John",
        "1234567890",
        "1001");
        System.out.println(John);

        Nasabah Michael = new Nasabah();
        Michael = new Nasabah(
        "Michael",
        "1234567891",
        "1002");
        System.out.println(Michael);
        
        Nasabah Danil = new Nasabah();
        Danil = new Nasabah(
        "Danil",
        "1234567892",
        "1003");
        System.out.println(Danil);
        break;
            case 1:
        System.out.println(); 
        System.out.println("Saldo :");
        Saldo saldoJohn = new Saldo();
        saldoJohn = new Saldo(
        "1001",
        "10.000.000",
        "SDO1001");
        System.out.println(saldoJohn);

        Saldo saldoMichael = new Saldo();
        saldoMichael = new Saldo(
        "1002",
        "1.000.000",
        "SDO1002");
        System.out.println(saldoMichael);

        Saldo saldoDanil = new Saldo();
        saldoDanil = new Saldo(
        "1003",
        "2.000.000",
        "SDO1003");
        System.out.println(saldoDanil);
        break;
            case 5:
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

        HistoriTransaksi historitransaksiMichael = new HistoriTransaksi();
        historitransaksiMichael = new HistoriTransaksi(
        "Kredit",
        "CR1002",
        "1002",
        "300.000",
        "14 Juni 2022 Jam 16:45");
        System.out.println(historitransaksiMichael);

        HistoriTransaksi historitransaksiDanil = new HistoriTransaksi();
        historitransaksiDanil = new HistoriTransaksi(
        "Debit",
        "DB1003",
        "1003",
        "200.000",
        "22 Februari 2023 Jam 13:00");
        System.out.println(historitransaksiDanil);
        break;
            case 4:
        System.out.println(); 
        System.out.println("Pinjaman :");
        Pinjaman pinjamanJohn = new Pinjaman();
        pinjamanJohn = new Pinjaman(
        "John",
        "500.000.000",
        "PIN1001");
        System.out.println(pinjamanJohn);

        Pinjaman pinjamanMichael = new Pinjaman();
        pinjamanMichael = new Pinjaman(
        "Micahel",
        "100.000.000",
        "PIN1002");
        System.out.println(pinjamanMichael);

        Pinjaman pinjamanDanil = new Pinjaman();
        pinjamanDanil = new Pinjaman(
        "Danil",
        "10.000.000",
        "PIN1003");
        System.out.println(pinjamanDanil);
        break;
            case 3:
        System.out.println(); 
        System.out.println("Setoran :");
        Setoran setoranJohn = new Setoran ();
        setoranJohn = new Setoran(
        "100.000",
        "10.100.000",
        "CR1001");
        System.out.println(setoranJohn);
            
        Setoran setoranMichael = new Setoran();
        setoranMichael = new Setoran(
        "300.000",
        "1.300.000",
        "CR1002");
        System.out.println(setoranMichael);
            
        Setoran setoranDanil = new Setoran();
        setoranDanil = new Setoran(
        "200.000",
        "2.200.000",
        "CR1003");
        System.out.println(setoranDanil);
        break;
            case 2:
        System.out.println(); 
        System.out.println("Penarikan :");
        Penarikan penarikanJohn = new Penarikan ();
        penarikanJohn = new Penarikan(
        "100.000",
        "9.900.000",
        "DB1001");
        System.out.println(penarikanJohn);
        
        Penarikan penarikanMichael = new Penarikan();
        penarikanMichael = new Penarikan(
        "300.000",
        "700.000",
        "DB1002");
        System.out.println(penarikanMichael);

        Penarikan penarikanDanil = new Penarikan();
        penarikanDanil = new Penarikan(
        "200.000",
        "1.800.000",
        "DB1003");
        System.out.println(penarikanDanil);
        }
    }

    }
    public static void init(){
        Nasabah John = new Nasabah("1234567890",
        "1001",
        "john");

        Nasabah Michael = new Nasabah("1234567891",
        "1002",
        "michael");

        Nasabah Danil = new Nasabah("1234567892",
        "1003",
        "danil");


        Saldo saldoJohn = new Saldo(
        "1001",
        "10.000.000",
        "SDO1001");

        Saldo saldoMichael = new Saldo(
        "1002",
        "1.000.000",
        "SDO1002");

        Saldo saldoDanil = new Saldo(
        "1003",
        "2.000.000",
        "SDO1003");


        HistoriTransaksi historitransaksiJohn = new HistoriTransaksi(
        "Debit",
        "DB1001",
        "1001",
        "100.000",
        "12 Januari 2023 Jam 19:15");

        HistoriTransaksi historitransaksiMichael = new HistoriTransaksi(
        "Kredit",
        "CR1002",
        "1002",
        "300.000",
        "14 Juni 2022 Jam 16:45");

        HistoriTransaksi historitransaksiDanil = new HistoriTransaksi(
        "Debit",
        "DB1003",
        "1003",
        "200.000",
        "22 Februari 2023 Jam 13:00");      


        Pinjaman pinjamanJohn = new Pinjaman(
        "John",
        "500.000.000",
        "PIN1001");

        Pinjaman pinjamanMichael = new Pinjaman(
        "Micahel",
        "100.000.000",
        "PIN1002");

        Pinjaman pinjamanDanil = new Pinjaman(
        "Danil",
        "10.000.000",
        "PIN1003");


        Setoran setoranJohn = new Setoran (
        "100.000",
        "10.100.000",
        "CR1001");
            
        Setoran setoranMichael = new Setoran(
        "300.000",
        "1.300.000",
        "CR1002");
            
        Setoran setoranDanil = new Setoran(
        "200.000",
        "2.200.000",
        "CR1003");
        

        Penarikan penarikanJohn = new Penarikan (
        "100.000",
        "9.900.000",
        "DB1001");
        
        Penarikan penarikanMichael = new Penarikan(
        "300.000",
        "700.000",
        "DB1002");

        Penarikan penarikanDanil = new Penarikan(
        "200.000",
        "1.800.000",
        "DB1003");
        
        }
    }