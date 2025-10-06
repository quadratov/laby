package lab2;

public class Example {
    public static void main(String[] args){
        Car toyota = new Car("toyota", "sprinter", 1991, "FF", "Gasoline", 351634, 5, 4, "manual");
        toyota.displayInfo();
        
        System.out.println(" ");

        Truck volvo = new Truck("Volvo", "VN", 2003, "FR", "Diesel", 250130, 5000, true, "milk");
        volvo.displayInfo();
    }
}
