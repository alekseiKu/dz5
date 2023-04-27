package ru.netology.services;

public class CalcMonthService {

    public int calculate(int income, int expenses, int threshold) {
        int count = 0;
        int money = 0;
        for (int month = 1; month <= 12; month++) {
            if (money < threshold) {

                System.out.println("Месяц " + month + ". " + "Денег " + money + ". " + "Придётся работать. Заработал +" + income + ", потратил -" + expenses);
                money = money + income - expenses;

            } else {

                int expensesMoney = ((money - expenses) / 3) * 2;
                count++;
                System.out.println("Месяц " + month + ". " + "Денег " + money + ". " + "Буду отдыхать. Потратил -" + expenses + ", затем еще -" + expensesMoney);
                money = money - expensesMoney - expenses;
            }
        }
        return count;
    }

}
