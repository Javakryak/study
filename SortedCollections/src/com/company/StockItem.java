package com.company;

public class StockItem implements Comparable<StockItem> {
    private final String name;
    private double price;
    private int quantityStock;
    private int reservedQuantity;

    public StockItem(String name, double price) {
        this.name = name;
        this.price = price;
        this.quantityStock = 0;
        this.reservedQuantity = 0;
    }

    public StockItem(String name, double price, int quantityStock) {
        this.name = name;
        this.price = price;
        this.quantityStock = quantityStock;
        this.reservedQuantity = 0;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

//    public void setPrice(double price) {
//        if (price > 0.0) {
//            this.price = price;
//        }
//    }

    public int quantityInStock() {
        return quantityStock - reservedQuantity;
    }

    public int getReservedQuantity() {
        return reservedQuantity;
    }

    public void adjustReserved (int q){
        int newQ = this.reservedQuantity + q;
        if (newQ >= 0){
            this.reservedQuantity = newQ;
        }
    }

    public void adjustStock(int q) {
        int newQ = this.quantityStock + q;
        if (newQ >= 0) {
            this.quantityStock = newQ;
        }
    }

    @Override
    public boolean equals(Object obj) {
        System.out.println("Entering stockItem.equals");
        if (obj == this) {
            return true;
        }

        if ((obj == null) || (obj.getClass() != this.getClass())) {
            return false;
        }

        String objName = ((StockItem) obj).getName();
        return this.name.equals(objName);
    }

    @Override
    public int hashCode() {
        return this.name.hashCode() + 31;
    }

    @Override
    public int compareTo(StockItem o) {
        System.out.println("Entering stockItem.compareTo");
        if (this == o) {
            return 0;
        }

        if (o != null) {
            return this.name.compareTo(o.getName());
        }

        throw new NullPointerException();
    }

    @Override
    public String toString() {
        return this.name + " : price " + "$" + String.format("%.2f", this.price);
    }
}
