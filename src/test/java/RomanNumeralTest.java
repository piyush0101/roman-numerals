import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

@RunWith(Parameterized.class)
public class RomanNumeralTest {
    private Integer arabic;
    private String roman;

    public RomanNumeralTest(Integer arabic, String roman) {
        this.arabic = arabic;
        this.roman = roman;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> generateData() {
        return Arrays.asList(new Object[][]{
                {1, "I"},
                {2, "II"},
                {3, "III"},
                {4, "IV"},
                {5, "V"},
                {10, "X"},
                {15, "XV"}
        });
    }

    @Test
    public void shouldConvertGivenArabicNumeralToRomanNumeral() {
        RomanNumeralConverter converter = new RomanNumeralConverter();
        String result = converter.convert(arabic);
        assertThat(result, is(roman));
    }
}
