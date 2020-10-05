package com.company;

import java.util.Map;

public class Main {
private static StockList stockList = new StockList();

    public static void main(String[] args) {
	StockItem temp = new StockItem("bread", 0.86, 100);
	stockList.addStock(temp);

	temp = new StockItem("cake", 1.10, 7);
	stockList.addStock(temp);

        temp = new StockItem("car", 12.50, 2);
        stockList.addStock(temp);

        temp = new StockItem("chair", 62.0, 10);
        stockList.addStock(temp);

        temp = new StockItem("cup", 0.50, 200);
        stockList.addStock(temp);

        temp = new StockItem("cup", 0.45, 7);
        stockList.addStock(temp);

        temp = new StockItem("door", 72.95, 4);
        stockList.addStock(temp);

        temp = new StockItem("juice", 2.50, 36);
        stockList.addStock(temp);

        temp = new StockItem("phone", 96.99, 35);
        stockList.addStock(temp);

        temp = new StockItem("towel", 2.40, 80);
        stockList.addStock(temp);

        temp = new StockItem("vase", 8.76, 40);
        stockList.addStock(temp);

        System.out.println(stockList);


        Basket timsBasket = new Basket ("Tim");
        addToBasket(timsBasket, "car", 1);
        System.out.println(timsBasket);
        System.out.println(stockList);

        addToBasket(timsBasket, "car", 1);
        System.out.println(timsBasket);
        System.out.println(stockList);

        addToBasket(timsBasket, "car", 1);
        addToBasket(timsBasket, "beaver", 1);
        System.out.println(timsBasket);
        System.out.println(stockList);

        addToBasket(timsBasket, "juice", 4);
        addToBasket(timsBasket, "cup", 12);
        addToBasket(timsBasket, "bread", 1);
        System.out.println(timsBasket);
        System.out.println(stockList);

//        System.out.println(stockList);
//
//        System.out.println(stockList);
//
        removeFromBasket(timsBasket, "car", 1);
        System.out.println(timsBasket);
        System.out.println(stockList);
//
        removeFromBasket(timsBasket, "car", 3);
        System.out.println(timsBasket);
        System.out.println(stockList);

        removeFromBasket(timsBasket, "car", 1);
        System.out.println(timsBasket);
        System.out.println(stockList);

        checkOut(timsBasket);
        System.out.println(timsBasket);
        System.out.println(stockList);


//
//        removeFromBasket(timsBasket, "car", 2);
//        System.out.println(timsBasket);
//
//        System.out.println(stockList);
    }

    public static int addToBasket(Basket basket, String item, int quantity){
        StockItem stockItem = stockList.get(item);
        if((stockItem == null) || (stockItem.quantityInStock() == 0)){
            System.out.println("We don't sell " + item);
            return 0;
        }
        if (stockList.reserveStock(item, quantity) != 0){
            basket.add(stockItem, quantity);
            return quantity;
        }

        return 0;
    }

    public static int removeFromBasket(Basket basket, String item, int q){
        StockItem stockItem = stockList.get(item);
        int inBasket = basket.getList().get(basket.find(item));
        if (stockItem == null){
            System.out.println("You don't have " + item + " in your basket.");
            return 0;
        } else if (inBasket < q){
            System.out.println("You want to remove " + q + " " + stockItem.getName() + " from your basket, but you only have " + inBasket);
            return 0;
        } else {
            basket.remove(stockItem, q);
        }
        return 0;
    }

    public static void checkOut (Basket basket){
        basket.clear();
    }


}
