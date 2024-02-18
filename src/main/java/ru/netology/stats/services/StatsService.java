package ru.netology.stats.services;

public class StatsService {
    public int minSales(long[] sales) {
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }

        return minMonth + 1;
    }


    public int sumOfAllSales(int[] sales) {
        int sum = 0;
        for (int i : sales) {
            sum += i;
        }
        return sum;
    }

    public int findAverageSales(int[] sales) {
        return sumOfAllSales(sales) / sales.length;
    }

    public int maxSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long purchase : sales) {
            if (purchase >= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int quantityMonthsMinSales(int[] sales) {
        int avg = sumOfAllSales(sales) / sales.length;
        int quantityMonths = 0;
        for (int purchase : sales) {
            if (purchase < avg) {
                quantityMonths++;
            }
        }
        return quantityMonths;
    }

    public int quantityMonthsMaxSales(int[] sales) {
        int avg = sumOfAllSales(sales) / sales.length;
        int quantityMonths = 0;
        for (int purchase : sales) {
            if (purchase > avg) {
                quantityMonths++;
            }
        }
        return quantityMonths;
    }
}

