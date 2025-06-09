import java.util.Scanner;
public class MainSPBU {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AntrianKendaraan antrian = new AntrianKendaraan();
        QueueTransaksi riwayat = new QueueTransaksi(100);

        BBM[] daftarBBM = {
            new BBM("Pertalite", 10000),
            new BBM("Pertamax", 13500),
            new BBM("Solar", 7000)
        };

        int pilihan;
        do {
            System.out.println("\n--- Menu SPBU ---");
            System.out.println("1. Tambah Antrian Kendaraan");
            System.out.println("2. Tampilkan Antrian");
            System.out.println("3. Cek Jumlah Antrian Kendaraan");
            System.out.println("4. Layani Kendaraan");
            System.out.println("5. Tampilkan Riwayat Transaksi");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilihan = sc.nextInt();
            sc.nextLine(); 

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan Plat Nomor: ");
                    String plat = sc.nextLine();
                    System.out.print("Masukkan Jenis Kendaraan: ");
                    String tipe = sc.nextLine();
                    System.out.print("Masukkan Merk: ");
                    String merk = sc.nextLine();
                    antrian.tambahAntrian(new Kendaraan(plat, tipe, merk));
                    break;

                case 2:
                    System.out.println("--- Daftar Antrian ---");
                    antrian.tampilkanAntrian();
                    break;

                case 3:
                    System.out.println("Jumlah Kendaraan Dalam Antrian: " + antrian.jumlahAntrian());
                    break;

                case 4:
                    Kendaraan dilayani = antrian.layaniKendaraan();
                    if (dilayani != null) {
                        System.out.println("Masukkan Jenis BBM:");
                        for (int i = 0; i < daftarBBM.length; i++) {
                            System.out.println((i + 1) + ". " + daftarBBM[i].namaBBM + " - Rp" + daftarBBM[i].hargaPerLiter);
                        }
                        System.out.print("Pilih BBM (1-3): ");
                        int bbmIdx = sc.nextInt() - 1;
                        System.out.print("Masukkan Jumlah Liter: ");
                        double liter = sc.nextDouble();
                        TransaksiPengisian transaksi = new TransaksiPengisian(dilayani, daftarBBM[bbmIdx], liter);
                        riwayat.enqueue(transaksi);
                        System.out.println(">> Transaksi berhasil. Total Bayar: Rp" + transaksi.totalBayar);
                    }
                    break;

                case 5:
                    System.out.println("--- Riwayat Transaksi ---");
                    riwayat.tampilkanTransaksi();
                    break;

                case 0:
                    System.out.println("Terima kasih!");
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }

        } while (pilihan != 0);
    }
}