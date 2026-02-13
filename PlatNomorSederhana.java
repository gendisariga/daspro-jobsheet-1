import java.util.Scanner;

public class PlatNomorSederhana {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Array kode plat
        char[] kodePlat = {'A','B','D','E','F','G','H','L','N','T'};

        // Array nama kota
        String[] namaKota = {
            "BANTEN",
            "JAKARTA",
            "BANDUNG",
            "CIREBON",
            "BOGOR",
            "PEKALONGAN",
            "SEMARANG",
            "SURABAYA",
            "MALANG",
            "TEGAL"
        };

        // Input kode plat
        System.out.print("Masukkan kode plat nomor: ");
        char inputKode = input.next().toUpperCase().charAt(0);

        boolean ditemukan = false;

        // Proses pencarian
        for (int i = 0; i < kodePlat.length; i++) {

            if (inputKode == kodePlat[i]) {

                System.out.println("Kota: " + namaKota[i]);
                ditemukan = true;
                break;
            }
        }

        // Jika tidak ditemukan
        if (!ditemukan) {
            System.out.println("Kode plat tidak ditemukan.");
        }
    }
}

 
    

