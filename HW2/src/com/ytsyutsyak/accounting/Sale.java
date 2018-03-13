package com.ytsyutsyak.accounting;

public class Sale extends Staff {
    private int percentFromSale;
    private double salesPerMonth;
    private double yearSales;

    public Sale(String name, String position, double baseSalary, int percentFromSale, double salesPerMonth, double yearSales) {
        super(name, position, baseSalary);
        this.percentFromSale = percentFromSale;
        this.salesPerMonth = salesPerMonth;
        this.yearSales = yearSales;
    }

    @Override
    public void calcMonthSalary() {
        super.monthSalary = super.baseSalary + salesPerMonth * percentFromSale / 100;
    }

    @Override
    public void calcYearSalary() {
        super.yearSalary = baseSalary + yearSales * percentFromSale / 100;
    }

    @Override
    public String toString() {
        return "Sale{" +
                "percentFromSale=" + percentFromSale +
                ", salesPerMonth=" + salesPerMonth +
                ", yearSales=" + yearSales +
                ", baseSalary=" + baseSalary +
                ", monthSalary=" + monthSalary +
                ", yearSalary=" + yearSalary +
                '}';
    }
}
