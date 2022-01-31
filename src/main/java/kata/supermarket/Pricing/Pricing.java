package kata.supermarket.Pricing;

import kata.supermarket.CalculateTotal.PricingScheme;
import kata.supermarket.Item.Item;

import java.util.List;

public interface Pricing {

    PricingScheme getPricing(List<Item> items);

}
