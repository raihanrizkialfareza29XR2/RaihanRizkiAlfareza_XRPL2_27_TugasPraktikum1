import java.util.Scanner; // Berfungsi untuk memasukkan paket scanner

public class Prak1 {
    public static void main(String[] args) { // menggunakan variabel lokal
        Scanner input = new Scanner(System.in); // Membuat scanner baru
        System.out.println("Menghitung Luas Permukaan Bola");
        System.out.println("==============================");
        System.out.print("Masukkan Jari Jari Bola : ");
        double jarijari = input.nextDouble(); // User diminta untuk memasukkan nilai dari jari jari bola yang akan dihitung luas permukaannya
        int pangkat = 2; // Mendeklarasikan nilai pada variabel pangkat untuk kuadratnya nanti
        double luas = (4*3.14* Math.pow(jarijari, pangkat)); // Math.pow itu digunakan untuk pemangkatan (jarijari^pangkat)
        System.out.println("==============================");
        System.out.println(luas); // Menampilkan output luas
    }
}
