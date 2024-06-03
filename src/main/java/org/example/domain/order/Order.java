package org.example.domain.order;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.example.domain.cart.Cart;
@Data
@Builder
@AllArgsConstructor
public class Order {
    private String status;
    private Cart cart;
    private double total;

    public Order(){
        this.status = "open";
        this.cart = new Cart();
        this.total = 0;
    }

    public boolean confirmOrder(){
        if(this.cart.validateCart()){
            this.setStatus("confirmed");
            return true;
        }
        return false;
    }
}
