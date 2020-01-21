import java.util.Comparator;

public class ComparePlayers implements Comparator<Player> {

    public int compare(Player p1, Player p2){
         if(p1.getHP() > p2.getHP())
             return +1;
         if(p1.getHP() < p2.getHP())
            return -1;

         return 0;


    }
}
