package br.com.smanager.mesquitagomes.sales;

public class SalesItemFactory {

    public SalesItem create(String input) {
	SalesItem salesItem = SalesItemParser.create(input);
	setTax(salesItem);
	return salesItem;
    }

    private void setTax(SalesItem salesItem) {
	if (salesItem.isImported()) {
	    salesItem.addTax(SalesItemTax.IMPORTTAX);
	}
	if (!salesItem.isExempted()) {
	    salesItem.addTax(SalesItemTax.BASICTAX);
	}
    }

}
