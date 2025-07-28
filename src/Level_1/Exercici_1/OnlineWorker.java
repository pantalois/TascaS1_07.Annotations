package Level_1.Exercici_1;

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
}

