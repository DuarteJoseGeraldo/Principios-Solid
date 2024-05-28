package org.example.domain.cart;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@Builder
public class Cart {
    private List<Item>items;
    private String status;
    private double total;

    public Cart() {
        this.items = new ArrayList<>();
        this.status = "open";
        this.total = 0.0;
    }

    public void addItem(Item item) {
        this.items.add(item);
        this.total += item.getPrice();
    }

    public boolean confirmOrder(){
        if(validateCart()){
            this.status = "confirmed";
            sendConfirmationEmail();
            return true;
        }
        return false;
    }

    public void sendConfirmationEmail(){
        System.out.println("Email sent");
    }

    public boolean validateCart(){
        return !this.items.isEmpty();
    }
}


