import org.bukkit.Location;

class OverflyPoint {

    private Location location
    int size = 5
    double accelerate = 0

    public OverflyPoint(Location loc){
        this.location = loc
    }

    void move(Location loc){
        location = loc
    }

    Location getLocation(){
        this.location.clone()
    }


}
