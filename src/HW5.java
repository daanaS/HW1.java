import java.sql.SQLOutput;

public class HW5 {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHealth(500);
        boss.setDamage(100);
        boss.setdefenseType("Shield");

        System.out.println("Boss info:"+ "Health"+ boss.getHealth()+ "Damage:"+ boss.getDamage()+ "defense type of the boss:"+boss.getdefenseType());
Hero[] heroes = createHeroes();
        System.out.println("Info about heroes:");
        for(Hero hero: heroes){
            System.out.println("Health:"+ hero.getHealth()+"Damage:"+hero.getDamage()+(hero.getSuperPower()!=null? ", Superpower:"+hero.getSuperPower():""));
        }
    }
    public static Hero[] createHeroes() {
        Hero hero1 = new Hero(200, 50, "Fireball");
        Hero hero2 = new Hero(350, 40);
        Hero hero3 = new Hero(400, 50, "Invisibility");
        return new Hero[]{hero1, hero2, hero3};

    }
}
