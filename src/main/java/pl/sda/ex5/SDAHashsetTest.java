package pl.sda.ex5;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class SDAHashsetTest {
    @Test
    public void showcase() {
        SDAHashset<Integer> set = new SDAHashset<>();
        set.add(1);
        System.out.println(set.contains(1));
        set.add(2);
        set.remove(1);
        set.clear();

        assertEquals(0,set.size())
        assertTrue(set.isEmpty());
        assertEquals(5,set.getOperationCounter);

    }
}
