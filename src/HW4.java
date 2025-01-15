

import java.util.Random;

public class HW4{
    public static int bossHealth = 700;
    public static int bossDamage = 50;
    public static String bossDefence;
    public static String[] heroesAttackType = {"Physical", "Magical", "Kinetic"};
    public static int MedicCurePower = 50;
    public static int MedicHealth = 140;
    public static int[] heroesHealth = {280, 270, 250};
    public static int[] heroesDamage = {20, 10, 15};
    public static int roundNumber;

    public static void main(String[] args) {
        printStatistics();

        while (!isGameOver()) {
            playRound();
        }
    }

    public static boolean isGameOver() {
        if (bossHealth <= 0) {
            System.out.println("Heroes won!!!");
            return true;
        }
        boolean allHeroesDead = true;
        for (int currentHP : heroesHealth) {
            if (currentHP > 0) {
                allHeroesDead = false;
                break;
            }
        }
        if (allHeroesDead) {
            System.out.println("Boss won!!!");
            return true;
        }
        return false;
    }

    public static void playRound() {
        roundNumber++;
        chooseBossDefence();
        bossAttack();
        MedicHelp();
        heroesAttack();
        bossAgainstMedic();
        printStatistics();

    }
    public static void bossAgainstMedic(){
        if(bossHealth>0){
            if(MedicHealth>0){
                MedicHealth = MedicHealth - bossDamage;
                System.out.println("Medic's health became:"+ MedicHealth);
            }
        }
    }
    public static void chooseBossDefence() {
        Random random = new Random();
        int randomIndex = random.nextInt(heroesAttackType.length); // 0,1,2
        bossDefence = heroesAttackType[randomIndex];
    }

    public static void heroesAttack() {
        for (int i = 0; i < heroesDamage.length; i++) {
            if (heroesHealth[i] > 0 && bossHealth > 0) {
                int damage = heroesDamage[i];
                if (heroesAttackType[i] == bossDefence) {
                    Random random = new Random();
                    int coeff = random.nextInt(2, 10); // 2,3,4,5,6,7,8,9
                    damage = heroesDamage[i] * coeff;
                    System.out.println("Critical damage: " + damage + " (" + coeff + ")");
                }
                if (bossHealth - damage < 0) {
                    bossHealth = 0;
                } else {
                    bossHealth = bossHealth - damage;
                }
            }
        }
    }

    public static void bossAttack() {
        for (int i = 0; i < heroesHealth.length; i++) {
            if (heroesHealth[i] > 0) {
                if (heroesHealth[i] - bossDamage < 0) {
                    heroesHealth[i] = 0;
                } else {
                    heroesHealth[i] = heroesHealth[i] - bossDamage;
                }
            }
        }
    }

    public static void MedicHelp() {
        if (MedicHealth > 0) {
            for (int i = 0;i <heroesAttackType.length; i++){
                if(heroesHealth[i] <= 100 && heroesHealth[i]> 0) {
                    heroesHealth[i] += MedicCurePower;
                    System.out.println("Medic cured:"+ heroesAttackType[i] +"="+heroesHealth[i]);
                    break;
                }
            }
        }
    }

    public static void printStatistics() {
        System.out.println("ROUND: " + roundNumber + " -----------------");
        /*String defence;
        if (bossDefence == null) {
            defence = "No defence";
        } else {
            defence = bossDefence;
        }*/
        System.out.println("Boss health: " + bossHealth + " damage: " + bossDamage +
                " defence: " + (bossDefence == null ? "No defence" : bossDefence));
        for (int i = 0; i < heroesHealth.length; i++) {
            System.out.println(heroesAttackType[i] + " health: " + heroesHealth[i] +
                    " damage: " + heroesDamage[i]);
        }
    }
}
//Добавить 4-го игрока Medic,
// у которого есть способность лечить после
// каждого раунда на N-ное количество единиц здоровья,
// но только одного из членов команды,
// имеющего здоровье менее 100 единиц.
// Мертвых героев медик оживлять не может,
// и лечит он до тех пор пока жив сам.
// Медик не участвует в бою,
// но получает урон от Босса.
// Сам себя медик лечить не может.
