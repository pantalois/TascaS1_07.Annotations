package Level_1.Exercici_1;

public class Main {
    public static void main(String[] args){
        Worker worker = new Worker("lois", "gonzález", 10);

        System.out.println(worker.calculateSalary(5));
        OnlineWorker onlineWorker = new OnlineWorker("sara", "ferreiro");
        System.out.println(onlineWorker.calculateSalary(5));
        OnSiteWorker onSiteWorker = new OnSiteWorker("pepe", "cazorla");
        System.out.println(onSiteWorker.calculateSalary(5));

    }
}
