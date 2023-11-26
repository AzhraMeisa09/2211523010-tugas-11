import java.util.Scanner;

public class VirtualDemo {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Input invoice number: ");
            String nomorFaktur = scanner.next();

            System.out.print("input customer name: ");
            String namaPelanggan = scanner.next();

            System.out.print("Input item name: ");
            String namaBarang = scanner.next();

            System.out.print("Input item price: ");
            double hargaBarang = scanner.nextDouble();

            System.out.print("Input quantity: ");
            int jumlahBeli = scanner.nextInt();

             // Membuat objek Invoice
            Invoice invoice = new Invoice( nomorFaktur,namaPelanggan, namaBarang, hargaBarang, jumlahBeli);

            // Menampilkan detail Invoice dan total bayar
            System.out.println("\n========== Detail Faktur ==========\n"+ invoice);
            System.out.println("Total Bayar : Rp.  " + invoice.hitungTotalBayar());
        }
        catch(Exception e){
            System.out.println("Terjadi Kesalahan Input"+ e.getMessage());
        }
        finally{
            scanner.close();
        }
    }
}