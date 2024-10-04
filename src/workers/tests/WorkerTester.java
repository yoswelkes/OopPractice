package workers.tests;

import workers.*;

public class WorkerTester {

    public static void main(String[] args) {
        // Test for Man
        Man man = new Man("Mark", 32);
        if ("Mark".equals(man.getName()) && man.getAge() == 32) {
            System.out.println("Test for Man: Passed");
        } else {
            System.out.println("Test for Man: Failed");
        }
        man.work();

        // Test for WorkerMan
        WorkerMan workerMan = new WorkerMan("Jake", 45, 8);
        if ("Jake".equals(workerMan.getName()) && workerMan.getAge() == 45 && workerMan.getWorkingHours() == 8) {
            System.out.println("Test for WorkerMan: Passed");
        } else {
            System.out.println("Test for WorkerMan: Failed");
        }
        workerMan.work();

        // Test for Woman
        Woman woman = new Woman("Eva", 29);
        if ("Eva".equals(woman.getName()) && woman.getAge() == 29) {
            System.out.println("Test for Woman: Passed");
        } else {
            System.out.println("Test for Woman: Failed");
        }
        woman.work();

        // Test for WorkerWoman
        WorkerWoman workerWoman = new WorkerWoman("Sophia", 38, 7);
        if ("Sophia".equals(workerWoman.getName()) && workerWoman.getAge() == 38 && workerWoman.getWorkingHours() == 7) {
            System.out.println("Test for WorkerWoman: Passed");
        } else {
            System.out.println("Test for WorkerWoman: Failed");
        }
        workerWoman.work();
    }
}
