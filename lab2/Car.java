package lab2;

public class Car extends Automobile{
    private int seats;
    private int doors;
    private String transmission;

    public Car() {
        super();
        setSeats(0);
        setDoors(0);
        setTransmission("None");
    }

    public Car(String manufacturer, String model, int year, String drivetrain, String fuel, int mileage, int seats, int doors, String transmission) {
        super(manufacturer, model, year, drivetrain, fuel, mileage);
        setSeats(seats);
        setDoors(doors);
        setTransmission(transmission);
    }

    public void CarryPassengers(int passengers){
        if (passengers <= getSeats()){
            System.out.println(getManufacturer() + getModel() + " is carrying " + passengers + " passengers.");
        }
        else {
            System.out.println("Too many passengers!");
        }
    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("seats: " + getSeats());
        System.out.println("doors: " + getDoors());
        System.out.println("transmission: " + getTransmission());
    }

    public void setSeats(int seats){
        this.seats = seats;
    }

    public int getSeats(){
        return this.seats;
    }

    public void setDoors(int doors){
        this.doors = doors;
    }

    public int getDoors(){
        return this.doors;
    }

    public void setTransmission(String transmission){
        this.transmission = transmission;
    }

    public String getTransmission(){
        return this.transmission;
    }
}
