import java.util.*;
import java.util.stream.Collectors;

public class Application {

    public static void main(String[] args) {
        Map<Integer,Player> Players = new HashMap<Integer,Player>();

        Players.put(0, new Player("Nimitz", 85));
        Players.put(1, new Player("Beaty", 87));
        Players.put(2, new Player("Lutjens", 45));
        Players.put(3, new Player("Isoroku", 50));
        Players.put(4, new Player("Halsey", 70));


        Map<Integer,Player> sortedPlayers = Players.entrySet().stream().filter(map -> map.getValue().getHP() >= 60).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));//x -> Player.getHP() >= 60)
                //new ArrayList<Player>((Collections.sort(Players,new ComparePlayers())).stream().collect());
        sortedPlayers.entrySet().forEach(entry->{
            System.out.println(entry.getKey() + " " + entry.getValue().getHP());
        });

        List<Player> sortedList = new ArrayList<Player>(sortedPlayers.values());
    }


}


