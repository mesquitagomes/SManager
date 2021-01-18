package br.com.smanager.mesquitagomes.sales;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SalesItemTest {

    private SalesItem salesItem;

    @Test
    void testBook1249() {
	salesItem = new SalesItemFactory().create("1 book at 12.49");
	assertEquals(12.49, salesItem.getTotalAmount());
    }

    @Test
    void testImportedChocolateBox1000() {
	salesItem = new SalesItemFactory().create("1 imported box of chocolates at 10.00");
	assertEquals(10.50, salesItem.getTotalAmount());
    }

    @Test
    void testImportedPerfumeBottle4750() {
	salesItem = new SalesItemFactory().create("1 imported bottle of perfume at 47.50");
	assertEquals(54.65, salesItem.getTotalAmount());
    }

    @Test
    void testPerfumeBottle1899() {
	salesItem = new SalesItemFactory().create("1 bottle of perfume at 18.99");
	assertEquals(20.89, salesItem.getTotalAmount());
    }

    @Test
    void testImportedPerfumeBottle2799() {
	salesItem = new SalesItemFactory().create("1 imported bottle of perfume at 27.99");
	assertEquals(32.19, salesItem.getTotalAmount());
    }

    @Test
    void testPacketHeadachePills975() {
	salesItem = new SalesItemFactory().create("1 packet of headache pills at 9.75");
	assertEquals(9.75, salesItem.getTotalAmount());
    }

    @Test
    void testImportedChocolateBox1125() {
	salesItem = new SalesItemFactory().create("1 imported box of chocolates at 11.25");
	assertEquals(11.85, salesItem.getTotalAmount());
    }
}
