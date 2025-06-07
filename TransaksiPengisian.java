public class TransaksiPengisian {
    Kendaraan kendaraan;
    BBM bbm;
    double liter, totalBayar;
    TransaksiPengisian (Kendaraan kendaraan, BBM bbm, double liter) {
        this.kendaraan = kendaraan;
        this.bbm = bbm;
        this.liter = liter;
        this.totalBayar = hitungTotalBayar();
    }
 
    public void tampil() {
        System.out.println("Kendaraan: " + kendaraan.getNama());
        System.out.println("BBM: " + bbm.getNama());
        System.out.println("Liter: " + liter);
        System.out.println("Total Bayar: Rp " + totalBayar);
        System.out.println("---------------------------");
    }
}