import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UserCat extends Cat {

    public String name;
    public int age;
    public int satiety;
    public int mood;
    public int health;

    public UserCat() {
        this.satiety = new Random().nextInt(20) + 80;
        this.mood = new Random().nextInt(20) + 80;
        this.health = new Random().nextInt(20) + 80;
    }

    public String getName() {
        Scanner l = new Scanner(System.in);
        System.out.println("---Enter cat name---");
        String catName = l.nextLine();
        try {
            System.out.println(catName);
        } catch (Exception e) {
            System.out.println("Repeat one more time");
        }
        return catName;
    }

    public int getAge() {
        Scanner scn = new Scanner(System.in);
        System.out.println("----Enter cat age----");
        int catAge = scn.nextInt();
        try {
            System.out.println(catAge);
        } catch (Exception e) {
            System.out.println("Repeat one more time");
        }
        return catAge;
    }

    public int middleLevel() {
        int lev = (satiety + mood + health) / 3;
        return lev;
    }

    public int getSatiety() {
        return satiety;
    }

    public int getMood() {
        return mood;
    }

    public Object getHealth() {
        return health;
    }

    @Override
    public String toString() {
        return "UserCat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", satiety=" + satiety +
                ", mood=" + mood +
                ", health=" + health +
                '}';
    }

}
