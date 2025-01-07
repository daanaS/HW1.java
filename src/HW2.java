import java.util.Random;


public class HW2 {
    public static void main(String[] args) {
        System.out.println(permission(25, 30));
        System.out.println(permission(15, 25));
        System.out.println(permission(57, -3));
        System.out.println(permission(0, 31));
        System.out.println(permission(16, 55));
        System.out.println(permission(generateRandomAge(), 55));
    }
    private static String permission(int age, int temp){
        if(age>=20 && age<=45 && temp>=-20 && temp<=30){
            return "Можно идти гулять1";
        }
        else if(age>0 && age<=20 && temp>=0 && temp<=28){
            return "Можно идти гулять2";
        }
        else if(age>=45 && temp>=-10 && temp<=25){
            return "Можно идти гулять3";
        }
        else
            return "Оставайтесь дома";
    }
  public static int generateRandomAge() {
      Random random = new Random();
      int x = random.nextInt(100);
      System.out.println("age:" + x);
      return x;
  }
}
