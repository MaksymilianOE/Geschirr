import java.util.Arrays;
import java.util.Objects;

//TODO: Array auffüllen DONE
//TODO: Array umdrehen
//TODO: in Array reinböllern

public class geschirr {
    public static void main(String[] args) {
        String[] startArr;
        startArr = args;
        System.out.println("Startarr: " + Arrays.toString(startArr));


        if (args.length > 5) {
            System.out.println("Bitte nicht mehr als 5 Worter eingeben!");
        }
        if (args.length < 5) {
            System.out.println("Bitte mindestens 5 Wörter eingeben! Es werden jetzt dummywerte verwendet!");
        }
        System.out.println(Arrays.toString(args));
        String[] dummyWerte = {"Teller", "Tasse", "Messer", "Gabel", "Pfanne"};
        String[] returnArray = checkArray(args, dummyWerte);
        System.out.println(Arrays.toString(returnArray));
    }

    public static String[] turnArray (String[] arr, String[] dummyWerte) {
        String[] returnArray = new String[5]; //array zum befüllen
        int counter = 0;

        return returnArray;
    }

    public static String[] checkArray (String[] geschirr, String[] dummy) {
        String[] returnArr = new String[5];
        if (geschirr.length == 5) {
            //CODE
            for (int i = 0; i <= geschirr.length - 1; i++) {
                System.out.println(geschirr[i]);
                if (Objects.equals(geschirr[i], "") || geschirr[i] == null) {
                    System.out.println("Dummywerte werden für fehlenden Eintrag verwendet!");
                    returnArr[i] = dummy[i];
                } else {
                    returnArr[i] = geschirr[i];
                }
            }
        } else {
            if (geschirr.length > 5) {
                System.out.println("Es werden nur die ersten 5 Wörter berücksichtigt!");
            } else {
                System.out.println("Zu wenige Werte (Min 5). Es werden Dummywerte verwendet!");
            }
        }
        return returnArr;
    }
}
