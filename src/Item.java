public class Item implements HitungTotalBayar {
    private String itemName;
    private double itemPrice;
    private int quantity;

    public Item(String itemName, double itemPrice,int quantity){
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.quantity = quantity;

    }

    public double hitungTotalBayar(){// interface dari hitungTotalBayar
        return itemPrice*quantity;
    }

    @Override
    public String toString(){
        return "Nama Barang :" + itemName + "\nHarga Barang :" + itemPrice + "\nJumlah Beli :" + quantity ;
    }


    
}