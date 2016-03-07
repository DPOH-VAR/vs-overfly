import org.bukkit.entity.Player

class Util {

    static inOnAir(Player player){
        return !player.onGround && !player.bl.liquid
    }

}
