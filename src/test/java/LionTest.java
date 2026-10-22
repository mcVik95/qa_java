import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    @Mock
    private Feline feline;

    @Test
    public void unknownSex() throws Exception {
        try {
            Lion lion = new Lion(null, feline);
        } catch (Exception exception) {
            assertEquals("Используйте допустимые значения пола животного - самец или самка", exception.getMessage());
        }
    }

    @Test
    public void getKittensReturnFelineKittens() throws Exception {
        Mockito.lenient().when(feline.getKittens()).thenReturn(1);
        Lion lion = new Lion("Самец", feline);
        assertEquals(1, lion.getKittens());

    }

    @Test
    public void getFoodReturnPredatory() throws Exception {
        Mockito.lenient().when(feline.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        Lion lion = new Lion("Самка", feline);
        assertEquals(List.of("Животные", "Птицы", "Рыба"), lion.getFood());
    }
}