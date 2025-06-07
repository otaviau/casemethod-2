public class QueueTransaksi {
    TransaksiPengisian[] data;
    int front, rear, size;

    QueueTransaksi(int kapasitas) {
        data = new TransaksiPengisian[kapasitas];
        front = rear = size = 0;
    }

    void enqueue(TransaksiPengisian t) {
        if (size == data.length) {
            System.out.println("Riwayat transaksi penuh.");
            return;
        }
        data[rear] = t;
        rear = (rear + 1) % data.length;
        size++;
    }

    void tampilkanTransaksi() {
        if (size == 0) {
            System.out.println("Belum ada transaksi.");
            return;
        }
        int idx = front;
        for (int i = 0; i < size; i++) {
            data[idx].tampilkanTransaksi();
            idx = (idx + 1) % data.length;
        }
    }
}