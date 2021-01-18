package br.com.smanager.mesquitagomes.sales;

public class ShoppingBasketDemo {

    public static void main(String[] args) {
	ShoppingBasket shoppingBasket = new ShoppingBasket();
	shoppingBasket = new ShoppingBasket();

	System.out.println("INPUT 1");
	shoppingBasket.addSalesItem(new SalesItemFactory().create("1 book at 12.49"));
	shoppingBasket.addSalesItem(new SalesItemFactory().create("1 music CD at 14.99"));
	shoppingBasket.addSalesItem(new SalesItemFactory().create("1 chocolate bar at 0.85"));
	System.out.println(shoppingBasket.printReceipt());

	shoppingBasket.clear();
	System.out.println("INPUT 2");
	shoppingBasket.addSalesItem(new SalesItemFactory().create("1 imported box of chocolates at 10.00"));
	shoppingBasket.addSalesItem(new SalesItemFactory().create("1 imported bottle of perfume at 47.50"));
	System.out.println(shoppingBasket.printReceipt());

	shoppingBasket.clear();
	System.out.println("INPUT 3");
	shoppingBasket.addSalesItem(new SalesItemFactory().create("1 imported bottle of perfume at 27.99"));
	shoppingBasket.addSalesItem(new SalesItemFactory().create("1 bottle of perfume at 18.99"));
	shoppingBasket.addSalesItem(new SalesItemFactory().create("1 packet of headache pills at 9.75"));
	shoppingBasket.addSalesItem(new SalesItemFactory().create("1 imported box of chocolates at 11.25"));
	System.out.println(shoppingBasket.printReceipt());
    }

}
