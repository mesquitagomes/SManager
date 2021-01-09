package br.com.smanager.mesquitagomes.sales;

import br.com.smanager.mesquitagomes.matematica.MathCustom;

public enum SalesItemTaxType {

    EXEMPTTAX(0.0, 0.0), BASICTAX(0.1, 0.0), EXEMPTIMPORTTAX(0.0, 0.05), BASICIMPORTTAX(0.1, 0.05);

    private Double basicRate;
    private Double importRate;

    SalesItemTaxType(Double basicRate, Double importRate) {
	this.basicRate = basicRate;
	this.importRate = importRate;
    }

    public Double getBasicRate() {
	return basicRate;
    }

    public Double getImportRate() {
	return importRate;
    }

    public Double calculateSalesTax(Double itemPrice) {
	double basic = MathCustom.roundOff(itemPrice * this.basicRate);
	double imports = MathCustom.roundOff(itemPrice * this.importRate);
	return (basic + imports);
    }

    public Double calculateTotalTax(Double itemPrice) {
	return MathCustom.truncate(MathCustom.roundHalfEven(itemPrice + calculateSalesTax(itemPrice), 2), 2);
    }

}
