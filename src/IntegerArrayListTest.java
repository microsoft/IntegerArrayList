
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class IntegerArrayListTest {
    private IntegerArrayList list;

    @BeforeEach
    public void setup() {
        list = new IntegerArrayList();
    }

    @Test
    public void testSizeEmptyList() {
        assertEquals(0, list.size());
    }

    @Test
    public void testAddingOneValueIncreasesSize() {
        list.add(123);
        assertEquals(1, list.size());
    }

    @Test
    public void testAddingMultipleValuesIncreasesSize() {
        list.add(1);
        list.add(2);
        list.add(3);
        assertEquals(3, list.size());
    }

    @Test
    public void testAddingNegativeValuesIncreasesSize() {
        list.add(-1);
        list.add(2);
        list.add(-3);
        assertEquals(3, list.size());
    }

    @Test
    public void testFirstValueIsStoredAtIndexZero() {
        list.add(1);
        assertEquals(1, list.get(0));
    }

    @Test
    public void testMultipleValuesAreStoredInOrderOfAdding() {
        list.add(1);
        list.add(2);
        list.add(3);
        assertEquals(1, list.get(0));
        assertEquals(2, list.get(1));
        assertEquals(3, list.get(2));
    }

    @Test
    public void testNegativeValuesAreStoredInOrderOfAdding() {
        list.add(-1);
        list.add(2);
        list.add(-3);
        assertEquals(-1, list.get(0));
        assertEquals(2, list.get(1));
        assertEquals(-3, list.get(2));
    }

    @Test
    public void testIndexEqualToSizeGivesIndexOutOfBoundsException() {
        assertThrows(IndexOutOfBoundsException.class, () -> list.get(0));
    }

    @Test
    public void testIndexLargerThanSizeGivesIndexOutOfBoundsException() {
        list.add(1);
        assertThrows(IndexOutOfBoundsException.class, () -> list.get(2));
    }

    @Test
    public void testAddingElevenValuesIncreasesSizeToEleven() {
        for (int i = 0; i < 11; i++) {
            list.add(i);
        }
        assertEquals(11, list.size());
    }

    @Test
    public void testAddingFifteenValuesIncreasesSizeToFifteen() {
        for (int i = 0; i < 15; i++) {
            list.add(i);
        }
        assertEquals(15, list.size());
    }

    @Test
    public void testCanAccessTheEleventhValueInAList() {
        for (int i = 1; i <= 11; i++) {
            list.add(i);
        }
        assertEquals(11, list.get(10));
    }

    @Test
    public void testCanAccessTheFifteenthValueInAList() {
        for (int i = 1; i <= 15; i++) {
            list.add(i);
        }
        assertEquals(15, list.get(14));
    }

    @Test
    public void testIndexLargerThanSizeGivesIndexOutOfBoundsExceptionForListOfSizeFifteen() {
        for (int i = 1; i <= 15; i++) {
            list.add(i);
        }
        assertThrows(IndexOutOfBoundsException.class, () -> list.get(16));
    }
}
