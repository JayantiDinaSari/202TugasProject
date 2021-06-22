import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Pegawai jayanti = new Pegawai();
        Pegawai dina    = new Pegawai( 1, "12",  "dina", new Date(), "jl.ini", "HRD", "A", "Aktif");
        Pegawai sari    = new Pegawai(2, "13", "sari");
        Pegawai damai   = new Pegawai(3, "14", "damai");
        Pegawai yanti   = new Pegawai(4, "15", "yanti");
        Pegawai jaya    = new Pegawai(5, "16", "jaya");

    }
}
