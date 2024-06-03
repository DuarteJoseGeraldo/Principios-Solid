package org.example;

import org.example.domain.cart.Item;
import org.example.domain.order.Order;
import org.example.service.EmailService;

public class App {
    public static void main(String[] args) {
        Order order = new Order();
        order.getCart().addItem(Item.builder().description("Porta copos").price(5.60).build());
        order.getCart().addItem(Item.builder().description("Lampada").price(6.45).build());
        for(Item item : order.getCart().getItems()){
            order.setTotal(order.getTotal() + item.getPrice());
        }
        System.out.println(order);
        System.out.println("Carrinho valido: " + order.getCart().validateCart());
        System.out.println("Status do pedido: " + order.getStatus());
        order.confirmOrder();
        System.out.println("Status do pedido: " + order.getStatus());
        if(order.getStatus().equals("confirmed")) {
            System.out.println("Email: " + EmailService.sendEmail());
        }
    }
}