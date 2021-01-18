package br.com.smanager.mesquitagomes.sales;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

import br.com.smanager.mesquitagomes.matematica.MathCustom;

public class SalesItem {

    private Integer quantity;
    private String description;
    private double price;
    private Set<SalesItemTax> taxes = new HashSet<SalesItemTax>();

    public SalesItem(String quantity, String description, String price) {
	this.description = description;
	this.quantity = Integer.valueOf(quantity);
	this.price = Double.valueOf(price);
    }

    public Set<SalesItemTax> getTaxes() {
	return taxes;
    }

    public void setTaxes(Set<SalesItemTax> taxes) {
	this.taxes = taxes;
    }

    public void addTax(SalesItemTax tax) {
	taxes.add(tax);
    }

    public boolean isImported() {
	return this.description.contains("imported");
    }

    public boolean isExempted() {
	Stream<String> exemptDescriptions = Stream.of("book", "chocolate", "pill");
	return exemptDescriptions.anyMatch(exemptedItem -> this.description.contains(exemptedItem));
    }

    public double getTaxAmount() {
	Double totalSalesTax = 0.0;
	for (SalesItemTax tax : taxes) {
	    totalSalesTax += tax.calculateTax(this.price);
	}
	return totalSalesTax * this.quantity;
    }

    public double getTotalAmount() {
	return MathCustom.roundOffPrice(this.price * this.quantity + this.getTaxAmount());
    }

    @Override
    public String toString() {
	StringBuilder string = new StringBuilder("");
	string.append(this.quantity);
	string.append(" ");
	string.append(this.description);
	string.append(": ");
	string.append(getTotalAmount());
	return string.toString();
    }

}
