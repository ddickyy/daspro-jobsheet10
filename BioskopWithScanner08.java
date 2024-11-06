import java.util.Scanner;

public class BioskopWithScanner08 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] kursi = new String[5][10];
        String [] penonton = new String [100];
        int jumlahPenonton = 0;
        int pilihan;

        do {
            System.out.println("=== Menu ===");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Tampilkan status kursi");
            System.out.println("4. Exit");
            System.out.print("Pilih menu (1-4): ");
            pilihan = sc.nextInt();
            sc.nextLine(); // 

            switch (pilihan) {
                case 1:
                    boolean valid = false;
                    while (!valid) {
                        System.out.print("Masukkan nomor baris (1-5): ");
                        int baris = sc.nextInt() - 1;
                        System.out.print("Masukkan nomor kolom (1-10): ");
                        int kolom = sc.nextInt() - 1; 

                        if (baris < 0 || baris >= kursi.length || kolom < 0 || kolom >= kursi[0].length) {
                            System.out.println("Nomor baris atau kolom tidak valid. Silakan coba lagi.");
                        } else if (kursi[baris][kolom] != null) {
                            System.out.println("Kursi sudah terisi. Silakan pilih kursi lain.\n");
                        } 
                            sc.nextLine();
                            System.out.print("Masukkan nama penonton: ");
                            String nama = sc.nextLine();
                            kursi[baris][kolom] = nama;
                            System.out.println("Data penonton berhasil ditambahkan.\n");
                            valid = true; 
                        
                    }
                    break;
                case 2:
                    System.out.println("Daftar Penonton:");
                    boolean adaPenonton = false;
                    for (int i = 0; i < kursi.length; i++) {
                        for (int j = 0; j < kursi[i].length; j++) {
                            if (kursi[i][j] != null) {
                                System.out.println("Kursi (" + (i + 1) + ", " + (j + 1) + "): " + kursi[i][j]);
                                adaPenonton = true;
                            } else {
                                System.out.println("Kursi (" + (i + 1) + ", " + (j + 1) + "): ***");
                            }
                        }
                    }
                    if (!adaPenonton) {
                        System.out.println("Tidak ada penonton yang terdaftar.");
                    }
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Status Kursi:");
                    for (int i = 0; i < kursi.length; i++) {
                        for (int j = 0; j < kursi[i].length; j++) {
                            if (kursi[i][j] == null) {
                                System.out.print("Kursi (" + (i + 1) + ", " + (j + 1) + "): Kosong\t");
                            } else {
                                System.out.print("Kursi (" + (i + 1) + ", " + (j + 1) + "): Terisi\t");
                            }
                        }
                        System.out.println();
                    }
                    System.out.println();
                    break;
                case 4:
                    break;
                default:
                    break;
            }
        } while (pilihan != 4);
    }
}