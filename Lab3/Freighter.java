public class Freighter extends Aircraft implements CargoCapable {
    public String Model;
    public String name;
    public String maxCargo;
    public Boolean CargoCapableCheck(){return true;}
    public Boolean PassengerCapableCheck(){return true;}
    public Freighter(String model, String name, String maxCargo){
        this.Model = model;
        this.name = name;
        this.maxCargo = maxCargo;
    }
}
