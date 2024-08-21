import java.util.Scanner;

public class gajikaryawan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Meminta input dari pengguna
        System.out.print("Masukkan jumlah jam kerja: ");
        double jamKerja = input.nextDouble();
        
        System.out.print("Masukkan tarif per jam: ");
        double tarifPerJam = input.nextDouble();
        
        // Menghitung gaji bruto
        double gajiBruto = jamKerja * tarifPerJam;
        
        // Menghitung potongan pajak 10%
        double potonganPajak = gajiBruto * 0.10;
        
        // Menghitung gaji bersih
        double gajiBersih = gajiBruto - potonganPajak;
        
        // Menampilkan hasil
        System.out.println("\n=== Rincian Gaji Karyawan ===");
        System.out.printf("Gaji Bruto: %.2f\n", gajiBruto);
        System.out.printf("Potongan Pajak (10%%): %.2f\n", potonganPajak);
        System.out.printf("Gaji Bersih: %.2f\n", gajiBersih);
        
        input.close();
    }
}