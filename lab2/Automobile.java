package lab2;

public class Automobile extends Vehicle {
    private String drivetrain;
    private String fuel;
    private int mileage;

    public Automobile() {
        super();
        setDrivetrain("None");
        setFuel("None");
        setMileage(0);
    }

    public Automobile(String manufacturer, String model, int year, String drivetrain, String fuel, int mileage) {
        super(manufacturer, model, year);
        setDrivetrain(drivetrain);
        setFuel(fuel);
        setMileage(mileage);
    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("drivetrain: " + getDrivetrain());
        System.out.println("fuel: " + getFuel());
        System.out.println("mileage: " + getMileage());
    }

    public void drive(int kilometers) {
        this.mileage += kilometers;
        System.out.println(getManufacturer() + getModel() + " is driving.");
    }

    public void setDrivetrain(String drivetrain){ 
        this.drivetrain = drivetrain;
    }

    public String getDrivetrain(){
        return this.drivetrain;
    }

    public void setFuel(String fuel){
        this.fuel = fuel;
    }

    public String getFuel(){
        return this.fuel;
    }

    public void setMileage(int mileage){
        this.mileage = mileage;
    }

    public int getMileage(){
        return this.mileage;
    }
}
