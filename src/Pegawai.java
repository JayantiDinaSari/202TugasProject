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
}
