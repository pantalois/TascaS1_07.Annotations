package Level_1.Exercici_1;

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
}