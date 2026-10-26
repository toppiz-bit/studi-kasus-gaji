/** Abstract class: menyimpan data dan perilaku umum semua pegawai. */
public abstract class Pegawai {
    private String nama;

    public Pegawai(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public abstract long hitungGaji();

    public void tampilkanInfo() {
        System.out.println("Nama: " + nama);
        System.out.printf("Gaji: Rp%,d%n", hitungGaji());
    }
}
