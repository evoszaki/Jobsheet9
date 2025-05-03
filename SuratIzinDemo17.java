import java.util.Scanner;

public class SuratIzinDemo17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StackSurat stackSurat = new StackSurat(5); 
        int pilih = 0;
        
        do {
            System.out.println("\nMenu Pengelolaan Surat Izin:");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Izin Terakhir");
            System.out.println("4. Cari Surat");
            System.out.println("5. Keluar");
            System.out.print("Pilih: ");
            pilih = scan.nextInt();
            scan.nextLine(); 
            
            switch (pilih) {
                case 1:
                    System.out.print("ID Surat: ");
                    String idSurat = scan.nextLine();
                    System.out.print("Nama Mahasiswa: ");
                    String namaMahasiswa = scan.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = scan.nextLine();
                    
                    char jenisIzin;
                    do {
                        System.out.print("Jenis Izin (S: Sakit, I: Izin Keperluan Lain): ");
                        jenisIzin = scan.nextLine().toUpperCase().charAt(0);
                    } while (jenisIzin != 'S' && jenisIzin != 'I');
                    
                    System.out.print("Durasi (hari): ");
                    int durasi = scan.nextInt();
                    scan.nextLine(); 
                    
                    Surat17 suratBaru = new Surat17(idSurat, namaMahasiswa, kelas, jenisIzin, durasi);
                    stackSurat.push(suratBaru);
                    break;
                    
                case 2:
                    Surat17 suratProses = stackSurat.pop();
                    if (suratProses != null) {
                        System.out.println("Memproses surat izin:");
                        suratProses.print();
                        System.out.println("Surat berhasil diproses.");
                    }
                    break;
                    
                case 3:
                    Surat17 suratLihat = stackSurat.peek();
                    if (suratLihat != null) {
                        System.out.println("Surat izin terakhir:");
                        suratLihat.print();
                    }
                    break;
                    
                case 4:
                    System.out.print("Masukkan nama mahasiswa yang dicari: ");
                    String namaCari = scan.nextLine();
                    stackSurat.cariSurat(namaCari);
                    break;
                    
                case 5:
                    System.out.println("Terima kasih telah menggunakan program ini.");
                    break;
                    
                default:
                    System.out.println("Pilihan tidak valid.");
            }
            
        } while (pilih != 5);
        
        scan.close();
    }
}