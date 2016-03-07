import org.bukkit.entity.Player
import org.bukkit.event.player.PlayerMoveEvent
import org.yaml.snakeyaml.Yaml
import ru.dpohvar.varscript.workspace.Workspace

class OverflyManager {

    Map<String,OverflyRace> races
    Map<Player,Flight> flights

    private Workspace workspace
    Yaml yaml = new Yaml()

    public OverflyManager(Workspace workspace){
        this.workspace = workspace
        init()
    }

    void init(){
        workspace.listen(PlayerMoveEvent){onMove(it)}
        // todo: logic
    }

    void onMove(PlayerMoveEvent event){
        Player player = event.player;
        if (player in flights) onMoveInFlight(event)
        else onMoveInFree(event)
    }

    private void onMoveInFlight(event){
        Player player = event.player;
        Flight flight = flights[player];
        if (!inOnAir(player)) {
            flight.lose()
            flights.remove(player);
        }
        if (player in flight.nextPoint) flight.next()
    }

    private void onMoveInFree(event){
        Player player = event.player
        if (!inOnAir(player)) return;
        def race = races.values().find{race -> player in race.get(0)};
        if (!race) return;
        startFlight(player,race);
    }

    private void startFlight(Player player, OverflyRace race){
        def flight = new Flight(player,race);
        flights[player] = flight
    }

    void read(){

    }


    private static boolean inOnAir(Player player){
        return !player.onGround && !player.bl.liquid
    }
}
