import java.io.*;
import java.util.Scanner;

public class Dice {
    static void createFile() throws IOException {
        PrintWriter utStröm = new PrintWriter(new BufferedWriter(new FileWriter("Dice.txt")));
        String a = "";
        int kast;
        for (int i = 0; i < 1000; i++) {
            kast = (int) (Math.random() * 6 + 1);
            a = a + kast + " ";
        }
        utStröm.print(a);
        utStröm.close();
    }

    static int[] createArray() throws FileNotFoundException {
        Scanner fil = new Scanner(new File("Dice.txt"));
        int[] array = new int[1000];
        for (int i = 0; i < array.length; i++)
            array[i] = fil.nextInt();
        return array;
    }

    static int[] analyseArray(int[] array) {
        int[] nyArray = new int[6];
        int antal1 = 0, antal2 = 0, antal3 = 0, antal4 = 0, antal5 = 0, antal6 = 0;
        for (int i : array) {
            if (i == 1) {
                antal1++;
                nyArray[0] = antal1;
            } else if (i == 2) {
                antal2++;
                nyArray[1] = antal2;
            } else if (i == 3) {
                antal3++;
                nyArray[2] = antal3;
            } else if (i == 4) {
                antal4++;
                nyArray[3] = antal4;
            } else if (i == 5) {
                antal5++;
                nyArray[4] = antal5;
            } else {
                antal6++;
                nyArray[5] = antal6;
            }
        }
        return nyArray;
    }
}