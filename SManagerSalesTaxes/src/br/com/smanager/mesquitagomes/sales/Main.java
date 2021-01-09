package br.com.smanager.mesquitagomes.sales;

public class Main {

    public static void main(String[] args) {
	ShoppingBasket shoppingBasket = new ShoppingBasket();
	shoppingBasket = new ShoppingBasket();

	System.out.println("INPUT 1");
	shoppingBasket.addSalesItem(new SalesItem("book", 12.49, SalesItemTaxType.EXEMPTTAX), 1);
	shoppingBasket.addSalesItem(new SalesItem("music CD", 14.99), 1);
	shoppingBasket.addSalesItem(new SalesItem("chocolate bar", 0.85, SalesItemTaxType.EXEMPTTAX), 1);
	System.out.println(shoppingBasket.toString());

	shoppingBasket.clear();
	System.out.println("INPUT 2");
	shoppingBasket
		.addSalesItem(new SalesItem("imported box of chocolates", 10.00, SalesItemTaxType.EXEMPTIMPORTTAX), 1);
	shoppingBasket.addSalesItem(new SalesItem("imported bottle of perfume", 47.50, SalesItemTaxType.BASICIMPORTTAX),
		1);
	System.out.println(shoppingBasket.toString());

	shoppingBasket.clear();
	System.out.println("INPUT 3");
	shoppingBasket = new ShoppingBasket();
	shoppingBasket.addSalesItem(new SalesItem("imported bottle of perfume", 27.99, SalesItemTaxType.BASICIMPORTTAX),
		1);
	shoppingBasket.addSalesItem(new SalesItem("bottle of perfume", 18.99), 1);
	shoppingBasket.addSalesItem(new SalesItem("packet of headache pills", 9.75, SalesItemTaxType.EXEMPTTAX), 1);
	shoppingBasket
		.addSalesItem(new SalesItem("imported box of chocolates", 11.25, SalesItemTaxType.EXEMPTIMPORTTAX), 1);
	System.out.println(shoppingBasket.toString());
    }

}
