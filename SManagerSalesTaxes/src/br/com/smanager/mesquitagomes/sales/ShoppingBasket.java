package br.com.smanager.mesquitagomes.sales;

import java.util.HashSet;

import br.com.smanager.mesquitagomes.matematica.MathCustom;

public class ShoppingBasket extends HashSet<SalesItem> {

    private static final long serialVersionUID = -7149520037158534228L;

    public void addSalesItem(SalesItem salesItem) {
	this.add(salesItem);
    }

    public double getTotalTax() {
	double totalTax = 0;
	for (SalesItem salesItem : this) {
	    totalTax += salesItem.getTaxAmount();
	}
	return MathCustom.roundOffTax(totalTax);
    }

    public Double getTotal() {
	double total = 0;
	for (SalesItem salesItem : this) {
	    total += salesItem.getTotalAmount();
	}
	return MathCustom.roundOffPrice(total);
    }

    public String printReceipt() {
	StringBuilder string = new StringBuilder("");
	for (SalesItem salesItem : this) {
	    string.append(salesItem.toString());
	    string.append(System.getProperty("line.separator"));
	}
	string.append("Sales Taxes: ");
	string.append(this.getTotalTax());
	string.append(System.getProperty("line.separator"));
	string.append("Total: ");
	string.append(this.getTotal());
	return string.toString();
    }

}
