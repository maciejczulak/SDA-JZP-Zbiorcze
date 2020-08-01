package pl.sda.ex1;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringerServiceTest {
    @Test
    public void testGetSortedAlphabeticallyZAShouldSortCorrectly(){
        List<String> listUnsorted = getUnsorterdStrings();

        StringService ss = new StringService();
        List<String> listSorted = new ArrayList<>();
        listSorted=ss.getSortedAlphabeticallyCaseInsensitvly(listUnsorted);
        System.out.println(listSorted);

        List<String> manuallyListSorted = Arrays.asList("za", "ab", "aa", "aB", "Ab");
        assertEquals(manuallyListSorted, listSorted);



    }

    private List<String> getUnsorterdStrings() {
        List<String> listUnsorted = new ArrayList<>();
        listUnsorted.add("aB");
        listUnsorted.add("aa");
        listUnsorted.add("ab");
        listUnsorted.add("za");
        listUnsorted.add("Ab");
        return listUnsorted;
    }
}
