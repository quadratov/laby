package lab2;

public class Vehicle {
    private String manufacturer;
    private String model;
    private int year;

    public Vehicle () {
        setManufacturer("None");
        setModel("None");
        setYear(-1);
    }

    public Vehicle (String manufacturer, String model, int year) {
        setManufacturer(manufacturer);
        setModel(model);
        setYear(year);
    }

    public void displayInfo(){
        System.out.println("manufacturer: " + getManufacturer());
        System.out.println("model: " + getModel());
        System.out.println("year: " + getYear());
    }

    public void move(){
        System.out.println(manufacturer + " " + model + " is moving.");
    }

    public void setManufacturer(String manufacturer){
        this.manufacturer = manufacturer;
    }
    
    public String getManufacturer(){
        return this.manufacturer;
    }

    public void setModel(String model){
        this.model = model;
    }

    public String getModel(){
        return this.model;
    }

    public void setYear(int year){
        this.year = year;
    }

    public int getYear(){
        return this.year;
    }
        
}