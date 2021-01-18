package br.com.smanager.mesquitagomes.sales;

import br.com.smanager.mesquitagomes.matematica.MathCustom;

public enum SalesItemTax {

    BASICTAX(0.1), IMPORTTAX(0.05);

    private Double rate;

    SalesItemTax(Double rate) {
	this.rate = rate;
    }

    public Double getRate() {
	return this.rate;
    }

    public Double calculateTax(Double itemPrice) {
	return MathCustom.roundOffTax(itemPrice * rate);
    }

}
