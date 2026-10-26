/** Inheritance: PegawaiKontrak mewarisi Pegawai. */
public class PegawaiKontrak extends Pegawai {
    private int jamKerja;
    private long upahPerJam;

    public PegawaiKontrak(String nama, int jamKerja, long upahPerJam) {
        super(nama);
        this.jamKerja = jamKerja;
        this.upahPerJam = upahPerJam;
    }

    @Override
    public long hitungGaji() {
        return jamKerja * upahPerJam;
    }
}
