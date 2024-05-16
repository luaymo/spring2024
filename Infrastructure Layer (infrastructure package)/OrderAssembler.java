package com.coffeeplace.coffeeshopapp.infrastructure.assembler;

import com.coffeeplace.coffeeshopapp.domain.Order;
import com.coffeeplace.coffeeshopapp.infrastructure.model.OrderDTO;
import org.springframework.stereotype.Component;

@Component
public class OrderAssembler {

    public OrderDTO toDTO(Order order) {
        OrderDTO orderDTO = new OrderDTO();
        orderDTO.setId(order.getId());
        orderDTO.setUserId(order.getUser().getId());
        orderDTO.setItems(order.getItems());
        orderDTO.setTotalPrice(order.getTotalPrice());
        return orderDTO;
    }
}
