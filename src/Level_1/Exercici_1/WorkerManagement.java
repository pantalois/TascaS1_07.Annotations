package Level_1.Exercici_1;

import java.math.BigDecimal;

public class WorkerManagement {
    public static void runExamples() {
        OnlineWorker onlineWorker = new OnlineWorker("sara", "ferreiro", new BigDecimal(10));
        System.out.println(onlineWorker.calculateSalary(5));

        OnSiteWorker onSiteWorker = new OnSiteWorker("pepe", "cazorla", new BigDecimal(12));
        System.out.println(onSiteWorker.calculateSalary(5));
    }
}