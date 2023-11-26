public class Invoice extends Item {
        private String invoiceNumber;
        private String customerName;
    
        //konstruktor
        public Invoice(String invoiceNumber, String customerName, String itemName, double itemPrice, int quantity ){
            super(itemName, itemPrice, quantity); //memanggil method item dari kelas item
            this.invoiceNumber = invoiceNumber;
            this.customerName = customerName;
        }
    
        //memanggil method hitungTotalBayar dari kelas item
        @Override
        public double hitungTotalBayar(){
            return super.hitungTotalBayar();
        }
    
        // Representasi string dari objek Invoice
        @Override
        public String toString(){
            return "Nomor Faktur :" + invoiceNumber + "\nNama Pelanggan :" + customerName + "\n" + super.toString();
        }
    }

