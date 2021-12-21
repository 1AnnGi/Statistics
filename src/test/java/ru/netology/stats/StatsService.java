package ru.netology.stats;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {
    StatsService service = new StatsService();
    int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @Test
    void salAmount() {
        assertEquals(180, service.salAmount(sales));
    }

    @Test
    void averageAmount() {
        assertEquals(15, service.averageAmount(sales));
    }

    @Test
    void peakSalesMonth() {
        assertEquals(8, service.peakSalesMonth(sales));
    }

    @Test
    void minSalesMonth() {
        assertEquals(9, service.minSalesMonth(sales));
    }

    @Test
    void monthsMinSales() {
        assertEquals(5, service.monthsMinSales(sales));
    }

    @Test
    void monthsMaxSales() {
        assertEquals(5, service.monthsMaxSales(sales));
    }
}









