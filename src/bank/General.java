package bank;

import org.json.simple.JSONObject;

import java.nio.file.LinkOption;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static java.lang.Integer.min;

public class General {
    // class to hold general utility functions

    public static JSONObject localDateToJSON(LocalDate date){
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("year", date.getYear());
        jsonObject.put("month", date.getMonthValue());
        jsonObject.put("day", date.getDayOfMonth());
        return jsonObject;
    }

    public static LocalDate localDateFromJSON(JSONObject jsonObject){
        Long temp = (Long) jsonObject.get("year");
        int year = Math.toIntExact(temp);
        temp = (Long) jsonObject.get("month");
        int month = Math.toIntExact(temp);
        temp = (Long) jsonObject.get("day");
        int day = Math.toIntExact(temp);
        return LocalDate.of(year, month, day);

    }

    public static String[] arrayFromString(String arr){
        return arr.replaceAll("\\[", "").replaceAll("]", "").split(", ");
    }

    public static <T> String listToStringColumn(List<T> ar){
        StringBuilder s = new StringBuilder();
        for (T t : ar) {
            s.append(t.toString()).append("\n");
        }
        return s.toString();
    }

    public static <T> String myArrayToString (T[] ar) {
        // converts [a,b,c] to "
        // 1. a
        // 2. b
        // 3. c"
        return myArrayToString(ar, 1);
    }

    public static <T> String myArrayToString (T[] ar, int start) {
        // converts [a,b,c] to "
        // start. a
        // start + 1. b
        // start + 2. c"
        String s = "";
        for (int i = 0; i < ar.length; i++) {
            s += (i+start) + ". " + ar[i].toString() + "\n";
        }
        return s;
    }

    public static <T> String arrayListToString(ArrayList<T> arraylist){
        return arrayListToString(arraylist,1);
    }

    public static <T> String arrayListToString(ArrayList<T> arraylist, int start)
    {
        String s = "";
        for (int i = start; i < arraylist.size(); i++) {
            s += i + ". " + arraylist.get(i).toString() + "\n";
        }
        return s;
    }

    public static String[] stringToArray(String ans) {
        String[] ar = ans.replace(" ", "").split(",");
        return ar;
    }

    public static ArrayList<String> arrayToList(String[] ar) {
        return new ArrayList<String>(Arrays.asList(ar));
    }

    public static int[] intsInRange(int l, int h) {
        // returns ints in range [l,h)
        int[] res = new int[h-l];
        int j = 0;
        for (int i = l; i < h; i++) {
            res[j] = i;
            j++;
        }
        return res;
    }

    public static String[] intsToString(int[] ints) {
        String[] res = new String[ints.length];
        for (int i = 0; i < ints.length; i++) {
            res[i] = ints[i] +"";
        }
        return res;
    }

    public static Stream<Object> flatten(Object[] array) {
        return Arrays.stream(array)
                .flatMap(o -> o instanceof Object[]? flatten((Object[])o): Stream.of(o));
    }

    public static int[] flattenIntArray(int[][] ar) {
        // flattens the array
        int length = 0;
        for (int i = 0; i < ar.length; i++) {
            length = length + ar[i].length;
        }
        int[] res = new int[length];
        int k = 0;
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar[i].length; j++) {
                res[k] = ar[i][j];
                k++;
            }
        }
        return res;
    }

    public static <T> String myListToString (List<T> ar) {
        // converts [a,b,c] to "
        // 1. a
        // 2. b
        // 3. c"
        return myListToString(ar, 1);
    }

    public static <T> String myListToString (List<T> ar, int start) {
        // converts [a,b,c] to "
        // start. a
        // start + 1. b
        // start + 2. c"
        String s = "";
        for (int i = 0; i < ar.size(); i++) {
            s += (i+start) + ". " + ar.get(i).toString() + "\n";
        }
        return s;
    }

    public static int[] arrayPlusOne(int[] ar) {
        // add 1 to each element of the array
        int[] r = new int[ar.length];
        for (int i = 0; i < ar.length; i++) {
            r[i] = ar[i]+1;
        }
        return r;
    }

    public static int intWithinBounds(int i, int l, int u) {
        int r = i;
        if (i < l) { r = l;}
        else if (i > r) {r = u;}
        return r;
    }

    public static <T> String arrayToStringWithIds(T[] ar, int[] ids) {
        // converts [a,b,c], [2,4,5] to "
        // 2. a
        // 4. b
        // 5. c"
        String s = "";
        for (int i = 0; i < min(ar.length, ids.length); i++) {
            s += ids[i] + ". " + ar[i].toString() + "\n";
        }
        return s;
    }


    public static List<String> intsToString(ArrayList<Integer> possibleInts) {
        ArrayList<String> res = new ArrayList<>();
        for (Integer i:possibleInts) {
            res.add(i.toString());
        }
        return res;
    }
}
