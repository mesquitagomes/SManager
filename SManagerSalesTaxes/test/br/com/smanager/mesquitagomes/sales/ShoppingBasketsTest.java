package br.com.smanager.mesquitagomes.sales;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ShoppingBasketsTest {

    private ShoppingBasket shoppingBasket;

    @Test
    void testInput1() {
	shoppingBasket = new ShoppingBasket();
	shoppingBasket.addSalesItem(new SalesItemFactory().create("1 book at 12.49"));
	shoppingBasket.addSalesItem(new SalesItemFactory().create("1 music CD at 14.99"));
	shoppingBasket.addSalesItem(new SalesItemFactory().create("1 chocolate bar at 0.85"));
	assertEquals(1.50, shoppingBasket.getTotalTax());
	assertEquals(29.83, shoppingBasket.getTotal());
    }

    @Test
    void testInput2() {
	shoppingBasket = new ShoppingBasket();
	shoppingBasket.addSalesItem(new SalesItemFactory().create("1 imported box of chocolates at 10.00"));
	shoppingBasket.addSalesItem(new SalesItemFactory().create("1 imported bottle of perfume at 47.50"));
	assertEquals(7.65, shoppingBasket.getTotalTax());
	assertEquals(65.15, shoppingBasket.getTotal());
    }

    @Test
    void testInput3() {
	shoppingBasket = new ShoppingBasket();
	shoppingBasket.addSalesItem(new SalesItemFactory().create("1 imported bottle of perfume at 27.99"));
	shoppingBasket.addSalesItem(new SalesItemFactory().create("1 bottle of perfume at 18.99"));
	shoppingBasket.addSalesItem(new SalesItemFactory().create("1 packet of headache pills at 9.75"));
	shoppingBasket.addSalesItem(new SalesItemFactory().create("1 imported box of chocolates at 11.25"));
	assertEquals(6.70, shoppingBasket.getTotalTax());
	assertEquals(74.68, shoppingBasket.getTotal());
    }

}
