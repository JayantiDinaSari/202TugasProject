public class PegawaiKontrak extends Pegawai {
    private String nikk;
    private String asalInstansi;
    private int lamaKontrak;

    public void penambahanKontrak(){

    }
    public void pemutusanKontrak(){

    }

    public String getNikk() {
        return nikk;
    }

    public void setNikk(String nikk) {
        this.nikk = nikk;
    }

    public String getAsalInstansi() {
        return asalInstansi;
    }

    public void setAsalInstansi(String asalInstansi) {
        this.asalInstansi = asalInstansi;
    }

    public int getLamaKontrak() {
        return lamaKontrak;
    }

    public void setLamaKontrak(int lamaKontrak) {
        this.lamaKontrak = lamaKontrak;
    }

    @Override
    public void bertugas() {
        super.bertugas();
    }

    @Override
    public void mangajukanKenaikanJabatan() {
        super.mangajukanKenaikanJabatan();
    }
}
