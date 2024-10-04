package workers;

public class Main {
    public static void main(String[] args) {
        // Creating 6-7-8 people
        Person person1 = new Man("Yosief", 47);
        Person person2 = new WorkerMan("Prince", 30);
        Person person3 = new Woman("Mudidi", 28);
        Person person4 = new WorkerWoman("Hana", 32);
        Person person5 = new Man("Guled", 22);
        Person person6 = new WorkerMan("Wafi", 35);
        Person person7 = new WorkerWoman("Edna", 31);
        Person person8 = new Woman("Melissa", 27);
        // Store in array for easy iteration
        Person[] people = {person1, person2, person3, person4, person5, person6, person7, person8};

        // Call displayInfo and work for each person
        for (Person person : people) {
            person.displayInfo();
            person.work();
            System.out.println();
        }
    }
}
