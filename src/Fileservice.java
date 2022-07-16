import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
public class Fileservice {

    List<Cat> cats = Cat.makeCats(3);
    public static void printCat() {
        List<Cat> cats = Cat.makeCats(3);
        cats.sort(Comparator.comparing(Cat::middleLevel).reversed());
        System.out.println("------Cat ------");
        System.out.printf(" %s   | %s | %s |  %s | %s |  %s   \n",
                " NAME ", " Age", "Healt", "Mood", "Satiety", "MiddleLevel");
        for (int i = 0; i < cats.size(); i++) {
            System.out.printf(" %s   |  %s   |   %s    |  %s   |  %s    |  %s      \n",
                    cats.get(i).getName(),
                    cats.get(i).getAge(),
                    cats.get(i).getHealth(),
                    cats.get(i).getMood(),
                    cats.get(i).getSatiety(),
                    cats.get(i).middleLevel());
        }
    }
    public static void printUserCat() {
        List<Cat> cats= Cat.makeCats(4);
        cats.add(4, new UserCat());
        cats.sort(Comparator.comparing(Cat::middleLevel).reversed());
        for (int i = 0; i < cats.size(); i++) {
            System.out.printf(" %s   |  %s  |   %s  |  %s  |  %s   |  %s      \n",
                    cats.get(i).getName(),
                    cats.get(i).getAge(),
                    cats.get(i).getHealth(),
                    cats.get(i).getMood(),
                    cats.get(i).getSatiety(),
                    cats.get(i).middleLevel());
        }
    }
    public static void newCat() throws Exception {
        Scanner pl = new Scanner(System.in);
        System.out.print("\n");
        System.out.println("---Press 1 to add a new cat---");
        int num = pl.nextInt();
        if (num == 1) {
            try {
                printUserCat();
            } catch (Exception e) {
                System.out.println("Repeat one more time\n");
            }
        }
    }
    public static void action () throws Exception{
        List<Cat> cats= Cat.makeCats(3);
        Scanner sc = new Scanner(System.in);
        System.out.print("");
        System.out.println("Enter action: 1-feed cat,\n 2- toPlay,\n 3-to a veterinarian, \n 4-get a new pet ");
        int number = sc.nextInt();
        switch (number) {
            case (1):
                System.out.println("You choose - feed cat!");


               break;
            case (2):
                System.out.println("You choose - played");
                break;
            case(3):
                System.out.println("You choose -go to a vet");
                break;
            case (4):
                System.out.println("You choose - get a new pet");
                break;
        }
        System.out.println("\n Enter cat number(1-3), cat name");
        Scanner scanner = new Scanner(System.in);
        int userChoose = scanner.nextInt();
        switch (userChoose) {
            case (1):
                System.out.println("You " + number +  cats.get(0).getName());
                break;
            case (2):
                System.out.println("You " + number +  cats.get(1).getName());
                break;
            case (3):
                System.out.println("You " + number +  cats.get(2).getName());
                break;
        }
   }





}

