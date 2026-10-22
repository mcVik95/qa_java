import com.example.Feline;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class FelineTest {

    @Test
    public void eatMeatReturnFoodAnimals() throws Exception {
        Feline feline = new Feline();
        assertEquals(List.of("Животные", "Птицы", "Рыба"), feline.eatMeat());
    }

    @Test
    public void getFamilyReturnCatClass() {
        Feline feline = new Feline();
        assertEquals("Кошачьи", feline.getFamily());
    }

    @Test

    public void getKittensReturnOne() {
        Feline feline = new Feline();
        assertEquals(1, feline.getKittens());
    }

    @Test

    public void getKittensCount() {
        Feline feline = new Feline();
        assertEquals(10, feline.getKittens(10));
    }
}