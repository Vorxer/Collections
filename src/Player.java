public class Player {

    private String Name;
    private int HP;

    public Player(String name, int HP){

        this.Name = name;
        this.HP = HP;

    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }


}
