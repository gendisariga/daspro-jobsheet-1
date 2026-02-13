public class royalGarden  {

    public static void main(String[] args) {

        // Stock bunga (baris = cabang, kolom = jenis bunga)
        int[][] stock = {
            {10, 5, 15, 7},   // RoyalGarden 1
            {6, 11, 9, 12},   // RoyalGarden 2
            {2, 10, 10, 5},   // RoyalGarden 3
            {5, 7, 12, 9}     // RoyalGarden 4
        };

        // Harga bunga
        int[] harga = {75000, 50000, 60000, 10000};

        // Nama cabang
        String[] cabang = {
            "RoyalGarden 1",
            "RoyalGarden 2",
            "RoyalGarden 3",
            "RoyalGarden 4"
        };

        System.out.println("==========================================================");
        System.out.printf("%-15s %-18s %-15s\n", "Cabang", "Pendapatan", "Status");
        System.out.println("==========================================================");

        for (int i = 0; i < stock.length; i++) {

            int pendapatan = 0;

            for (int j = 0; j < stock[i].length; j++) {
                pendapatan += stock[i][j] * harga[j];
            }

            String status;

            if (pendapatan > 1500000) {
                status = "Sangat Baik";
            } else {
                status = "Perlu Evaluasi";
            }

            System.out.printf("%-15s Rp %-15d %-15s\n",
                    cabang[i],
                    pendapatan,
                    status);
        }

        System.out.println("==========================================================");
    }
}

