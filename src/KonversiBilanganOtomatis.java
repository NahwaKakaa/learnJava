import java.util.Scanner;

public class KonversiBilanganOtomatis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nPilih opsi konversi:");
            System.out.println("1. Biner ke Desimal");
            System.out.println("2. Oktal ke Desimal");
            System.out.println("3. Hexadecimal ke Desimal");
            System.out.println("4. Desimal ke Biner");
            System.out.println("5. Desimal ke Oktal");
            System.out.println("6. Desimal ke Hexadecimal");
            System.out.println("7. Keluar");
            System.out.println("Pilihan Anda: ");
            int pilihan = scanner.nextInt();

            if (pilihan == 7) {
                System.out.println("Program Selesai!");
                break;
            }

            System.out.println("Masukkan Angka: ");
            String input = scanner.next();

            try {
                switch (pilihan) {
                    case 1:
                        System.out.println("Hasil: " + Integer.parseInt(input, 2));
                        break;
                    case 2:
                        System.out.println("Hasil: " + Integer.parseInt(input, 8));
                        break;
                    case 3:
                        System.out.println("Hasil: " + Integer.parseInt(input, 16));
                        break;
                    case 4:
                        System.out.println("Hasil: " + Integer.toBinaryString(Integer.parseInt(input)));
                        break;
                    case 5:
                        System.out.println("Hasil: " + Integer.toOctalString(Integer.parseInt(input)));
                        break;
                    case 6:
                        System.out.println("Hasil: " + Integer.toHexString(Integer.parseInt(input)).toUpperCase());
                        break;
                    default:
                        System.out.println("Pilihan tidak valid!!");
                }
            } catch (NumberFormatException e) {
                System.out.println("Input tidak valid!!");
            }
        }

        scanner.close();
    }
}