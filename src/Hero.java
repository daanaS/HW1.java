public class Hero {
    private int Health;
    private int Damage;
    private String SuperPower;

public Hero(int Health, int Damage, String SuperPower){
    this.Health = Health;
    this.Damage=Damage;
    this.SuperPower=SuperPower;
} public Hero(int Health, int Damage){
this.Health=Health;
this.Damage=Damage;
}
public int getHealth(){
    return Health;
} public int getDamage(){
    return Damage;
    } public String getSuperPower(){
    return SuperPower;
    }
}

