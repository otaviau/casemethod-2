public class Kendaraan {
    String platNomor, tipe, merk;

    public Kendaraan(String plat, String tipe, String merk) {
        this.platNomor = plat;
        this.tipe = tipe;
        this.merk = merk;
    }

    public void tampilkanInformasi() {
        System.out.println(platNomor + " - " + tipe + " - " + merk);
    }
}