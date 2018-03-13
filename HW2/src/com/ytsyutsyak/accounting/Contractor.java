package com.ytsyutsyak.accounting;

public class Contractor extends Staff {
    private double hourRate;
    private int workingHours;
    private int workingHoursInYear;

    public Contractor(String name, String position, double baseSalary, double hourRate, int workingHours, int workingHoursInYear) {
        super(name, position, baseSalary);
        this.hourRate = hourRate;
        this.workingHours = workingHours;
        this.workingHoursInYear = workingHoursInYear;
    }

    @Override
    public void calcMonthSalary() {
        super.monthSalary = workingHours*hourRate;
    }

    @Override
    public void calcYearSalary() {
        super.yearSalary = workingHoursInYear*hourRate;
    }

    @Override
    public String toString() {
        return "Contractor{" +
                "hourRate=" + hourRate +
                ", monthSalary=" + monthSalary +
                ", yearSalary=" + yearSalary +
                '}';
    }
}
