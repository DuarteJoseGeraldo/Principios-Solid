package org.example;

import org.example.Cart.Cart;
import org.example.Cart.Item;

public class App {
    public static void main(String[] args) {
        Cart cart = new Cart();
        System.out.println("Items: " + cart.getItems());
        System.out.println("Valor total: " + cart.getTotal());
        cart.addItem(new Item("Misto quente", 4.00));
        cart.addItem(new Item("Toddynho", 1.99));
        cart.addItem(new Item("Coxinha", 3.50));
        System.out.println(cart.getItems());
        System.out.println("Valor total: " + cart.getTotal());
        System.out.println("Status: " + cart.getStatus());
        cart.confirmOrder();
        System.out.println("Status: " + cart.getStatus());
    }
}
