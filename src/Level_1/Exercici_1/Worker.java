package Level_1.Exercici_1;

public class Worker {
     String name;
     String surname;
     static int pricePerHour = 12;

    public Worker(String name, String surname, int pricePerHour){
        this.name = name;
        this.surname = surname;
    }

    public int calculateSalary(int hoursWorked){
        int salary;
        salary = hoursWorked * pricePerHour;
        return salary;
    }
}
