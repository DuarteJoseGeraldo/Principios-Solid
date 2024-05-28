package org.example;

import org.example.domain.cart.Cart;
import org.example.domain.cart.Item;

public class App {
    public static void main(String[] args) {
        Cart cart = new Cart();
        System.out.println("Items: " + cart.getItems());
        System.out.println("Valor total: " + cart.getTotal());
        cart.addItem(new Item("Misto quente", 4.00));
        cart.addItem(new Item("Toddynho", 1.99));
        cart.addItem(new Item("Coxinha", 3.50));
        System.out.println(cart.getItems());
        System.out.println("Valor recalculado: " + cart.getTotal());
        System.out.println("Status: " + cart.getStatus());
        if(cart.confirmOrder()){
            System.out.println("Pedido realizado com sucesso!");
        }else{
            System.out.println("Erro ao realizar pedido");
        }
        System.out.println("Status: " + cart.getStatus());
    }
}
