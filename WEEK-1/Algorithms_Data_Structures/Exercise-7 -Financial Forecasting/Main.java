public class Main {

    // Recursive method to calculate future value
    public static double calculateFutureValue(double initialAmount, double growthRate, int years) {
        if (years == 0) {
            return initialAmount;
        }
        return calculateFutureValue(initialAmount, growthRate, years - 1) * (1 + growthRate);
    }

    public static void main(String[] args) {
        double initialAmount = 10000.0; // ₹10,000 initial investment
        double annualGrowthRate = 0.08; // 8% growth per year
        int forecastYears = 5;

        System.out.println("=== FINANCIAL FORECAST TOOL ===\n");
        System.out.println("Initial Amount: " + initialAmount);
        System.out.println("Annual Growth Rate: " + (annualGrowthRate * 100) + "%");
        System.out.println("Forecast Duration: " + forecastYears + " years");

        double futureValue = calculateFutureValue(initialAmount, annualGrowthRate, forecastYears);

        System.out.printf("\nPredicted Future Value after %d years: %.2f\n", forecastYears, futureValue);
    }
}
