import java.util.Scanner;

public class DeretBilangan {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String nim;
        int n;

        System.out.print("Masukkan NIM: ");
        nim = input.nextLine();

        //  Ambil 2 digit terakhir NIM //
        n = Integer.parseInt(nim.substring(nim.length() - 2));

        //  Jika n < 10 → tambah 10//
        if (n < 10) {
            n += 10;
        }

        System.out.println("n = " + n);
        System.out.print("Output: ");

        //  Perulangan 1 sampai n//
        for (int i = 1; i <= n; i++) {

            //  Skip 10 & 15//
            if (i == 10 || i == 15) {
                continue;
            }

            //  Kelipatan 3 → #//
            if (i % 3 == 0) {
                System.out.print("# ");
            }
            //  Genap → angka asli//
            else if (i % 2 == 0) {
                System.out.print(i + " ");
            }
            //  Ganjil → *//

            else {
                System.out.print("* ");
            }
        }
    }
}
