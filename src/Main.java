import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("\nDu har nu skapat 1000 slumpmässiga tal mellan 1 och 6 " +
                "vilka har sparats i en textfil med namnet \"Dice\".\n");
        Dice.createFile();
        int[] arrayStor = Dice.createArray();
        int[] arrayLiten = Dice.analyseArray(arrayStor);
        String sammanställning = "Efter att ha analyserat denna skapade textfil kan man sammanfatta att " +
                "bland alla slumpmässigt genererade tal mellan 1 och 6 finns det:\n" + arrayLiten[0] + " ettor\n"
                + arrayLiten[1] + " tvåor\n" + arrayLiten[2] + " treor\n" + arrayLiten[3] + " fyror\n"
                + arrayLiten[4] + " femmor\n" + arrayLiten[5] + " sexor";
        System.out.println(sammanställning);
        System.out.println("\nSom sista steget i programmet har det även skapats en textfil med namnet \"Resultat\" " +
                "som innehåller denna sammanställning.");
        PrintWriter utström = new PrintWriter(new BufferedWriter(new FileWriter("Resultat.txt")));
        utström.print(sammanställning);
        utström.close();
    }
} 