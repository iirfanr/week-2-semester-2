public class Restaurant {
    private String[] nama_makanan;
    private double[] harga_makanan;
    private int[] stok;
    private static byte id = 0;

    public Restaurant() {
        nama_makanan = new String[10];
        harga_makanan = new double[10];
        stok = new int[10];
    }

    public void tambahMenuMakanan(String nama, double harga, int stok) {
        if (stok < 0) {
            System.out.println("Stok tidak boleh negatif.");
            return;
        }

        setNamaMakanan(id, nama);
        setHargaMakanan(id, harga);
        setStok(id, stok);
        nextId();
    }

    //getters
    public String getNamaMakanan(int id) {
        return nama_makanan[id];
    }

    public double getHargaMakanan(int id) {
        return harga_makanan[id];
    }

    public int getStok(int id) {
        return stok[id];
    }

    //setters
    public void setNamaMakanan(int id, String nama) {
        this.nama_makanan[id] = nama;
    }

    public void setHargaMakanan(int id, double harga) {
        this.harga_makanan[id] = harga;
    }

    public void setStok(int id, int stok) {
        this.stok[id] = stok;
    }

    public void tampilMenuMakanan() {
        for (int i = 0; i <= id; i++) {
            if (!isOutOfStock(i)) {
                System.out.println(
                    getNamaMakanan(i) + "[" + getStok(i) + "]" + "\tRp. " + getHargaMakanan(i)
                );
            }
        }
    }

    public void pesanMakanan(String nama, int jumlah) {
        for (int i = 0; i <= id; i++) {
            if (getNamaMakanan(i).equalsIgnoreCase(nama)) {

                if (getStok(i) >= jumlah) {
                    setStok(i, getStok(i) - jumlah);
                    System.out.println("Pesanan berhasil. Total harga:Rp. " + (getHargaMakanan(i) * jumlah));
                } else {
                    System.out.println("Pesanan ditolak, stok tidak mencukupi.");
                }
                return;
            }
        }
        System.out.println("Menu " + nama + " tidak ditemukan.");
    }

    public boolean isOutOfStock(int id) {
        if (stok[id] == 0) {
            return true;
        } else {
            return false;
        } 
    }

    public static void nextId() {
        id++;
    }
}