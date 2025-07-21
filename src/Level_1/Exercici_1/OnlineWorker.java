package Level_1.Exercici_1;

public class OnlineWorker extends Worker{

    static final int INTERNET_PRICE = 40;

    public OnlineWorker(String name, String surname){
        super(name, surname, pricePerHour);
    }

    @Override
    public int calculateSalary(int monthlyHoursWorked){
        int salary;

        salary = pricePerHour * monthlyHoursWorked + INTERNET_PRICE;
        return salary;
    }
}
