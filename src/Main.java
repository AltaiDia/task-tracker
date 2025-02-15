import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StepTracker stepTracker = new StepTracker(scanner);
        while (true) {
            printMenu();
            int i = scanner.nextInt();
            if (i == 1) {
                stepTracker.addNewNumberStepsPerDay();
            } else if (i == 2) {
                stepTracker.changesStepGoal();
            } else if (i == 3) {
                stepTracker.printStatistic();
            } else if (i == 0) {
                System.out.println("Пока!");
                return;
            } else {
                System.out.println("Такой команды нет о.о");
            }
        }
    }

    public static void printMenu() {
        System.out.println("Привет спортсмен!Что будем делать? ");
        System.out.println("1 - Запишем колличество пройденных шагов за определенный день");
        System.out.println("2 - Изменим цель по количеству шагов в день");
        System.out.println("3 - Посмотрим статистику за месяц");
        System.out.println("0 - Пока!");
    }
}