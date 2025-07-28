package Level_1.Exercici_2;

import java.math.BigDecimal;
@SuppressWarnings({"deprecation"})
public class WorkerManagement {
    public static void runExamples() {
        OnlineWorker onlineWorker = new OnlineWorker("sara", "ferreiro", new BigDecimal(10));
        System.out.println(onlineWorker.calculateSalary(5));

        OnSiteWorker onSiteWorker = new OnSiteWorker("pepe", "cazorla", new BigDecimal(12));
        System.out.println(onSiteWorker.calculateSalary(5));

        System.out.println(onSiteWorker.calculateSalaryWithoutFuel());
        System.out.println(onlineWorker.calculateSalaryWithoutInternet());

    }
}