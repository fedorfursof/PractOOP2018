import java.util.ArrayList;
import java.util.Random;

class CardGame {

    public static void Game() {

        int[] hand1 = new int[5];
        Random rnd=new Random();
        for (int i = 0; i < hand1.length; i++)
        {
            hand1[i] = rnd.nextInt(10);
            System.out.print(hand1[i] + " ");
        }
        System.out.println();

        int[] hand2 = new int[5];
        for (int i = 0; i < hand2.length; i++)
        {
            hand2[i] = rnd.nextInt(10);
            System.out.print(hand2[i] + " ");
        }
        System.out.println("\n"+"Game Result: ");

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < hand1.length; i++) {
            list1.add(hand1[i]);
            list2.add(hand2[i]);
        }

        int scoreCount = 0;
        boolean gameResult = false;

        for (int i = 0; i < 106; i++) {
            scoreCount++;
            if (list1.get(0) > list2.get(0) || ((list1.get(0) == 0) && (list2.get(0) == 9))) {
                list1.add(list1.get(0));
                list1.add(list2.get(0));
            } else if (list1.get(0) < list2.get(0) || ((list1.get(0) == 9) && (list2.get(0) == 0))) {
                list2.add(list2.get(0));
                list2.add(list1.get(0));
            }
            list1.remove(0);
            list2.remove(0);

            if (list1.size() == 0) {
                System.out.println("Second " + scoreCount);
                gameResult = true;
                break;
            } else if (list2.size() == 0) {
                System.out.println("First " + scoreCount);
                gameResult = true;
                break;
            }
        }
        if (!gameResult) System.out.println("Botva!");
    }
}

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        CardGame.Game();
    }
}
