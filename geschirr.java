import java.util.Arrays;

//TODO: Array auffüllen DONE
//TODO: Array umdrehen DONE
//TODO: Wörter in Array reinböllern DONE

public class geschirr {
    public static void main(String[] args) {
        try {
            String[] startArr;
            startArr = args;
            System.out.println("Startarr: " + Arrays.toString(startArr));

            String[] dummyWerte = {"Teller", "Tasse", "Messer", "Gabel", "Pfanne"};
            String[] checkedArray = checkArray(args, dummyWerte);
            System.out.println("Neuer Array: " + Arrays.toString(checkedArray));

            String[] gedrehterArray = turnArray(checkedArray);
            System.out.println("Gedrehter Array: " + Arrays.toString(gedrehterArray));
        } catch (Exception e) {
            System.out.println("Ein Fehler ist aufgetreten! Bitte versche es erneut! " + e);
        }
    }

    public static String[] turnArray(String[] arr) {
        //System.out.println("Argumente: " + Arrays.toString(arr));
        String[] returnArray = new String[5]; //array zum befüllen
        int counter = 0;
        for (int i = returnArray.length - 1; i >= 0; i--) {
            returnArray[counter] = arr[i];
            counter++;
        }
        return returnArray;
    }

    public static String[] checkArray(String[] args, String[] dummy) {

        String[] returnArray = new String[5];
        if (args.length == 5) {
            System.arraycopy(args, 0, returnArray, 0, args.length); //Kopiert den Array (Vorschlag IDE) ?!
        } else if (args.length > 5) {
            System.out.println("Es wurden zu viele Untensilien angegeben! Es werden nur die ersten 5 berücksichtigt!");
            System.arraycopy(args, 0, returnArray, 0, args.length - 1); //Kopiert den Array (Vorschlag IDE) ?!
        } else {
            {
                System.out.println("DU KEK hast zu wenige Untensilien angegeben! Die Fehlenden Plätze werden mit Dummy-Werten befüllt!");
                for (int i = 0; i < returnArray.length; i++) {
                    if (i < args.length && args[i] != null) {
                        returnArray[i] = args[i];
                    } else {
                        returnArray[i] = dummy[i];
                    }
                }
            }
        }
        return returnArray;
    }
}