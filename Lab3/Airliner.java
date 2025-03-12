public class Airliner extends Aircraft implements CargoCapable{
    public String Model;
    public String name;
    public String maxCargo;
    public String maxPassenger;
    public Boolean CargoCapableCheck(){return true;}
    public Boolean PassengerCapableCheck(){return true;}
    public Airliner(String name, String model, String maxCargo, String maxPassenger){
        this.name = name;
        this.Model = model;
        this.maxCargo = maxCargo;
    }
}
