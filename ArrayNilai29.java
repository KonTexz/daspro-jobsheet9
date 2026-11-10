import java.util.Scanner;

public class ArrayNilai29 {
    public static void main(String[] args) {
        int[] nilaiAkhir = new int[10];
        Scanner input = new Scanner(System.in);

        int no = 1;
        for (int nilai : nilaiAkhir) {
            System.out.print("Masukkan nilai mahasiswa ke-" + no + ": ");
            nilai = input.nextInt();
            no++;
        }

        no = 1;
        for (int nilai : nilaiAkhir) {
            String status = (nilai > 70) ? "LULUS" : "TIDAK LULUS";
            System.out.println("Mahasiswa ke-" + no + ": " + nilai + " (" + status + ")");
            no++;
        }

        input.close();
    }
}