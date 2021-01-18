package br.com.smanager.mesquitagomes.matematica;

public class MathCustom {

    public static double roundOffTax(double number) {
	return Math.ceil(number * 20) / 20;
    }

    public static double roundOffPrice(double number) {
	return Math.round(number * 100.0) / 100.0;
    }
}
