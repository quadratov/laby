public class Main {

    public static void main(String[] args) {
        HashTable<Integer, String> hashTable = new HashTable<Integer, String>(20);
        hashTable.put(1, "one");
        hashTable.put(2, "two");
        System.out.println("\n" + hashTable.get(1));
        System.out.println("\n" + hashTable.get(2));
        hashTable.remove(2);
        System.out.println("\n" + hashTable.get(2));

        Parking parking = new Parking();
        parking.addCar("C831OC142", new Car("Toyota", "Sprinter", 1991));
        parking.findCar("C831OC142");
        parking.removeCar("C831OC142");
    }
}
