public class Converter {
double STEP_SIZE_IN_KM = 0.00075;
double STEP_SIZE_IN_K_CALORIES = 0.05;
    double convertToKm(int steps){
        double cmTraveledPerMonth = steps*STEP_SIZE_IN_KM;
        return cmTraveledPerMonth;
    }
    double convertStepsToKilocalories(int steps){
        double kaBurnedPerMonth = steps*STEP_SIZE_IN_K_CALORIES;
        return kaBurnedPerMonth;
    }


}
