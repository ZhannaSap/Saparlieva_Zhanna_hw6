public class Main {
    public static void main(String[] args) {
        Boss villain = new Boss(700, 50, new Weapon(WeaponType.HAMMER,"Thunder"));


        System.out.print("BOSS: " + " HEALTH: " + villain.getHealth() + " DAMAGE: " + villain.getDamage()
                + " WEAPON: " + villain.getHammer().getWeapon()
                + " NAME OF THE WEAPON: " + villain.getHammer().getNameOfWeapon());

    }
}