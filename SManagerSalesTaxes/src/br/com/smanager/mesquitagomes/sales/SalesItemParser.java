package br.com.smanager.mesquitagomes.sales;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SalesItemParser {

    private static final String SALES_ITEM_REGEX = "(\\d+) ([\\w\\s]+) at (\\d+.\\d{2})";

    public static SalesItem create(String input) {
	Pattern pattern = Pattern.compile(SALES_ITEM_REGEX);
	Matcher matcher = pattern.matcher(input);
	matcher.find();

	return new SalesItem(matcher.group(1), matcher.group(2), matcher.group(3));
    }
}
