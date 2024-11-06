import java.util.Scanner;

public class SIAKAD08 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlah = sc.nextInt();
        System.out.print("Masukkan jumlah mata kuliah: ");
        int mata_kuliah = sc.nextInt();

        int [][] nilai = new int [jumlah][mata_kuliah];


        for (int i = 0; i < jumlah; i++){
            System.out.println("Input nilai Mahasiswa ke-" +(i+1));
            double totalPerSiswa = 0;

            for (int j = 0; j<mata_kuliah; j++) {
                System.out.print("Nilai mata kuliah " + (j+1) + ": ");
                nilai [i][j] = sc.nextInt();
                totalPerSiswa += nilai[i][j];
            }
            System.out.println("Nilai rata-rata: " +totalPerSiswa/3);
        }

        System.out.println("\n====================================");
        System.out.println("Rata-rata Nilai setiap Mata Kuliah");

        for (int j= 0; j <3; j++){
            double totalPerMatkul = 0;

            for (int i = 0; i < 4; i++) {
                totalPerMatkul += nilai[i][j];
            }
            System.out.println("Mata Kuliah " +(j+1) +": " + totalPerMatkul/4);
        }
    }
}