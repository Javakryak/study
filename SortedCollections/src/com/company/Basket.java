package com.company;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class Basket {

    private final String name;
    private final Map<StockItem, Integer> list;

    public Map<StockItem, Integer> getList() {
        return Collections.unmodifiableMap(list);
    }

    public Basket(String name) {
        this.name = name;
        this.list = new TreeMap<>();
    }

    public int add(StockItem item, int q){
        if ((item != null) && (q > 0)){
            int inBasket = list.getOrDefault(item, 0);
            list.put(item, inBasket + q);
            return inBasket;
        }
        return 0;
    }

    public int remove(StockItem item, int q){
        int inBasket = list.get(item);
        if ((item != null) && (q > 0) && (inBasket - q > 0)){
            System.out.println();
            list.replace(item, inBasket-q);
            item.adjustReserved(-q);
            return inBasket;

        } else if ((item != null) && (q > 0) && (inBasket - q == 0)){
            list.remove(item);
            item.adjustReserved(-q);
            System.out.println(item.getName() + " totally removed from basket");
        }
        return 0;
    }

    public void clear() {
        if (list.size() > 0) {
            for (Map.Entry<StockItem, Integer> item : list.entrySet()) {
                StockItem itemInBasket = item.getKey();
                int q = item.getValue();
                itemInBasket.adjustStock(-q);
                itemInBasket.adjustReserved(-q);
            }
            list.clear();
            System.out.println("Thank you for your purchase!");
        } else {
            System.out.println("Your shopping basket is empty");
        }
    }


    public StockItem find(String name) {
        for (Map.Entry<StockItem, Integer> item : list.entrySet()){
            if (item.getKey().getName().equals(name)){
                return item.getKey();
            }
        }
        return null;
    }

    @Override
    public String toString() {
        String s = "\nShopping basket " + name + " contains " + list.size() + ((list.size() == 1) ? " item" : " items") + "\n";
        double totalCost = 0.0;
        for (Map.Entry<StockItem, Integer> item : list.entrySet()) {
            s = s + item.getKey() + ". " + item.getValue() + " reserved\n";
            totalCost += item.getKey().getPrice() * item.getValue();
        }
        return s + "Total cost $" + String.format("%.2f", totalCost);
    }
}
