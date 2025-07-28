package Level_1.Exercici_1;

import java.math.BigDecimal;

public class OnSiteWorker extends Worker{

    private static final BigDecimal FUEL_ALLOWANCE = new BigDecimal(50);

    public OnSiteWorker(String name, String surname, BigDecimal pricePerHour) {
        super(name, surname, pricePerHour);
    }

    @Override
    public BigDecimal calculateSalary(int monthlyHoursWorked) {
        validateHours(monthlyHoursWorked);
        BigDecimal hours = new BigDecimal(monthlyHoursWorked);
        return getPricePerHour().multiply(hours).add(FUEL_ALLOWANCE);
    }
}