import java.text.SimpleDateFormat;
import java.util.*;

public class App {
    static Scanner input = new Scanner(System.in);

    public static String getTimeStamp() {
        Date date = new Date();
        String timeStamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date);
        return timeStamp;
    }

    public static void main(String[] args) {
            boolean end = false;
            while (!end) {
                //try {
                    System.out.println("\nMenu Utama:");
                    System.out.println("1. Check Balance");
                    System.out.println("2. Withdraw");
                    System.out.println("3. Deposit");
                    System.out.println("4. Transfer");
                    System.out.println("5. Transaction History");
                    System.out.println("6. Logout");

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
            }
        }
    public static void init(){
        Nasabah john = new Nasabah("1234567890",
        "1001",
        "john");
        Nasabah michael = new Nasabah("1234567891",
        "1002",
        "michael");
        Nasabah danil = new Nasabah("1234567892",
        "1003",
        "danil");

        Saldo saldoJohn = new Saldo(
            "1001",
            "10.000.000");
        Saldo saldoMichael = new Saldo(
            "1002",
            "10.000.000");
        Saldo saldoDanil = new Saldo(
            "1003",
            "10.000.000");
        }

        HistoriTransaksi historitransaksiJohn = new HistoriTransaksi( 
            "Transfer ke 1002",
            "TF",
            "1001",
            "Rp250.000");
        HistoriTransaksi historitransaksiMichael = new HistoriTransaksi(
            "Penarikan",
            "PNR",
            "1002",
            "Rp300.000");
        HistoriTransaksi historitransaksiDanil = new HistoriTransaksi(
            "Transfer ke 1001",
            "TF",
            "1003",
            "Rp400.000");      


        Transaction transactionJohn = new Transaction(
            "Transfer",
            100000,
            10000000);
        Transaction transactionMichael = new Transaction(
            "Transfer",
            200000,
            10000000);
        Transaction transactionDanil = new Transaction(
            "Deposit",
            400000,
            10000000);

        Setoran setoranJohn = new Setoran ("Air",
        "100.000",
        "10.000.000");
            
        Setoran setoranMichael = new Setoran("Listrik",
        "300.000",
        "1.000.000");
            
        Setoran setoranDanil = new Setoran("Telephone",
        "200.000",
        "2.000.000");
            
        }
