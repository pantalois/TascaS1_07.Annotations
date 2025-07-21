package Level_1.Exercici_2;

import java.util.Date;


@SuppressWarnings({"deprecation", "unused"})
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

    public void getDate(){
        Date year = new Date();
        System.out.println(year.getDate());
    }
}
