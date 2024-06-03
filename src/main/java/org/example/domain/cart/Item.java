package org.example.domain.cart;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Item {
    private String description;
    private double price;

    public boolean validateItem(){
        return this.description != null && !this.description.isEmpty() && this.price > 0;
    }
}
