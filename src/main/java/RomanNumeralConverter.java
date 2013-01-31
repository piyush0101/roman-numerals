import com.sun.tools.javac.util.Pair;

import java.util.Arrays;
import java.util.List;

public class RomanNumeralConverter {

    private final List<Pair<String, Integer>> romanArabicFactors = Arrays.asList(
            new Pair<String, Integer>("X", 10),
            new Pair<String, Integer>("V", 5),
            new Pair<String, Integer>("IV", 4),
            new Pair<String, Integer>("I", 1));

    public String convert(int number) {
        if (number == 0) return "";
        Pair<String, Integer> romanArabic = findRomanArabicPair(number);
        return romanArabic.fst + convert(number - romanArabic.snd);
    }

    private Pair<String, Integer> findRomanArabicPair(int number) {
        Pair<String, Integer> romanArabic = null;
        for (Pair<String, Integer> romanArabicPair : romanArabicFactors) {
            if (romanArabicPair.snd <= number) {
                romanArabic = romanArabicPair;
                break;
            }
        }
        return romanArabic;
    }

}
