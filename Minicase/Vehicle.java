
public class Vehicle {
    //define attribute
    private String SerialNumber;
    private String Name;
    private String Year;
    private String Manufacturer;
    private float Cost;

    //constructor
    public Vehicle(String SerialNumber, String Name, String Year, String Manufacturer, float Cost){
        this.SerialNumber = SerialNumber;
        this.Name = Name;
        this.Year = Year;
        this.Manufacturer = Manufacturer;
        this.Cost = Cost;
    }

    public void VehicleInfo(){
        System.out.println("SerialNumber: "+this.SerialNumber+"\nName: "+ this.Name+"\nYear: "+this.Year+"\nManufacturer: "+this.Manufacturer+"\nCost: "+this.Cost);
    }
}

