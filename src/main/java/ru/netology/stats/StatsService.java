package ru.netology.stats;

public class StatsService {
    public int salAmount(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public int averageAmount(int[] sales) {
        return salAmount(sales) / sales.length;
    }
    private int peakSales(int[] sales) {
        int peak = sales[0];
        for (int sale : sales) {
            if (peak < sale) {
                peak = sale;
            }
        }
        return peak;
    }
    public int peakSalesMonth(int[] sales) {
        int peak = peakSales(sales);

        int index = 0;
        int lastSalesMonth = 0;
        for (int sale : sales) {
            index++;
            if (sale == peak) {
                lastSalesMonth = index;
            }
        }
        return lastSalesMonth;
    }
    private int minSales(int[] sales) {
        int min = sales[0];
        for (int sale : sales) {
            if (min > sale) {
                min = sale;
            }
        }
        return min;
    }
    public int minSalesMonth(int[] sales) {
        int min = minSales(sales);

        int index = 0;
        int lastMinSales = 0;
        for (int sale : sales) {
            index++;
            if (sale == min) {
                lastMinSales = index;
            }
        }
        return lastMinSales;
    }
    public int monthsMinSales(int[] sales) {
        int averageAmount = averageAmount(sales);
        int poorMonth = 0;
        for (int sale : sales) {
            if (sale < averageAmount) {
                poorMonth++;
            }
        }
        return poorMonth;
    }
    public int monthsMaxSales(int[] sales) {
        int averageAmount = averageAmount(sales);
        int richMonth = 0;
        for (int sale : sales) {
            if (sale > averageAmount) {
                richMonth++;
            }
        }
        return richMonth;
    }
}
