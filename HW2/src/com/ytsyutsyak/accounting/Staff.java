package com.ytsyutsyak.accounting;

public class Staff {
    private String name;
    private String position;
    protected double baseSalary;
    protected double monthSalary;
    protected double yearSalary;

    public Staff(String name, String position, double baseSalary) {
        this.name = name;
        this.position = position;
        this.baseSalary = baseSalary;
    }

    public void calcMonthSalary() {
        this.monthSalary = baseSalary;
    }

    public void calcYearSalary() {
        this.yearSalary = monthSalary*12;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", monthSalary=" + monthSalary +
                ", yearSalary=" + yearSalary +
                '}';
    }
}
