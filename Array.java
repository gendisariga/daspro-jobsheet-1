import java.util.Scanner;

public class Array {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String[] namaMK = {
            "Pancasila",
            "Konsep Teknologi Informasi",
            "Critical Thinking dan Problem Solving",
            "Matematika Dasar",
            "Bahasa Inggris",
            "Dasar Pemrograman",
            "Praktikum Dasar Pemrograman",
            "Keselamatan dan Kesehatan Kerja"
        };

        double[] nilaiAngka = new double[namaMK.length];
        String[] nilaiHuruf = new String[namaMK.length];
        double[] bobotNilai = new double[namaMK.length];

        double totalBobot = 0;
        int totalSKS = namaMK.length; // diasumsikan tiap MK = 1 SKS 

        System.out.println("Program Menghitung IP Semester");
        System.out.println("=============================");

        // INPUT NILAI ANGKA
        for (int i = 0; i < namaMK.length; i++) {
            System.out.print("masukkan nilai Angka untuk MK " + namaMK[i] + ": ");
            nilaiAngka[i] = input.nextDouble();

            nilaiHuruf[i] = konversiHuruf(nilaiAngka[i]);
            bobotNilai[i] = konversiBobot(nilaiHuruf[i]);

            totalBobot += bobotNilai[i];
        }

        double ip = totalBobot / totalSKS;

        // OUTPUT HASIL
        System.out.println("\nhasil Konversi Nilai");
        System.out.println("==============================================================");
        System.out.printf("%-40s %-12s %-12s %-12s\n", 
                          "MK", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");
        System.out.println("==============================================================");

        for (int i = 0; i < namaMK.length; i++) {
            System.out.printf("%-40s %-12.2f %-12s %-12.2f\n",
                              namaMK[i],
                              nilaiAngka[i],
                              nilaiHuruf[i],
                              bobotNilai[i]);
        }

        System.out.println("==============================================================");
        System.out.printf("\nIP : %.2f\n", ip);
    }

    // KONVERSI ANGKA → HURUF
    static String konversiHuruf(double nilai) {
        if (nilai > 80) return "A";
        else if (nilai > 73) return "B+";
        else if (nilai > 65) return "B";
        else if (nilai > 60) return "C+";
        else if (nilai > 50) return "C";
        else if (nilai > 39) return "D";
        else return "E";
    }

    // KONVERSI HURUF → BOBOT
    static double konversiBobot(String huruf) {
        switch (huruf) {
            case "A":  return 4.0;
            case "B+": return 3.5;
            case "B":  return 3.0;
            case "C+": return 2.5;
            case "C":  return 2.0;
            case "D":  return 1.0;
            default:   return 0.0; // E
        }
    }
}



