package br.com.smanager.mesquitagomes.sales;

public class SalesItem {

    private String description;
    private double price;
    private SalesItemTaxType type;

    SalesItem(String description, Double price) {
	this(description, price, SalesItemTaxType.BASICTAX);
    }

    SalesItem(String description, Double price, SalesItemTaxType type) {
	setDescription(description);
	setPrice(price);
	setSalesItemTaxType(type);
    }

    public String getDescription() {
	return description;
    }

    public void setDescription(String description) {
	this.description = description;
    }

    public double getPrice() {
	return price;
    }

    public void setPrice(double price) {
	this.price = price;
    }

    public SalesItemTaxType getSalesItemTaxType() {
	return type;
    }

    public void setSalesItemTaxType(SalesItemTaxType type) {
	this.type = type;
    }

    public double getSalesTax() {
	return type.calculateSalesTax(getPrice());
    }

    public double getTotal() {
	return type.calculateTotalTax(getPrice());
    }

    @Override
    public String toString() {
	StringBuilder string = new StringBuilder("");
	string.append(getDescription());
	string.append(": ");
	string.append(getTotal());
	return string.toString();
    }

}
