import java.util.Scanner;

public class StepTracker {
    Scanner scanner;
    Converter сonverter = new Converter();
    MonthData[] monthToData = new MonthData[12];
    int goalByStepsPerDay = 10000;//8 шаг

    StepTracker(Scanner scan) {
        scanner = scan;
        for (int i = 0; i < monthToData.length; i++) {
            monthToData[i] = new MonthData();
        }
    }

    void addNewNumberStepsPerDay() {
        int monthIndex;
        while (true) {
            System.out.println("Введите номер месяца от 1 до 12 (включительно)");
            monthIndex = scanner.nextInt();
            if (0 >= monthIndex || monthIndex > 12) {
                System.out.println("Введено некоректное значение");
            } else {
                break;
            }
        }
        int dayIndex;
        while (true) {
            System.out.println("Введите день от 1 до 30 (включительно)");
            dayIndex = scanner.nextInt();
            if (0 >= dayIndex || dayIndex > 30) {
                System.out.println("Введено некоректное значение");
            } else {
                break;
            }
        }
        int numberOfSteps;
        while (true) {
            System.out.println("Введите количество шагов");
            numberOfSteps = scanner.nextInt();
            if (numberOfSteps < 0) {
                System.out.println("Введено некоректное значение");
            } else {
                break;
            }
        }
        MonthData monthData = monthToData[monthIndex - 1];

        monthData.days[dayIndex - 1] = numberOfSteps;
    }

    void printStatistic() {
        int monthIndex;
        while (true) {
            System.out.println("Введите номер месяца от 1 до 12 (включительно)");
            monthIndex = scanner.nextInt();
            if (monthIndex <= 0 || monthIndex > 12) {
                System.out.println("Введено некоректное значение");
            } else {
                break;
            }
        }
        MonthData monthData = monthToData[monthIndex - 1];
        int sumSteps = monthData.sumStepsFromMonth();
        monthData.printDaysAndStepsFromMonth();
        System.out.println("Cумма шагов пройденных за " + monthIndex + " месяц " + sumSteps);
        System.out.println("Максимально пройдено шагов в день за " + monthIndex + " месяц " + monthData.maxStep());
        System.out.println("Cреднее пройденное количество шагов за " + monthIndex + " месяц " + (sumSteps / monthData.days.length));
        System.out.println("Пройденно км за месяц " + (сonverter.convertToKm(sumSteps)));
        System.out.println("Сожженно килоклароий за месяц " + (сonverter.convertStepsToKilocalories(sumSteps)));
        System.out.println("Лучшая серия в месяце " + monthData.bestSeries(goalByStepsPerDay));
        System.out.println("\n"); //дополнительный перенос строки
    }

    void changesStepGoal() {
        while (true) {
            System.out.println("Введите новую цель по шагам");
            int goalByStepsPerDay = scanner.nextInt();
            if (0 >= goalByStepsPerDay) {
                System.out.println("Введено некоректное значение");
            } else {
                System.out.println("Новая цель принята, двигаемся к вершинам!");
                break;
            }

        }
    }
}
