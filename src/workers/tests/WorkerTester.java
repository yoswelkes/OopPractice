package workers.tests;

import workers.*;

public class WorkerTester {

    public static void main(String[] args) {
        // Test cases for Man, WorkerMan, Woman, WorkerWoman

        Man man = new Man("Mark", 32);
        if ("Mark".equals(man.getName()) && man.getAge() == 32) {
            System.out.println("Test for Man: Passed");
        } else {
            System.out.println("Test for Man: Failed");
        }

        WorkerMan workerMan = new WorkerMan("Jake", 45);
        if ("Jake".equals(workerMan.getName()) && workerMan.getAge() == 45) {
            System.out.println("Test for WorkerMan: Passed");
        } else {
            System.out.println("Test for WorkerMan: Failed");
        }

        Woman woman = new Woman("Eva", 29);
        if ("Eva".equals(woman.getName()) && woman.getAge() == 29) {
            System.out.println("Test for Woman: Passed");
        } else {
            System.out.println("Test for Woman: Failed");
        }

        WorkerWoman workerWoman = new WorkerWoman("Sophia", 38);
        if ("Sophia".equals(workerWoman.getName()) && workerWoman.getAge() == 38) {
            System.out.println("Test for WorkerWoman: Passed");
        } else {
            System.out.println("Test for WorkerWoman: Failed");
        }
    }
}
