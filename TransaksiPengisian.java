public class TransaksiPengisian {
    Kendaraan kendaraan;
    BBM bbm;
    double liter;
    double totalBayar;

    public TransaksiPengisian(Kendaraan kendaraan, BBM bbm, double liter) {
        this.kendaraan = kendaraan;
        this.bbm = bbm;
        this.liter = liter;
        this.totalBayar = liter * bbm.hargaPerLiter;
    }

    public void tampilkanTransaksi() {
        System.out.println("Kendaraan: " + kendaraan.platNomor + ", BBM: " +
                bbm.namaBBM + ", Liter: " + liter + ", Total: Rp" + totalBayar);
    }
}
