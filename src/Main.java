import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.forLanguageTag("id-ID"));

        // Polymorphism: referensi Pegawai berisi objek dari subclass berbeda.
        Pegawai[] daftarPegawai = {
            new PegawaiTetap("Topan", 4000000L, 1000000L),
            new PegawaiKontrak("Ardi", 160, 25000L)
        };

        System.out.println("=== PERHITUNGAN GAJI PEGAWAI ===");
        for (Pegawai pegawai : daftarPegawai) {
            pegawai.tampilkanInfo();
            System.out.println();
        }
    }
}
