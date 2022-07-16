import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Cat {
    private static final Random r = new Random();
    List<String> names = List.of("Peach", "Jasper", "Poppy");

    public String name;
    public  int age;
    public static int satiety;
    public  int mood;
    public int health;
    public int state;


    public Cat() {
        name = names.get(r.nextInt(names.size()));
        this.age = (int) ( Math.random() * 19);
        this.satiety = (int) ( Math.random() * 101);
        this.mood = (int) ( Math.random() * 101);
        this.health = (int) ( Math.random() * 101);
    }

    public static final List<Cat> makeCats(int amount) {
        return Stream.generate(Cat::new)
                .limit(amount)
                .collect(Collectors.toList());
    }

    enum Name{
        PEACH, POPPY, JASPER;
    }

    public Object getName() {
        return name;
    }
    public int getAge() {
        return age;
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


    public void setAge(int age) {
        this.age = age;
    }

    public static void setSatiety(int satiety) {
        Cat.satiety = satiety;
    }

    public int middleLevel(){
        int lev = (satiety + mood + health)/3;
        return lev;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", satiety=" + satiety +
                ", mood=" + mood +
                ", health=" + health +
                '}';
    }

}
