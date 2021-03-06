package kata.supermarket.CalculateTotal;


import kata.supermarket.Item.Item;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

public interface PricingScheme {
    BigDecimal calculateAll();

    static BigDecimal subtotal(List<Item> items) {
        return items.stream().map(Item::price)
                .reduce(BigDecimal::add)
                .orElse(BigDecimal.ZERO)
                .setScale(2, RoundingMode.HALF_UP);
    }

}
