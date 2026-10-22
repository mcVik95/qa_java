import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class ParameterizedLionTest {

    private final String sex;
    private final boolean mane;

    public ParameterizedLionTest(String sex, boolean mane) {
        this.sex = sex;
        this.mane = mane;
    }

    @Parameterized.Parameters
    public static Object[][] sexLion() {
        return new Object[][] {
                {"Самец", true},
                {"Самка", false},
        };
    }

    @Test
    public void getSexLion() throws Exception{
        Lion lion = new Lion(sex, new Feline());
        assertEquals(mane, lion.doesHaveMane());
    }
}