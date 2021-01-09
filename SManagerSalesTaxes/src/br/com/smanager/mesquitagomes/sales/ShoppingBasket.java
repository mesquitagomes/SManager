package br.com.smanager.mesquitagomes.sales;

import java.util.HashMap;
import java.util.Map;

public class ShoppingBasket extends HashMap<SalesItem, Integer> {

    private static final long serialVersionUID = -7149520037158534228L;

    public void addSalesItem(SalesItem salesItem, Integer quantity) {
	this.put(salesItem, quantity);
    }

    public double getSalesTax() {
	double salesTax = 0;
	for (Map.Entry<SalesItem, Integer> entry : this.entrySet()) {
	    SalesItem salesItem = entry.getKey();
	    Integer quantity = entry.getValue();
	    salesTax += salesItem.getSalesTax() * quantity;
	}
	return salesTax;
    }

    public Double getTotal() {
	double total = 0;
	for (Map.Entry<SalesItem, Integer> entry : this.entrySet()) {
	    SalesItem salesItem = entry.getKey();
	    Integer quantity = entry.getValue();
	    total += salesItem.getTotal() * quantity;
	}
	return total;
    }

    @Override
    public String toString() {
	StringBuilder string = new StringBuilder("");
	for (Map.Entry<SalesItem, Integer> entry : this.entrySet()) {
	    SalesItem salesItem = entry.getKey();
	    Integer quantity = entry.getValue();
	    string.append(quantity);
	    string.append(" ");
	    string.append(salesItem.toString());
	    string.append(System.getProperty("line.separator"));
	}
	string.append("Sales Taxes: ");
	string.append(getSalesTax());
	string.append(System.getProperty("line.separator"));
	string.append("Total: ");
	string.append(getTotal());
	return string.toString();
    }

}
