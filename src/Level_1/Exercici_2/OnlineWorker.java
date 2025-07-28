package Level_1.Exercici_2;

import java.math.BigDecimal;

public class OnlineWorker extends Worker {
    private static final BigDecimal INTERNET_PRICE = new BigDecimal(40);

    public OnlineWorker(String name, String surname, BigDecimal pricePerHour) {
        super(name, surname, pricePerHour);
    }

    @Override
    public BigDecimal calculateSalary(int monthlyHoursWorked) {
        validateHours(monthlyHoursWorked);
        BigDecimal hours = new BigDecimal(monthlyHoursWorked);
        return getPricePerHour().multiply(hours).add(INTERNET_PRICE);
    }

    @Deprecated
    public String calculateSalaryWithoutInternet() {
        return "This is the old method where the company did not pay the internet of the worker";
    }
}

