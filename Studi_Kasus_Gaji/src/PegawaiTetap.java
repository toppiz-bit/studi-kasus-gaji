/** Inheritance: PegawaiTetap mewarisi Pegawai. */
public class PegawaiTetap extends Pegawai {
    private long gajiPokok;
    private long tunjangan;

    public PegawaiTetap(String nama, long gajiPokok, long tunjangan) {
        super(nama);
        this.gajiPokok = gajiPokok;
        this.tunjangan = tunjangan;
    }

    @Override
    public long hitungGaji() {
        return gajiPokok + tunjangan;
    }
}
