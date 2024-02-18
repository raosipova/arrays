package ru.netology.stats.services;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class StatsServiceTest {

    @Test
    public void shouldFindBetweenEnds() {
        StatsService service = new StatsService();


        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMonth = 9;
        int actualMonth = service.minSales(sales);

        Assertions.assertEquals(expectedMonth, actualMonth);

    }

    @Test
    public void shouldCalculateSum() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;

        int actual = service.sumOfAllSales(sales);
        Assertions.assertEquals(expected, actual);


    }

    @Test
    public void averageAmountOfSales() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;

        int actual = service.findAverageSales(sales);
        Assertions.assertEquals(expected, actual);


    }

    @Test
    public void shouldFindMaxSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMonth = 8;

        int actualMonth = service.maxSales(sales);
        Assertions.assertEquals(expectedMonth, actualMonth);

    }

    @Test
    public void quantityMonthsMinSales() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        int actual = service.quantityMonthsMinSales(sales);
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void quantityMonthsMaxSales() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        int actual = service.quantityMonthsMaxSales(sales);
        Assertions.assertEquals(expected, actual);

    }
}
