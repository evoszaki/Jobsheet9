public class Mahasiswa17 {
    String nama, nim, kelas;
    int nilai;


    public Mahasiswa17() {
    }
    
    public Mahasiswa17(String nama, String nim, String kelas) {
        this.nama = nama;
        this.nim = nim;
        this.kelas = kelas;
        this.nilai = -1;
    }

    void tugasDinilai(int nilai) {
        this.nilai = nilai;
    }
}
