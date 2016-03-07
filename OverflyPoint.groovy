import org.bukkit.Location
import org.bukkit.entity.Entity;

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

    boolean isCase(Location loc){
        if (location.world != loc.world) return false;
        return location.distanceSquared(loc) <= size*size/4
    }

    boolean isCase(Entity entity){
        return isCase(entity.location)
    }

}
