package br.com.smanager.mesquitagomes.sales;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SalesItemTest {

    private SalesItem salesItem;

    @Test
    void testBook1249() {
	salesItem = new SalesItem("book", 12.49, SalesItemTaxType.EXEMPTTAX);
	assertEquals(12.49, salesItem.getTotal());
    }

    @Test
    void testImportedChocolateBox1000() {
	salesItem = new SalesItem("imported box of chocolates", 10.00, SalesItemTaxType.EXEMPTIMPORTTAX);
	assertEquals(10.50, salesItem.getTotal());
    }

    @Test
    void testImportedPerfumeBottle4750() {
	salesItem = new SalesItem("imported bottle of perfume", 47.50, SalesItemTaxType.BASICIMPORTTAX);
	assertEquals(54.65, salesItem.getTotal());
    }

    @Test
    void testPerfumeBottle1899() {
	salesItem = new SalesItem("bottle of perfume", 18.99);
	assertEquals(20.89, salesItem.getTotal());
    }

    @Test
    void testImportedPerfumeBottle2799() {
	salesItem = new SalesItem("imported bottle of perfume", 27.99, SalesItemTaxType.BASICIMPORTTAX);
	assertEquals(32.19, salesItem.getTotal());
    }

    @Test
    void testPacketHeadachePills975() {
	salesItem = new SalesItem("packet of headache pills", 9.75, SalesItemTaxType.EXEMPTTAX);
	assertEquals(9.75, salesItem.getTotal());
    }

    @Test
    void testImportedChocolateBox1125() {
	salesItem = new SalesItem("imported box of chocolates", 11.25, SalesItemTaxType.EXEMPTIMPORTTAX);
	assertEquals(11.85, salesItem.getTotal());
    }
}
