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
        DataNasabah john = new DataNasabah("john",
        "10.000.000",
        "1001",
        "1234567890");
        DataNasabah michael = new DataNasabah("michael",
        "10.000.000",
        "1002",
        "1234567891");
        DataNasabah danil = new DataNasabah("danil",
        "10.000.000",
        "1003",
        "1234567892");
        }
}
