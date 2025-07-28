package Level_1.Exercici_1;

import java.math.BigDecimal;

public abstract class Worker {
     private String name;
     private String surname;
     private BigDecimal pricePerHour;

    public  Worker(String name, String surname, BigDecimal pricePerHour){
        this.name = name;
        this.surname = surname;
        this.pricePerHour = pricePerHour;
    }

    public abstract BigDecimal calculateSalary(int monthlyHoursWorked);

    protected void validateHours(int hours) {
        if (hours < 0) {
            throw new ExceptionInvalidHours("Hours cannot be negative");
        }
        if (this.pricePerHour.intValue() < 0) {
            throw new ExceptionInvalidPrice("Price per hour cannot be negative");
        }
    }

    protected BigDecimal getPricePerHour() {
        return pricePerHour;
    }
}
