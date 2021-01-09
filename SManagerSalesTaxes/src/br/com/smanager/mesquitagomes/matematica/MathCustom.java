package br.com.smanager.mesquitagomes.matematica;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class MathCustom {

    public static double roundHalfEven(double value, int precision) {
	BigDecimal bd = new BigDecimal(value);
	bd = bd.setScale(precision, RoundingMode.HALF_EVEN);
	return bd.doubleValue();
    }

    public static double roundOff(double value) {
	return Math.ceil(value / 0.05) * 0.05;
    }

    public static double truncate(double value, int precision) {
	int scale = (int) Math.pow(10, precision);
	return (double) Math.ceil(value * scale) / scale;
    }

}
