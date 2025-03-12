//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Airliner Airliner = new Airliner("Boeing", "737", "3000KG", "400");
        Freighter Freighter = new Freighter("Barca", "BigBoy", "100000KG");
        Drone Drone = new Drone("DJI", "Drona", "10KG", "0");
        if(Airliner.CargoCapableCheck() == true)
        {
            System.out.println("Airliner Cargo Capable");
        }
        else {
            System.out.println("Airliner Not Cargo Capable");
        }
        if(Airliner.PassengerCapableCheck() == true)
        {
            System.out.println("Airliner Passenger Capable");
        }
        else {
            System.out.println("Airliner Not Passenger Capable");
        }
        if(Freighter.CargoCapableCheck() == true)
        {
            System.out.println("Freighter Cargo Capable");
        }
        else {
            System.out.println("Freighter Not Cargo Capable");
        }
        if(Freighter.PassengerCapableCheck() == true)
        {
            System.out.println("Freighter Passenger Capable");
        }
        else {
            System.out.println("Freighter Not Passenger Capable");
        }
        if(Drone.CargoCapableCheck() == true)
        {
            System.out.println("Drone Cargo Capable");
        }
        else {
            System.out.println("Drone Not Cargo Capable");
        }
        if(Drone.PassengerCapableCheck() == true)
        {
            System.out.println("Drone Passenger Capable");
        }
        else {
            System.out.println("Drone Not Passenger Capable");
        }

    }
}
