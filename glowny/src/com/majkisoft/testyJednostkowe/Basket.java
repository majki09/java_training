package com.majkisoft.testyJednostkowe;

import java.util.Map;
import java.util.TreeMap;

public class Basket
{
//    private Map items;
//    private double totalPrice;

    private final Map<Item, Integer> order = new TreeMap<>();

//    public Basket(Map items, double totalPrice)
//    {
//        this.items = items;
//        this.totalPrice = totalPrice;
//    }

    public void addItem(Item item)
    {
        addItem(item, 1);
    }

    public void addItem(Item item, int quantity)
    {
        if (quantity > 0) {
            if (order.containsKey(item)) {
                quantity = order.get(item) + quantity;
            }
            order.put(item, quantity);
        }
    }

    public void removeItem(Item item)
    {
        removeItem(item, 1);
    }

    public void removeItem(Item item, int quantity)
    {
        if (order.containsKey(item) && quantity > 0) {
            quantity = order.get(item) - quantity;
            if (quantity == 0)
                order.remove(item);
            else if (quantity < 0) {
            }
        }
    }

    public double getTotalPrice()
    {
        double totalPrice = 0;

        for (Map.Entry<Item, Integer> orderItem : order.entrySet()) {
            totalPrice += orderItem.getKey().getPrice() * orderItem.getValue();
        }

        return totalPrice;
    }
}
