package c1.lesson2;

public class WhileApp {
    public static void main(String[] args) {

        /*int i = 10;
        while (i > 0) { //maybe
            System.out.println(i);
            i--;
        }*/

        int i = 10;
        while (i > 0) {
            if (i % 2 == 0) {
                i--;
                continue;
            }
            System.out.println(i);
            i--;
        }

        int j = 10;
        do {  // at least once
            System.out.println("j = " + j);
            j--;
        } while (j > 0);

    }
}
