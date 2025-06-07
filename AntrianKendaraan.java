public class AntrianKendaraan {
    NodeKendaraan head, tail;

    public void tambahAntrian(Kendaraan k) {
        NodeKendaraan baru = new NodeKendaraan(k);
        if (head == null) {
            head = tail = baru;
        } else {
            tail.next = baru;
            tail = baru;
        }
        System.out.println(">> Kendaraan masuk ke dalam antrian.");
    }

    public Kendaraan layaniKendaraan() {
        if (head == null) {
            System.out.println("Antrian kosong.");
            return null;
        }
        Kendaraan keluar = head.data;
        head = head.next;
        if (head == null) tail = null;
        return keluar;
    }
    public void tampilkanAntrian() {
        NodeKendaraan current = head;
        int no = 1;
        if (current == null) {
            System.out.println("Antrian kosong.");
            return;
        }
        while (current != null) {
            System.out.print(no++ + ". ");
            current.data.tampilkanInformasi();
            current = current.next;
        }
    }

    public int jumlahAntrian() {
        int count = 0;
        NodeKendaraan current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }
}