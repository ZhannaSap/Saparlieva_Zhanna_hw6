public class Boss extends GameEntity{
    private Weapon hammer;

    public Boss(int health, int damage, Weapon hammer){
    super(health, damage);
    this.hammer=hammer;
    }
    public Weapon getHammer() {
        return hammer;
    }

    public void setHammer(Weapon hammer) {
        this.hammer = hammer;
    }
}
