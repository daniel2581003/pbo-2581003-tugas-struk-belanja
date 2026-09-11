import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nama Barang ke-1: ");
        String nama1 = scanner.nextLine();

        System.out.print("Harga Satuan: ");
        int harga1 = scanner.nextDouble();

        System.out.print("Jumlah: ");
        int jumlah1 = scanner.nextInt();

        scanner.nextLine();

        System.out.print("Nama Barang ke-2: ");
        String nama2 = scanner.nextLine();

        System.out.print("Harga Satuan: ");
        int harga2 = scanner.nextDouble();

        System.out.print("Jumlah: ");
        int jumlah2 = scanner.nextInt();

        scanner.nextLine();

        System.out.print("Nama Barang ke-3: ");
        String nama3 = scanner.nextLine();

        System.out.print("Harga Satuan: ");
        int harga3 = scanner.nextDouble();

        System.out.print("Jumlah: ");
        int jumlah3 = scanner.nextInt();

        System.out.print("Uang yg dibayar: ");
        int uang = scanner.nextInt();

        int totalharga1 = harga1 * jumlah1;
        int totalharga2 = harga2 * jumlah2;
        int totalharga3 = harga3 * jumlah3;
        int totalBelanja = totalharga1 + totalharga2 + totalharga3;
        int kembalian = uang - totalBelanja;

        System.out.println();





    }
}
