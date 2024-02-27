import java.util.Arrays;
import java.util.Objects;

public class geschirr {
    public static void main(String[] args) {
        //TODO: Array auffüllen DONE
        //TODO: Array umdrehen
        //TODO: 

        String[] dummyWerte = {"Teller", "Tasse", "Messer", "Gabel", "Pfanne"};
        String[] testArr = {"Gabel", "Schüssel", "Kelle", "", "Topf"};
        String[] returnArray = checkArray(testArr, dummyWerte);
        System.out.println(Arrays.toString(returnArray));
    }

    public static String[] turnArray (String[] arr, String[] dummyWerte) {
        String[] returnArray = new String[5]; //array zum befüllen
        int counter = 0;

        return returnArray;
    }

    public static String[] checkArray (String[] geschirr, String[] dummy) {
        for (int i = 0; i <= geschirr.length - 1; i++) {
            if (Objects.equals(geschirr[i], "")) {
                System.out.println("Eine Position ist leer! Verwende Dummywerte!");
                geschirr[i] = dummy[i];
            }
        }
        return geschirr;
    }
}
