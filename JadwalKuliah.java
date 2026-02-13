import java.util.Scanner;

public class JadwalKuliah {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Masukkan jumlah jadwal kuliah: ");
        int n = input.nextInt();
        input.nextLine();

        // Array 2 dimensi → [baris][kolom]
        String[][] jadwal = new String[n][4];

        inputJadwal(jadwal);

        int pilih;
        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Tampilkan Semua Jadwal");
            System.out.println("2. Cari Jadwal Berdasarkan Hari");
            System.out.println("3. Cari Jadwal Berdasarkan Mata Kuliah");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilih = input.nextInt();
            input.nextLine();

            switch (pilih) {
                case 1:
                    tampilSemua(jadwal);
                    break;
                case 2:
                    cariHari(jadwal);
                    break;
                case 3:
                    cariMK(jadwal);
                    break;
            }

        } while (pilih != 0);
    }

    // ✅ INPUT DATA
    static void inputJadwal(String[][] jadwal) {

        for (int i = 0; i < jadwal.length; i++) {

            System.out.println("\nJadwal ke-" + (i + 1));

            System.out.print("Nama Mata Kuliah : ");
            jadwal[i][0] = input.nextLine();

            System.out.print("Ruang            : ");
            jadwal[i][1] = input.nextLine();

            System.out.print("Hari             : ");
            jadwal[i][2] = input.nextLine();

            System.out.print("Jam              : ");
            jadwal[i][3] = input.nextLine();
        }
    }

    // ✅ TAMPIL SEMUA
    static void tampilSemua(String[][] jadwal) {

        System.out.println("\n==============================================================");
        System.out.printf("%-25s %-15s %-10s %-15s\n",
                "Mata Kuliah", "Ruang", "Hari", "Jam");
        System.out.println("==============================================================");

        for (int i = 0; i < jadwal.length; i++) {
            System.out.printf("%-25s %-15s %-10s %-15s\n",
                    jadwal[i][0],
                    jadwal[i][1],
                    jadwal[i][2],
                    jadwal[i][3]);
        }
    }

    // ✅ CARI BERDASARKAN HARI
    static void cariHari(String[][] jadwal) {

        System.out.print("\nMasukkan hari yang dicari: ");
        String hariCari = input.nextLine();

        boolean ditemukan = false;

        for (int i = 0; i < jadwal.length; i++) {

            if (jadwal[i][2].equalsIgnoreCase(hariCari)) {

                System.out.println("\nDitemukan:");
                System.out.println("MK   : " + jadwal[i][0]);
                System.out.println("Ruang: " + jadwal[i][1]);
                System.out.println("Jam  : " + jadwal[i][3]);

                ditemukan = true;
            }
        }

        if (!ditemukan) {
            System.out.println("Tidak ada jadwal pada hari tersebut.");
        }
    }

    // ✅ CARI BERDASARKAN MK
    static void cariMK(String[][] jadwal) {

        System.out.print("\nMasukkan mata kuliah yang dicari: ");
        String mkCari = input.nextLine();

        boolean ditemukan = false;

        for (int i = 0; i < jadwal.length; i++) {

            if (jadwal[i][0].equalsIgnoreCase(mkCari)) {

                System.out.println("\nDitemukan:");
                System.out.println("Ruang: " + jadwal[i][1]);
                System.out.println("Hari : " + jadwal[i][2]);
                System.out.println("Jam  : " + jadwal[i][3]);

                ditemukan = true;
            }
        }

        if (!ditemukan) {
            System.out.println("Mata kuliah tidak ditemukan.");
        }
    }
}

    

