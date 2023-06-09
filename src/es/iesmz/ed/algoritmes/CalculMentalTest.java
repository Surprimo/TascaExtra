package es.iesmz.ed.algoritmes;
import org.junit.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculMentalTest {
    @Test
    public void testCalcula() {
        String sequence = "15 + 8 - 7 + 10 - 3";
        CalculMental calculMental = new CalculMental(sequence);

        List<Integer> results = calculMental.calcula();

        assertEquals(23, results.get(0));
        assertEquals(16, results.get(1));
        assertEquals(26, results.get(2));
        assertEquals(23, results.get(3));
    }
    @Test
    public void testCalcula2() {
        String sequence = "255 + 8 - 100 + 30 + 123";
        CalculMental calculMental = new CalculMental(sequence);

        List<Integer> results = calculMental.calcula();

        assertEquals(263, results.get(0));
        assertEquals(163, results.get(1));
        assertEquals(193, results.get(2));
        assertEquals(316, results.get(3));
    }
    @org.junit.Test
    public void testCalcula3() {
        String sequence = "255 + 8 - 100 + 30 - 300";
        CalculMental calculMental = new CalculMental(sequence);

        List<Integer> results = calculMental.calcula();

        assertEquals(263, results.get(0));
        assertEquals(163, results.get(1));
        assertEquals(193, results.get(2));
        assertEquals(-107, results.get(3));
    }
}

