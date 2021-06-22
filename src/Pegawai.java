import java.util.Date;

public class Pegawai {
    private int id;
    private String nik;
    private String nama;
    private Date tanggalLahir;
    private String alamat;
    private String jabatan;
    private String golongan;
    private String status;

    public void bertugas(){
        System.out.println("Sedang Bertugas");
    }
    public void sedangCuti(){
        System.out.println("Sedang Cuti");
    }
    public void mangajukanKenaikanJabatan(){

    }
    public void mengajukanKenaikanGaji(){

    }

    public Pegawai() {
    }

    public Pegawai(int id, String nik, String nama, Date tanggalLahir, String alamat, String jabatan, String golongan, String status) {
        this.id = id;
        this.nik = nik;
        this.nama = nama;
        this.tanggalLahir = tanggalLahir;
        this.alamat = alamat;
        this.jabatan = jabatan;
        this.golongan = golongan;
        this.status = status;
    }

    public Pegawai(int id, String nik, String nama) {
        this.id = id;
        this.nik = nik;
        this.nama = nama;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNik() {
        return nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Date getTanggalLahir() {
        return tanggalLahir;
    }

    public void setTanggalLahir(Date tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getJabatan() {
        return jabatan;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    public String getGolongan() {
        return golongan;
    }

    public void setGolongan(String golongan) {
        this.golongan = golongan;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
