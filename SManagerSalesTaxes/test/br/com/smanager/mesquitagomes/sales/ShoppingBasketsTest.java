package br.com.smanager.mesquitagomes.sales;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ShoppingBasketsTest {

    private ShoppingBasket shoppingBasket;

    @Test
    void testInput1() {
	shoppingBasket = new ShoppingBasket();
	shoppingBasket.addSalesItem(new SalesItem("book", 12.49, SalesItemTaxType.EXEMPTTAX), 1);
	shoppingBasket.addSalesItem(new SalesItem("music CD", 14.99), 1);
	shoppingBasket.addSalesItem(new SalesItem("chocolate bar", 0.85, SalesItemTaxType.EXEMPTTAX), 1);
	assertEquals(1.50, shoppingBasket.getSalesTax());
	assertEquals(29.83, shoppingBasket.getTotal());
    }

    @Test
    void testInput2() {
	shoppingBasket = new ShoppingBasket();
	shoppingBasket
		.addSalesItem(new SalesItem("imported box of chocolates", 10.00, SalesItemTaxType.EXEMPTIMPORTTAX), 1);
	shoppingBasket.addSalesItem(new SalesItem("imported bottle of perfume", 47.50, SalesItemTaxType.BASICIMPORTTAX),
		1);
	assertEquals(7.65, shoppingBasket.getSalesTax());
	assertEquals(65.15, shoppingBasket.getTotal());
    }

    @Test
    void testInput3() {
	shoppingBasket = new ShoppingBasket();
	shoppingBasket.addSalesItem(new SalesItem("imported bottle of perfume", 27.99, SalesItemTaxType.BASICIMPORTTAX),
		1);
	shoppingBasket.addSalesItem(new SalesItem("bottle of perfume", 18.99), 1);
	shoppingBasket.addSalesItem(new SalesItem("packet of headache pills", 9.75, SalesItemTaxType.EXEMPTTAX), 1);
	shoppingBasket
		.addSalesItem(new SalesItem("imported box of chocolates", 11.25, SalesItemTaxType.EXEMPTIMPORTTAX), 1);
	assertEquals(6.70, shoppingBasket.getSalesTax());
	assertEquals(74.68, shoppingBasket.getTotal());
    }

}
