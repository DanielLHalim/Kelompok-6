import model.Penarikan;
import model.Setoran;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Date;

public class tes3 {
    public static ArrayList<User> user = new ArrayList<User>();
    public static ArrayList<Penarikan> penarikan = new ArrayList<Penarikan>();
    public static ArrayList<Setoran> setoran = new ArrayList<Setoran>();
    public static ArrayList<Pinjaman> pinjaman = new ArrayList<Pinjaman>();
    public static ArrayList<Nasabah> nasabah = new ArrayList<Nasabah>();
    
public static Nasabah nasabahh;

    public static void main(String[] args) throws Exception {
        boolean exit = false;
        init();
        Scanner scanner = new Scanner(System.in);

        while (!exit) {
            System.out.println("=== Menu ===");
            System.out.println("1. User");
            System.out.println("2. Transaksi");
            System.out.println("3. Pinjaman");
            System.out.println("4. Nasabah");
            System.out.println("5. Exit");
            System.out.println("7. Tampilkan Data User");
            System.out.println("8. Tampilkan Data Pinjaman");
            System.out.println("9. Tampilkan Data Nasabah");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            scanner.nextLine();

            switch (choice) {
                case 1:
                    exit=inputDataUser();
                    break;

                case 2:
                    displayTransaksi();
                    break;

                case 3:
                    displayPinjaman();
                    break;

                case 4:
                    displayNasabah();
                    break;

                case 5:
                    exit=true;
                    break;

                case 7:
                    tampilDataUser();
                    break;

                case 8:
                    tampilDataPinjaman();
                    break;

                case 9:
                    tampilDataNasabah();
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        scanner.close();
    }

    public static void init() {
        System.out.println("Initializing...");

        User johnUser = new User("1001", "John", "JohnGanteng");
        user.add(johnUser);
        User michaelUser = new User("1002", "Michael", "MichaelGanteng");
        user.add(michaelUser);
        User danilUser = new User("1001", "Danil", "Danil123");
        user.add(danilUser);

        Nasabah johnNasabah = new Nasabah("John", "1001", "19","1234567890","L","081234567890",10000000,"NAS001");
        nasabah.add(johnNasabah);
        Nasabah michaelNasabah = new Nasabah("Michael", "1002", "19","1234567891","L","081234567891",20000000,"NAS002");
        nasabah.add(michaelNasabah);
        Nasabah danilNasabah = new Nasabah("Danil", "1003", "19","1234567892","L","081234567892",500000000,"NAS003");
        nasabah.add(danilNasabah);

        Pinjaman johnPinjaman = new Pinjaman(10000000, "PIN001",nasabah);
        pinjaman.add(johnPinjaman);
        Pinjaman michaelPinjaman = new Pinjaman(2000000, "PIN002",nasabah);
        pinjaman.add(michaelPinjaman);
        Pinjaman danilPinjaman = new Pinjaman(1000000, "PIN003",nasabah);
        pinjaman.add(danilPinjaman);
    }

    public static boolean inputDataUser() {
    
        Scanner input = new Scanner(System.in);
        String nomorRekening = " ", username = " ", password = " ";
        System.out.print("Masukkan Nomor Rekening\t:");
        if (input.hasNextLine())
            nomorRekening = input.nextLine();
        System.out.print("Masukkan Username\t:");
        if (input.hasNextLine())
            username = input.nextLine();
        System.out.print("Masukkan Password\t:");
        if (input.hasNextLine())
            password = input.nextLine();

            user.add(new User(nomorRekening, username, password));

        // tampil
        for (User user2 : user) {
            System.out.println("NoRek \t Username \t Pass");
            System.out.println(user2);
        }

        System.out.println();

        System.out.println("Selamat anda telah terdaftar!");

        System.out.print("Do you want to go back to the main menu? (yes/no): ");
        String goBack = input.nextLine();
        if (goBack.equalsIgnoreCase("yes")) {
        return false;
        } 
        else if (goBack.equalsIgnoreCase("no")) {
            System.out.println("Thank you and see you again");
            System.out.println("Goodbye!");
        return true;
        }
        return false;
    }
    
    public static void tampilDataUser(){
        
//tampil
        for (User user2 : user) {
            System.out.println("Norek \t Username \t Password");
            System.out.println(user2);
        }
    }
              
    public static boolean displayNasabah() {
    String nama = " ", nomorRekening = " ", usia = " ",NIK = " ", jenisKelamin = " ", nomorTelepon = " ", idTransaksiNasabah="";
    int saldoAwal=0;
    int min = 1;
    int max = 100;
    nasabahh = new Nasabah(saldoAwal);
    Scanner input = new Scanner(System.in);

    System.out.println("Nasabah :");
    System.out.print("Masukkan Nama: ");
    if (input.hasNextLine())
            nama = input.nextLine();

    System.out.print("Masukkan No Rekening: ");
    if (input.hasNextLine())
            nomorRekening = input.nextLine();

    System.out.print("Masukkan Usia: ");
    if (input.hasNextLine())
            usia = input.nextLine();

    System.out.print("Masukkan NIK: ");
    if (input.hasNextLine())
            NIK = input.nextLine();

    System.out.print("Masukkan Jenis Kelamin (L/P): ");
    if (input.hasNextLine())
            jenisKelamin = input.nextLine();

    System.out.print("Masukkan No Telepon: ");
    if (input.hasNextLine())
            nomorTelepon = input.nextLine();

    System.out.print("Masukkan Saldo Awal: ");
    if (input.hasNextLine())
            saldoAwal = input.nextInt();


    int random_int = (int)Math.floor(Math.random() * (max - min + 1) + min);
    System.out.println("Id Transaksi: NAS"+ random_int);
    if (input.hasNextLine())
    
    nasabah.add(new Nasabah(nama, nomorRekening, usia, NIK, jenisKelamin,nomorTelepon,saldoAwal,idTransaksiNasabah));

        // tampil
        for (Nasabah nasabah2 : nasabah) {
            System.out.println("Nama \t Nomor Rekening \t Usia \\t NIK  \\t Jenis Kelamin \\t Nomor Telepon \\t Saldo \\t Id Transaksi");
            System.out.println(nasabah2);
        }

    System.out.println("Anda telah berhasil mendaftar!");

        // Nasabah nasabah2 = new Nasabah(nama, nomorRekening, usia, NIK, jenisKelamin,nomorTelepon,saldo,idTransaksiNasabah);
        // System.out.println(nasabah2);
        // System.out.println();

        System.out.print("Do you want to go back to the main menu? (yes/no): ");
        String goBack = input.nextLine();
        if (goBack.equalsIgnoreCase("yes")) {
        return false;
        } 
        else if (goBack.equalsIgnoreCase("no")) {
            System.out.println("Thank you and see you again");
            System.out.println("Goodbye!");
        return true;
        }

        return false;     
    }
    
    public static void tampilDataNasabah(){
        for (Nasabah nasabah2 : nasabah) {
            System.out.println("Nama \t Nomor Rekening \t Usia \\t NIK  \\t Jenis Kelamin \\t Nomor Telepon \\t Saldo \\t Id Transaksi");
            System.out.println(nasabah2);
        }
    }

    public static void displayTransaksi() {
        Scanner scanner = new Scanner(System.in);
        String setoran=" " , penarikan=" ", updateSaldo=" ", idTransaksi=" ",date=" ",saldoNasabah=" ";
        int nominal=0;

        System.out.println("=== Menu ===");
        System.out.println("1. Setoran ");
        System.out.println("2. Penarikan ");
        
        System.out.print("Masukkan Pilihan dari Jenis Transaksi (1/2): ");
        int jenisTransaksi = scanner.nextInt();
            scanner.nextLine();

        switch (jenisTransaksi) {
            case 1:
                System.out.print("Masukkan Nominal Setoran: ");
                if (scanner.hasNextLine())
                nominal = scanner.nextInt();
                int total= nasabahh.getSaldo()+nominal;
                System.out.print("Saldo: "+total);
                System.out.println("Setoran berhasil!");

                

                break;

            case 2:
                System.out.print("Masukkan Nominal Penarikan: ");
                System.out.println("Penarikan berhasil!");

                break;

            default:
                System.out.println("Invalid choice.");
        }

        System.out.print("Do you want to go back to the main menu? (yes/no): ");
        String goBack = scanner.nextLine();
        if (goBack.equalsIgnoreCase("yes")) {
            return;
        } else if (goBack.equalsIgnoreCase("no")) {
            System.out.println("Thank you and see you again");
            System.out.println("Goodbye!");
            System.exit(0);
        }
        inputDataUser();
        }
    
    public static boolean displayPinjaman(){
        int min = 1;
        int max = 100;
        Scanner input = new Scanner(System.in);
        String idTransaksi = " ";
        int jumlahPinjaman = 0;
        System.out.print("Masukkan Nominal Pinjaman\t:");
        if (input.hasNextLine())
            jumlahPinjaman = input.nextInt();

        int random_int = (int)Math.floor(Math.random() * (max - min + 1) + min);
        System.out.println("Id Transaksi: PIN"+ random_int);
        idTransaksi = input.nextLine();

        pinjaman.add(new Pinjaman(jumlahPinjaman, idTransaksi, nasabah));

        // tampil
        for (Pinjaman pinjaman2 : pinjaman) {
            System.out.println("Jumlah Pinjaman \t Id Transaksi");
            System.out.print(pinjaman2);
        }

        System.out.println();

        System.out.println("Selamat anda telah terdaftar!");

        System.out.print("Do you want to go back to the main menu? (yes/no): ");
        String goBack = input.nextLine();
        if (goBack.equalsIgnoreCase("yes")) {
        return false;
        } 
        else if (goBack.equalsIgnoreCase("no")) {
            System.out.println("Thank you and see you again");
            System.out.println("Goodbye!");
        return true;
        }
        return false;     
    }

    public static void tampilDataPinjaman() {
        //tampil
        for (Pinjaman pinjaman2 : pinjaman) {
            System.out.println("Norek \t Username \t Password");
            System.out.println(pinjaman2);
        }
    }
}