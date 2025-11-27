package org.events;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderSaveEvent {
    private Long orderId;
    private Long productId;
    private int quantity;
}