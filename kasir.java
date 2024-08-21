import java.util.Scanner;

public class kasir {

    
    
    public static void main(String[] args) {
       // Membuat objek Scanner untuk membaca input dari pengguna
       Scanner scanner = new Scanner(System.in);

       //meminta input dari pengguna
       System.out.println("Masukkan harga awal barang (dalam rupiah): ");
        double hargaAwal = scanner.nextDouble();

        System.out.println("Masukkan presentase diskon(dalam persen): ");
        double presentaseDiskon = scanner.nextDouble();

        System.out.println("Masukkan jumlah barang yang dibeli: ");
        int jumlahBarang = scanner.nextInt();
         
        // Menghitung harga setelah diskon
        double totalHargaAwal = hargaAwal*jumlahBarang;
        double diskon =(presentaseDiskon/100)*totalHargaAwal;
        double totalHargaSetelahDiskon = totalHargaAwal - diskon;

        //menampilkan hasil
        System.out.println("Total harga sebelum diskon: Rp" + totalHargaAwal);
        System.out.println("Jumlah diskon: Rp "+ diskon);
        System.out.println("Total harga setelah diskon: Rp " + totalHargaSetelahDiskon);
   }
}