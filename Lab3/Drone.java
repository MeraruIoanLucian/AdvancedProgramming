public class Drone extends Aircraft implements CargoCapable{
    public String Model;
    public String name;
    public String maxCargo;
    public String maxPassenger;

    public Boolean PassengerCapableCheck(){
        return false;
    }
    public Boolean CargoCapableCheck(){
        return true;
    }
    public Drone(String model, String name, String maxCargo, String maxPassenger){
        this.Model = model;
        this.name = name;
        this.maxCargo = maxCargo;
        this.maxPassenger = maxPassenger;
    }
}
