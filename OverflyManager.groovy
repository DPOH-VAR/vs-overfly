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
        workspace.listen(PlayerMoveEvent){ event ->

        }
        // todo: logic
    }

    void read(){

    }


}
