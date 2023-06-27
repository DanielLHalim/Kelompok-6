import model.Penarikan;
import model.Setoran;

import java.util.*;

public class tes {
    private static List<Saldo> daftarSaldo = new ArrayList<>();
    private static List<Penarikan> daftarPenarikan = new ArrayList<>();
    private static List<Setoran> daftarSetoran = new ArrayList<>();
    private static List<Pinjaman> daftarPinjaman = new ArrayList<>();

    public static void main(String[] args) {
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

            System.out.print("\nMasukkan pilihan: ");
            Scanner input = new Scanner(System.in);
            int selectedMenu = input.nextInt();

            switch (selectedMenu) {
                case 1:
                    displaySaldo();
                    break;
                case 2:
                    penarikan();
                    break;
                case 3:
                    setoran();
                    break;
                case 4:
                    pinjaman();
                    break;
                case 5:
                    historiTransaksi();
                    break;
                case 6:
                    infoNasabah();
                    break;
                case 7:
                    end = false;
                    System.out.println("Terima kasih dan sampai jumpa lagi!");
                    break;
                default:
                    System.out.println("\nPilihan tidak valid.");
                    break;
            }
        }
    }

    public static void init() {
        // Inisialisasi data awal
    }

    public static void displaySaldo() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nCek Saldo :");
        System.out.print("Nomor Rekening: ");
        String nomorRekening = scanner.nextLine();

        Saldo saldoObj = findSaldoByNomorRekening(nomorRekening);
        if (saldoObj == null) {
            System.out.println("Saldo tidak ditemukan.");
        } else {
            System.out.println(saldoObj);
        }

        System.out.print("Apakah Anda ingin kembali ke menu utama? (ya/tidak): ");
        String goBack = scanner.nextLine();
        if (goBack.equalsIgnoreCase("ya")) {
            return;
        } else if (goBack.equalsIgnoreCase("tidak")) {
                    System.out.println("Terima kasih dan sampai jumpa lagi!");
        System.exit(0);
    }

    scanner.close();
}

public static void penarikan() {
    Scanner scanner = new Scanner(System.in);

    System.out.println("\nPenarikan :");
    System.out.print("Nomor Rekening: ");
    String nomorRekening = scanner.nextLine();

    Saldo saldoObj = findSaldoByNomorRekening(nomorRekening);
    if (saldoObj == null) {
        System.out.println("Saldo tidak ditemukan.");
        return;
    }

    System.out.print("Nominal Penarikan: ");
    String nominal = scanner.nextString();

    String saldoAkhir = saldoObj.getSaldo() - nominal;

    System.out.print("Kode Transaksi: ");
    String kodeTransaksi = scanner.nextLine();

    Penarikan penarikan = new Penarikan(nominal, saldoAkhir, kodeTransaksi);
    daftarPenarikan.add(penarikan);

    System.out.println(penarikan);
    System.out.println();

    scanner.close();
}

public static void setoran() {
    Scanner scanner = new Scanner(System.in);

    System.out.println("\nSetoran :");
    System.out.print("Nomor Rekening: ");
    String nomorRekening = scanner.nextLine();

    Saldo saldoObj = findSaldoByNomorRekening(nomorRekening);
    if (saldoObj == null) {
        System.out.println("Saldo tidak ditemukan.");
        return;
    }

    System.out.print("Nominal Setoran: ");
    String nominal = scanner.nextLine();

    String saldoAkhir = saldoObj.getSaldo() + nominal;

    System.out.print("Update Saldo: ");
    System.out.println(saldoAkhir);

    System.out.print("Kode Transaksi: ");
    String kodeTransaksi = scanner.nextLine();

    Setoran setoran = new Setoran(nominal, saldoAkhir, kodeTransaksi);
    daftarSetoran.add(setoran);

    System.out.println(setoran);
    System.out.println();

    scanner.close();
}

public static void Pinjaman() {
    Scanner scanner = new Scanner(System.in);

    System.out.println("\nPinjaman :");
    System.out.print("Nomor Rekening: ");
    String nomorRekening = scanner.nextLine();

    Saldo saldoObj = findSaldoByNomorRekening(nomorRekening);
    if (saldoObj == null) {
        System.out.println("Saldo tidak ditemukan.");
        return;
    }


    System.out.print("Nasabah: ");
    String nasbah = scanner.nextLine();

    System.out.print("Nominal: ");
    String kodeTransaksi = scanner.nextLine();

    System.out.print("Kode Transaksi: ");
    String kodeTransaksi = scanner.nextLine();

    Pinjaman pinjaman = new Pinjaman(nominal, kodeTransaksi);
    daftarPinjaman.add(pinjaman);

    System.out.println(pinjaman);
    System.out.println();

    scanner.close();
}

public static void historiTransaksi() {
    Scanner scanner = new Scanner(System.in);

    System.out.println("\nHistori Transaksi :");
    // Implementasi logika untuk menampilkan histori transaksi
    System.out.println("Segera hadir...");

    System.out.print("Apakah Anda ingin kembali ke menu utama? (ya/tidak): ");
    String goBack = scanner.nextLine();
    if (goBack.equalsIgnoreCase("ya")) {
        return;
    } else if (goBack.equalsIgnoreCase("tidak")) {
        System.out.println("Terima kasih dan sampai jumpa lagi!");
        System.exit(0);
    }

    scanner.close();
}

public static void infoNasabah() {
    Scanner scanner = new Scanner(System.in);

    System.out.println("\nInfo Nasabah :");
    // Implementasi logika untuk menampilkan info nasabah
    System.out.println("Segera hadir...");

    System.out.print("Apakah Anda ingin kembali ke menu utama? (ya/tidak): ");
    String goBack = scanner.nextLine();
    if (goBack.equalsIgnoreCase("ya")) {
        return;
    } else if (goBack.equalsIgnoreCase("tidak")) {
        System.out.println("Terima kasih dan sampai jumpa lagi!");
        System.exit(0);
    }

    scanner.close();
}

public static Saldo findSaldoByNomorRekening(String nomorRekening) {
    for (Saldo saldo : daftarSaldo) {
        if (saldo.getNomorRekening().equals(nomorRekening)) {
            return saldo;
        }
    }
    return null;
}
}

