class TransaksiPengisian {
    Kendaraan kendaraan;
    BBM bbm;
    double liter;
    double totalBayar;

    TransaksiPengisian(Kendaraan kendaraan, BBM bbm, double liter) {
        this.kendaraan = kendaraan;
        this.bbm = bbm;
        this.liter = liter;
        this.totalBayar = liter * bbm.hargaPerLiter;
    }

    void tampilkanTransaksi() {
        System.out.println("Kendaraan: " + kendaraan.platNomor + ", BBM: " + bbm.namaBBM + ", Liter: " + liter + ", Total: " + totalBayar);
    }
}