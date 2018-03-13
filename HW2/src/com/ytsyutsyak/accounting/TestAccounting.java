package com.ytsyutsyak.accounting;

public class TestAccounting {
    public static void main(String[] args) {

        Staff[] staff = new Staff[]{new Staff("Иванова Елена Львовна", "зам директора", 4500),
                new Contractor("Вакуленко Дмитрий Владимирович", "дизайнер", 0, 200, 90, 520),
                new Sale("Коренькова Анна Павловна", "менеджер по продажам", 0, 5, 50000, (50000*6 + 65000*6)),
                new Sale("Татьяна Сергеевна", "менеджер по продажам", 1000, 3, 50000, (50000*6 + 65000*6))
        };

        for (int i = 0; i < staff.length; i++) {
            staff[i].calcMonthSalary();
            staff[i].calcYearSalary();
            System.out.println(staff[i]);
        }

    }
}
