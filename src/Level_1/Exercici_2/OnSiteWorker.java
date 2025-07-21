package Level_1.Exercici_2;
import java.util.Date;

@SuppressWarnings({"deprecation", "unused"})
public class OnSiteWorker extends Worker{

    private static int benzina = 50;

    public OnSiteWorker(String name, String surname){
        super(name, surname, pricePerHour);
    }

    @Override
    public int calculateSalary(int monthlyHoursWorked){
        int salary;

        salary = pricePerHour * monthlyHoursWorked + benzina;
        return salary;
    }

    public void getHours(){
        Date hours = new Date();
        System.out.println(hours.getHours());
    }
}