import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Application {

    public static void main(String[] args) {
        ArrayList<Player> Players = new ArrayList<Player>();

        Players.add(new Player("Beaty", 87));
        Players.add(new Player("Lutjens", 45));
        Players.add(new Player("Isoroku", 50));
        Players.add(new Player("Halsey", 70));
        Players.add(new Player("Nimitz", 85));

        ArrayList<Player> sortedPlayers = Players.stream().filter(Player -> Player.getHP() >= 60).collect(Collectors.toList());
                //new ArrayList<Player>((Collections.sort(Players,new ComparePlayers())).stream().collect());
    }


}


