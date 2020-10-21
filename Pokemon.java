public class Pokemon {
    private String name;
    private String type;
    private int max_hp;
    private int current_hp;
    private boolean is_feinted;

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
    public void heal(int heal_amount) {
        this.current_hp += heal_amount;
        if (this.current_hp > this.max_hp) {
            this.current_hp = this.max_hp;
        }
        System.out.println(this.name + " has been healed to " + this.current_hp + " hp!");
    }
}
