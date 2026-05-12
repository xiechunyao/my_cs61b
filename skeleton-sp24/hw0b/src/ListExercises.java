import java.util.ArrayList;
import java.util.List;

public class ListExercises {

    /** Returns the total sum in a list of integers */
	public static int sum(List<Integer> L) {
        int sum = 0;
        for (int i = 0; i < L.size(); ++i) {
            sum += L.get(i);
        }
        return sum;
    }

    /** Returns a list containing the even numbers of the given list */
    public static List<Integer> evens(List<Integer> L) {
        List<Integer> resL = new ArrayList<>();
        for (int i = 0; i < L.size(); ++i) {
            if (L.get(i) % 2 == 0) {
                resL.add(L.get(i));
            }
        }
        return resL;
    }

    /** Returns a list containing the common item of the two given lists */
    public static List<Integer> common(List<Integer> L1, List<Integer> L2) {
        List<Integer> resL = new ArrayList<>();
        for (int i = 0; i < L1.size(); ++i) {
            if (L2.contains(L1.get(i))) {
                resL.add(L1.get(i));
            }
        }
        return resL;
    }


    /** Returns the number of occurrences of the given character in a list of strings. */
    public static int countOccurrencesOfC(List<String> words, char c) {
        int cnt = 0;
        for (int i = 0; i < words.size(); ++i) {
            for (int j = 0; j < words.get(i).length(); ++j) {
                if (words.get(i).charAt(j) == c) {
                    ++ cnt;
                }
            }
        }
        return cnt;
    }
}
