package kata.supermarket.CalculateTotal.Iml;

import kata.supermarket.Item.Item;
import kata.supermarket.CalculateTotal.PricingScheme;

import java.math.BigDecimal;
import java.util.List;


public class BasicScheme implements PricingScheme {

    private final List<Item> items;

    public BasicScheme(List<Item> items) {
        this.items = items;
    }

    @Override
    public BigDecimal calculateAll() {
        return PricingScheme.subtotal(items);
    }
}
