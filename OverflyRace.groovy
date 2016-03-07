import org.bukkit.Location
import org.bukkit.entity.Entity

class OverflyRace {

    List<OverflyPoint> points

    def save(){
        // todo: save to yaml
    }

    def load(){

    }

    OverflyPoint add(Location loc){
        def point = new OverflyPoint(loc)
        points << point
        point
    }

    OverflyPoint add(Entity entity){
        return add(entity.location)
    }

    OverflyPoint get(int index){
        points[index]
    }

    void remove(int index){
        points.remove index
    }

    int getSize(){
        return points.size();
    }



}
