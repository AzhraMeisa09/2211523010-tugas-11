public class Invoice extends Item {
        private String invoiceNumber;
        private String customerName;
    
        public Invoice(String invoiceNumber, String customerName, String itemName, double itemPrice, int quantity ){
            super(itemName, itemPrice, quantity); //memanggil method barang dari kelas barang
            this.invoiceNumber = invoiceNumber;
            this.customerName = customerName;
        }
    
        @Override
        public double hitungTotalBayar(){
            return super.hitungTotalBayar();//memanggil method hitungTotalBayar dari kelas barang
        }
    
        @Override
        public String toString(){
            return "Nomor Faktur :" + invoiceNumber + "\nNama Pelanggan :" + customerName + "\n" + super.toString();
        }
    }

