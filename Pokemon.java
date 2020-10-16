public class Pokemon {
    String name;
    String type;
    int max_hp;
    int current_hp;
    boolean is_feinted;

    public Pokemon(String name, int hp, String type) {
        this.name = name;
        this.type = type;
        this.max_hp = hp;
        this.current_hp = hp;
        this.is_feinted = false;
    }

    public void check_hp() {
        System.out.println(name + "'s hp is currently at " + current_hp + " hp");
    }

    public void do_damage(int damage) {
        current_hp -= damage;
        if (current_hp <= 0) {
            System.out.println(name + " has feinted!");
            is_feinted = true;
        } else {
            System.out.println(name + " has taken " + damage + " hp of damage");
            this.check_hp();
        }
    }
}
