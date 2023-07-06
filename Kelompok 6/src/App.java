import model.Penarikan;
import model.Setoran;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.ArrayList;

public class App {
    public static ArrayList<User> user = new ArrayList<User>();
    public static ArrayList<Penarikan> penarikan = new ArrayList<Penarikan>();
    public static ArrayList<Setoran> setoran = new ArrayList<Setoran>();
    public static ArrayList<Pinjaman> pinjaman = new ArrayList<Pinjaman>();
    public static ArrayList<Nasabah> nasabah = new ArrayList<Nasabah>();
    public static Nasabah nasabahh = null;
    
    public static void main(String[] args) throws Exception {
        boolean exit = false;
        init();
        Scanner scanner = new Scanner(System.in);

        while (!exit) {
            System.out.println("");
            System.out.println("====== Menu ======");
            // Menampilkan pilihan menu
            System.out.println("1.  User");
            System.out.println("2.  Nasabah");
            System.out.println("3.  Transaksi");
            System.out.println("4.  Pinjaman");
            System.out.println("5.  Tampilkan Data User");
            System.out.println("6.  Tampilkan Data Nasabah");
            System.out.println("7.  Tampilkan Data Setoran");
            System.out.println("8.  Tampilkan Data Penarikan");
            System.out.println("9.  Tampilkan Data Pinjaman");
            System.out.println("10. Remove User");
            System.out.println("11. Remove Nasabah");
            System.out.println("12. Remove Setoran");
            System.out.println("13. Remove Penarikan");
            System.out.println("14. Remove Pinjaman");
            System.out.println("20. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    exit = inputDataUser();
                    break;

                case 2:
                    displayNasabah();
                    break;

                case 3:
                    displayTransaksi();
                    break;

                case 4:
                    displayPinjaman();
                    break;

                case 5:
                    tampilDataUser();
                    break;

                case 6:
                    tampilDataNasabah();
                    break;

                case 7:
                    tampilDataSetoran();
                    break;

                case 8:
                    tampilDataPenarikan();
                    break;

                case 9:
                    tampilDataPinjaman();
                    break;

                case 10:
                    removeUser(0);
                    break;

                case 11:
                    removeNasabah(0);
                    break;


                case 12:   
                    removeSetoran(0);
                    break;

                case 13:
                    removePenarikan(0);
                    break;

                case 14:
                    removePinjaman(0);
                    break;

                case 20:
                    exit = true;
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        scanner.close();
    }

    
    public static void init() {
        // Inisialisasi data awal
        Date tanggalDate = new Date();
        System.out.println("Initializing...");
        User johnUser = new User("1001", "John", "JohnGanteng");
        user.add(johnUser);
        User michaelUser = new User("1002", "Michael", "MichaelGanteng");
        user.add(michaelUser);
        User danilUser = new User("1001", "Danil", "Danil123");
        user.add(danilUser);

        Nasabah johnNasabah = new Nasabah("John", "1001", "19","1234567890","L","081234567890","10.000.000","NAS001");
        nasabah.add(johnNasabah);
        Nasabah michaelNasabah = new Nasabah("Michael", "1002", "19","1234567891","L","081234567891","20.000.000","NAS002");
        nasabah.add(michaelNasabah);
        Nasabah danilNasabah = new Nasabah("Danil", "1003", "19","1234567892","L","081234567892","500.000.000","NAS003");
        nasabah.add(danilNasabah);

        Setoran johnSetoran = new Setoran("1001",10000000,21000000, "SET001",tanggalDate);
        setoran.add(johnSetoran);
        Setoran michaelSetoran = new Setoran("1002",20000000,31000000, "SET002",tanggalDate);
        setoran.add(michaelSetoran);
        Setoran danilSetoran = new Setoran("1003",30000000,41000000, "SET003",tanggalDate );
        setoran.add(danilSetoran);

        Penarikan johnPenarikan = new Penarikan("1001",1000000,10000000, "PEN001",tanggalDate);
        penarikan.add(johnPenarikan);
        Penarikan michaelPenarikan = new Penarikan("1002",1000000,10000000, "PEN002",tanggalDate );
        penarikan.add(michaelPenarikan);
        Penarikan danilPenarikan = new Penarikan("1003",1000000,10000000, "PEN003",tanggalDate);
        penarikan.add(danilPenarikan);

        Pinjaman johnPinjaman = new Pinjaman (100000000, "PIN0001", nasabah);
        pinjaman.add(johnPinjaman);
        Pinjaman michaelPinjaman = new Pinjaman (500000000, "PIN0002", nasabah);
        pinjaman.add(michaelPinjaman);
        Pinjaman danilPinjaman = new Pinjaman (50000000, "PIN0003", nasabah);
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

        System.out.println("================================================================");
            user.add(new User(nomorRekening, username, password));
            System.out.println(user.get(0));

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
              
    public static void displayNasabah() {
    String nama = " ",nomorRekening = " ",usia = " ",NIK = " ",jenisKelamin = " ",nomorTelepon = " ",saldo="",idTransaksiNasabah="";
    int min = 1;
    int max = 100;
    Scanner input = new Scanner(System.in);

    System.out.println("Nasabah :");
    System.out.print("Masukkan Nama\t\t\t: ");
    if (input.hasNextLine())
            nama = input.nextLine();

    System.out.print("Masukkan No Rekening\t\t: ");
    if (input.hasNextLine())
            nomorRekening = input.nextLine();

    System.out.print("Masukkan Usia\t\t\t: ");
    if (input.hasNextLine())
            usia = input.nextLine();

    System.out.print("Masukkan NIK\t\t\t: ");
    if (input.hasNextLine())
            NIK = input.nextLine();

    System.out.print("Masukkan Jenis Kelamin (L/P)\t: ");
    if (input.hasNextLine())
            jenisKelamin = input.nextLine();

    System.out.print("Masukkan No Telepon\t\t: ");
    if (input.hasNextLine())
            nomorTelepon = input.nextLine();

    System.out.print("Masukkan Saldo Awal\t\t: ");
    if (input.hasNextLine())
            saldo = input.nextLine();
    
    System.out.println("================================================================");

    int random_int = (int)Math.floor(Math.random() * (max - min + 1) + min);
    System.out.println("Id Transaksi: NAS"+ random_int);
    String idTransaksi = "NAS"+random_int;
    nasabahh = new Nasabah(saldo);
    nasabah.add(new Nasabah(nama, nomorRekening, usia, NIK, jenisKelamin,nomorTelepon,nasabahh.getSaldo(),idTransaksi));
    System.out.println(nasabah.get(user.size() - 1));

        // tampil
    tampilDataNasabah();

    System.out.println("Anda telah berhasil mendaftar!");

        // Nasabah nasabah2 = new Nasabah(nama, nomorRekening, usia, NIK, jenisKelamin,nomorTelepon,saldo,idTransaksiNasabah);
        // System.out.println(nasabah2);
        // System.out.println();



        System.out.print("Do you want to go back to the main menu? (yes/no): ");
        String goBack = input.nextLine();
        if (goBack.equalsIgnoreCase("yes")) {
            return;
        } else if (goBack.equalsIgnoreCase("no")) {
            System.out.println("Thank you and see you again");
            System.out.println("Goodbye!");
            System.exit(0);
        }

        
    }

    public static void displayTransaksi() {
        Scanner scanner = new Scanner(System.in);
        String idTransaksi = " ", nomorRekening=" ";
        int updateSaldo=0, nominal=0;
        Date tanggalDate = new Date();

        System.out.println("====== Menu ======");
        System.out.print("1. Setoran: ");
        System.out.println();
        System.out.print("2. Penarikan: ");
        System.out.println();
        System.out.print("Masukkan Pilihan dari Jenis Transaksi (1/2): ");
        int jenisTransaksi = scanner.nextInt();
        scanner.nextLine();
        switch (jenisTransaksi) {
            case 1:
            int min1 = 1;
            int max1 = 100;

                System.out.print("Masukkan No Rekening Anda\t: ");
                if (scanner.hasNextLine())
                nomorRekening = scanner.nextLine();

                System.out.print("Masukkan Nominal Setoran\t: ");
                if (scanner.hasNextLine())
                    nominal = scanner.nextInt();
                Setoran.setoran();

                System.out.println("================================================================");

                int i = Integer.parseInt(nasabahh.getSaldo());
                int ii = (nominal);
                int updateSaldo1 = i + ii;
                System.out.print("Saldo: " + updateSaldo1);             
                System.out.println();

                int random_int1 = (int) Math.floor(Math.random() * (max1 - min1 + 1) + min1);
                String idTransaksi1 = "SET" + random_int1;
                System.out.println("Id Transaksi: " + idTransaksi1);

                Date tanggalDate1 = new Date();
                SimpleDateFormat sdf1 = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
                String formattedDate1 = sdf1.format(tanggalDate1);
                System.out.println("Tanggal dan Waktu: " + formattedDate1);

                setoran.add(new Setoran(nomorRekening,nominal,updateSaldo1,idTransaksi1, tanggalDate1));
                System.out.println(setoran.get(0));

                // tampil
                // for (Setoran setoran2 : setoran) {
                //     System.out.println("Nomor Rekening \t Nominal \t Update Saldo \t ID Transaksi \t Tanggal dan Waktu");
                //     System.out.print(setoran2);
                // }
                tampilDataSetoran();
                break;

            case 2:
            int min2 = 1;
            int max2 = 100;

                System.out.print("Masukkan No Rekening Anda\t: ");
                if (scanner.hasNextLine())
                nomorRekening = scanner.nextLine();

                System.out.print("Masukkan Nominal Penarikan\t: ");
                if (scanner.hasNextLine())
                    nominal = scanner.nextInt();
                Penarikan.penarikan();

                System.out.println("================================================================");

                int i2 = Integer.parseInt(nasabahh.getSaldo());
                int ii2 = (nominal);
                int updateSaldo2 = i2 - ii2;
                System.out.println("Saldo: " + updateSaldo2);
                updateSaldo2 = scanner.nextInt();

                int random_int2 = (int) Math.floor(Math.random() * (max2 - min2 + 1) + min2);
                String idTransaksi2 = "PEN" + random_int2;
                System.out.println("Id Transaksi: " + idTransaksi2);     

                Date tanggalDate2 = new Date();
                SimpleDateFormat sdf2 = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
                String formattedDate2 = sdf2.format(tanggalDate2);
                System.out.println("Tanggal dan Waktu: " + formattedDate2);

                penarikan.add(new Penarikan(nomorRekening,nominal,updateSaldo2,idTransaksi2, tanggalDate2));
                System.out.println(penarikan.get(0));

                // tampil
                // for (Penarikan penarikan2 : penarikan) {
                //     System.out.println("Nomor Rekening \t Nominal \t Update Saldo \t ID Transaksi \t Tanggal dan Waktu");
                //     System.out.print(penarikan2);
                // }
                tampilDataPenarikan();

                break;

            default:
                System.out.println("Invalid choice.");
        }
        System.out.println("Do you want to go back to the main menu? (yes/no): ");
        String goBack = scanner.nextLine();
        if (goBack.equalsIgnoreCase("yes")) {
            return;
        } else if (goBack.equalsIgnoreCase("no")) {
            System.out.println("Thank you and see you again");
            System.out.println("Goodbye!");
            System.exit(0);
        }
    }

    public static boolean displayPinjaman(){
        int min = 1;
        int max = 100;
        Scanner input = new Scanner(System.in);
        String idTransaksi = " ";
        long jumlahPinjaman = 0;
        ArrayList<Nasabah> nasabahList = new ArrayList<>();

        System.out.print("Masukkan Nomor Rekening\t\t: ");
        if (input.hasNextLine()) {
            String nasabah = input.nextLine();
            nasabahList.add(new Nasabah(nasabah));
        }
        
        System.out.print("Masukkan Nominal Pinjaman\t:");
        if (input.hasNextLine())
            jumlahPinjaman = input.nextLong();
        
        System.out.println("================================================================");

        int random_int = (int)Math.floor(Math.random() * (max - min + 1) + min);
        String idTransaksi2 = "PIN" + random_int;
        System.out.println("Id Transaksi: " + idTransaksi2);

        pinjaman.add(new Pinjaman(jumlahPinjaman, idTransaksi2, nasabah));
        System.out.println(pinjaman.get(0));

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

    public static void tampilDataUser(){
        for (User user2 : user) {
            System.out.println("Norek \t Username \t Password");
            System.out.println(user2);
        }
    }

    public static void tampilDataNasabah(){
        System.out.println("Nama \t Nomor Rekening \t Usia \t NIK \t Jenis Kelamin \t Nomor Telepon \t Id Transaksi");
        for (Nasabah nasabah2 : nasabah) {
            System.out.println(nasabah2);
        }
    }

    public static void tampilDataSetoran(){
        for (Setoran setoran2 : setoran) {
            System.out.println("Nomor Rekening \t Nominal \t Update Saldo \t ID Transaksi \t Tanggal dan Waktu");
            System.out.println(setoran2);
        }
    }   

    public static void tampilDataPenarikan(){
        for (Penarikan penarikan2 : penarikan) {
                    System.out.println("Nomor Rekening \t Nominal \t Update Saldo \t ID Transaksi \t Tanggal dan Waktu");
                    System.out.print(penarikan2);
                }
    }

    public static void tampilDataPinjaman() {
        for (Pinjaman pinjaman2 : pinjaman) {
            System.out.println("Nomor rekening \t Jumlah Pinjaman \t Id Transaksi");
            System.out.println(pinjaman2);
        }
    }

    public static void removeUser(int john){
        user.remove(john);
    }

    public static void removeNasabah(int john){
        nasabah.remove(john);
    }

    public static void removeSetoran(int john){
        setoran.remove(john);
    }

    public static void removePenarikan(int john){
        penarikan.remove(john);
    }

    public static void removePinjaman(int john){
        pinjaman.remove(john);
    }
}