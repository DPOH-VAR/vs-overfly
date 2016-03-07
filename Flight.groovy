import org.bukkit.entity.Player

class Flight {
    final Player player;
    final OverflyRace race;

    public Flight(Player player, OverflyRace race){
        this.player = player;
        this.race = race;
    }

    int score = 0;
    OverflyPoint nextPoint = race.get(0);

    public void next(){
        score++
        if (race.size <= score+1){
            // ToDo Finish
            return;
        }
        nextPoint = race.get(score)
    }

    public void lose(){
        // ToDo vsratj
    }
}
