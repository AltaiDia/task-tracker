public class MonthData {
    int[] days = new int[30];

    void printDaysAndStepsFromMonth() {
        for (int i = 0; i < days.length; i++) {
            System.out.println(("День " + (i + 1) + " шагов " + days[i]));
        }
    }

    int sumStepsFromMonth() {
        int sumSteps = 0;
        for (int i = 0; i < days.length; i++) {
            sumSteps = sumSteps + days[i];
        }
        return sumSteps;
    }

    int maxStep() {
        int maxStep = 0;
        for (int i = 0; i < days.length; i++) {
            if (days[i] > maxStep) {
                maxStep = days[i];
            }
        }
        return maxStep;
    }

    int bestSeries(int goalByStepsPerDay) {
        int currentSeries = 0;
        int finalSeries = 0;
        for (int i = 0; i < days.length; i++) {
            if (days[i] >= goalByStepsPerDay) {
                currentSeries += 1;
            }
            if (days[i] < goalByStepsPerDay && currentSeries > finalSeries) {
                finalSeries = currentSeries;
                currentSeries = 0;
            }
        }
        if (currentSeries > finalSeries) {
            finalSeries = currentSeries;
        }
        return finalSeries;
    }
}