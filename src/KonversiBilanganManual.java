import java.util.Scanner;

public class KonversiBilanganManual {
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
            System.out.print("Pilihan Anda: ");
            int pilihan = scanner.nextInt();

            if (pilihan == 7) {
                System.out.println("Program selesai. Terima kasih!");
                break;
            }

            System.out.print("Masukkan angka: ");
            String input = scanner.next();

            switch (pilihan) {
                case 1:
                    System.out.println("Hasil: " + binerKeDesimal(input));
                    break;
                case 2:
                    System.out.println("Hasil: " + oktalKeDesimal(input));
                    break;
                case 3:
                    System.out.println("Hasil: " + heksaKeDesimal(input));
                    break;
                case 4:
                    System.out.println("Hasil: " + desimalKeBiner(Integer.parseInt(input)));
                    break;
                case 5:
                    System.out.println("Hasil: " + desimalKeOktal(Integer.parseInt(input)));
                    break;
                case 6:
                    System.out.println("Hasil: " + desimalKeHexa(Integer.parseInt(input)));
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }

        scanner.close();
    }

    // Konversi manual biner ke desimal
    public static int binerKeDesimal(String biner) {
        int desimal = 0;
        int panjang = biner.length();
        for (int i = 0; i < panjang; i++) {
            char bit = biner.charAt(panjang - 1 - i);
            if (bit == '1') {
                desimal += (int) Math.pow(2, i);
            }
        }
        return desimal;
    }

    // Konversi manual oktal ke desimal
    public static int oktalKeDesimal(String oktal) {
        int desimal = 0;
        int panjang = oktal.length();
        for (int i = 0; i < panjang; i++) {
            char digit = oktal.charAt(panjang - 1 - i);
            desimal += (digit - '0') * (int) Math.pow(8, i);
        }
        return desimal;
    }

    // Konversi manual hexadecimal ke desimal
    public static int heksaKeDesimal(String heksa) {
        int desimal = 0;
        int panjang = heksa.length();
        for (int i = 0; i < panjang; i++) {
            char digit = heksa.charAt(panjang - 1 - i);
            if (Character.isDigit(digit)) {
                desimal += (digit - '0') * (int) Math.pow(16, i);
            } else {
                desimal += (Character.toUpperCase(digit) - 'A' + 10) * (int) Math.pow(16, i);
            }
        }
        return desimal;
    }

    // Konversi manual desimal ke biner
    public static String desimalKeBiner(int desimal) {
        StringBuilder biner = new StringBuilder();
        while (desimal > 0) {
            biner.insert(0, desimal % 2);
            desimal /= 2;
        }
        return biner.toString();
    }

    // Konversi manual desimal ke oktal
    public static String desimalKeOktal(int desimal) {
        StringBuilder oktal = new StringBuilder();
        while (desimal > 0) {
            oktal.insert(0, desimal % 8);
            desimal /= 8;
        }
        return oktal.toString();
    }

    // Konversi manual desimal ke hexadecimal
    public static String desimalKeHexa(int desimal) {
        StringBuilder heksa = new StringBuilder();
        while (desimal > 0) {
            int sisa = desimal % 16;
            if (sisa < 10) {
                heksa.insert(0, sisa);
            } else {
                heksa.insert(0, (char) ('A' + sisa - 10));
            }
            desimal /= 16;
        }
        return heksa.toString();
    }
}