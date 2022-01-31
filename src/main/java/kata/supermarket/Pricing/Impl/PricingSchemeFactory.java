package kata.supermarket.Pricing.Impl;


import kata.supermarket.CalculateTotal.Iml.BasicScheme;
import kata.supermarket.CalculateTotal.Iml.CalculateTotal;
import kata.supermarket.Item.Item;
import kata.supermarket.Pricing.Pricing;
import kata.supermarket.CalculateTotal.PricingScheme;

import java.util.List;


public class PricingSchemeFactory implements Pricing {

    @Override
    public PricingScheme getPricing(List<Item> items) {

        //come from a source. That is 2 because of 2-4-1 pricing
        Integer volume = 2;

        if (volume != null) {
            return new CalculateTotal(items, volume);
        }

        return new BasicScheme(items);

    }

    }


