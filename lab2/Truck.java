package lab2;

public class Truck extends Automobile{
    private int cargoSpace;
    private boolean hasTrailer;
    private String cargoType;

    public Truck() {
        super();
        setCargoSpace(0);
        setCargoType("None");
        setHasTrailer(false);
    }

    public Truck(String manufacturer, String model, int year, String drivetrain, String fuel, int mileage, int cargoSpace, boolean hasTrailer, String cargoType) {
        super(manufacturer, model, year, drivetrain, fuel, mileage);
        setCargoSpace(cargoSpace);
        setCargoType(cargoType);
        setHasTrailer(hasTrailer);
    }

    public void CarryCargo(int cargo){
        if (cargo <= getCargoSpace()){
            System.out.println(getManufacturer() + getModel() + " is carrying " + cargo + " cargo.");
        }
        else {
            System.out.println("Too much cargo!");
        }
    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("cargo space: " + getCargoSpace());
        System.out.println("has trailer: " + getHasTrailer());
        System.out.println("cargo type: " + getCargoType());
    }

    public void setCargoSpace(int cargoSpace){
        this.cargoSpace = cargoSpace;
    }

    public int getCargoSpace(){
        return this.cargoSpace;
    }

    public void setHasTrailer(boolean hasTrailer){
        this.hasTrailer = hasTrailer;
    }

    public boolean getHasTrailer(){
        return this.hasTrailer;
    }

    public void setCargoType(String cargoType){
        this.cargoType = cargoType;
    }

    public String getCargoType(){
        return this.cargoType;
    }
}
