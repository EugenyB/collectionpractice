package model;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class TestCollections {

    // 1 --------------------------------
    @Test @Disabled
    void testPrintList() {
        list.forEach(System.out::println);
    }

    // 2 --------------------------------
    @Test @Disabled
    void testChangeWeightOfFirstByOne() {
        //todo Збільшити вагу першої коробки на 1.
        assertEquals(new HeavyBox(1,2,3,5), list.get(0));
    }

    // 3 --------------------------------
    @Test @Disabled
    void testDeleteLast() {
        //todo Видалити передостанню коробку.
        assertEquals(6, list.size());
        assertEquals(new HeavyBox(1,2,3,4), list.get(0));
        assertEquals(new HeavyBox(1,3,3,4), list.get(list.size()-2));
    }

    // 4 --------------------------------
    @Test @Disabled
    void testConvertToArray() {
        //todo Отримати масив що містить коробки з колекції трьома способами та вивести на консоль.
        HeavyBox[] arr = null;
        assertArrayEquals(new HeavyBox[]{
                new HeavyBox(1,2,3,4),
                new HeavyBox(3,3,3,4),
                new HeavyBox(2,6,5,3),
                new HeavyBox(2,3,4,7),
                new HeavyBox(1,3,3,4),
                new HeavyBox(1,2,3,4),
                new HeavyBox(1,1,1,1)
        }, arr);
    }

    // 5 --------------------------------
    @Test @Disabled
    void testDeleteBoxesByWeight() {
        // todo Видалити всі коробки, які мають вагу 4
        assertEquals(3, list.size());
    }

    // 6 --------------------------------
    @Test @Disabled
    void testSortBoxesByWeight() {
        // todo відсортувати коробки за зростанням ваги. При одинаковій вазі - за збільшенням об'єма
        assertEquals(new HeavyBox(1,1,1,1), list.get(0));
        assertEquals(new HeavyBox(2,3,4,7), list.get(6));
        assertEquals(new HeavyBox(1,2,3,4), list.get(3));
        assertEquals(new HeavyBox(1,3,3,4), list.get(4));
    }

    // 7 --------------------------------
    @Test @Disabled
    void testClearList() {
        //todo Видалити всі коробки.
        assertTrue(list.isEmpty());
    }

    // 8 --------------------------------
    @Test @Disabled
    void testReadAllLinesFromFileToList() {
        // todo Прочитати всі рядки в колекцію
        List<String> lines = null;
        assertEquals(19, lines.size());
        assertEquals("", lines.get(8));
    }

    // 9 --------------------------------
    @Test @Disabled
    void testReadAllWordsFromFileToList() throws IOException {
        // todo прочитати всі рядки, розбити на слова і записати в колекцію
        List<String> words = readAllWordsFromFileToList();
        assertEquals(257, words.size());
    }

    List<String> readAllWordsFromFileToList() {

        return null;
    }

    // 10 -------------------------------
    @Test @Disabled
    void testFindLongestWord() {
        // todo Знайти найдовжче слово
        assertEquals("conversations", findLongestWord());
    }

    private String findLongestWord() {
        return null;
    }

    // 11 -------------------------------
    @Test @Disabled
    void testAllWordsByAlphabetWithoutRepeat() {
        // todo Отримати список всіх слів за алфавітом без повторів
        List<String> result = null;

        assertEquals("alice", result.get(5));
        assertEquals("all", result.get(6));
        assertEquals("without", result.get(134));
        assertEquals(138, result.size());
    }

    // 12 -------------------------------
    @Test @Disabled
    void testFindMostFrequentWord() {
        // todo Знайти слово, що зустрічається найчастіше
        assertEquals("the", mostFrequentWord());
    }

    // 13 -------------------------------
    @Test @Disabled
    void testFindWordsByLengthInAlphabetOrder() throws IOException {
        // todo Отримати список слів, довжиною не більше 5 символів, переведених у нижній регістр, в порядку алфавіту, без повторів
        List<String> strings = null;

        assertEquals(94, strings.size());
        assertEquals("a", strings.get(0));
        assertEquals("alice", strings.get(2));
        assertEquals("would", strings.get(strings.size() - 1));
    }

    private String mostFrequentWord() {
        return null;
    }

    List<HeavyBox> list;

    @BeforeEach
    void setUp() {
        list = new ArrayList<>(List.of(
                new HeavyBox(1,2,3,4),
                new HeavyBox(3,3,3,4),
                new HeavyBox(2,6,5,3),
                new HeavyBox(2,3,4,7),
                new HeavyBox(1,3,3,4),
                new HeavyBox(1,2,3,4),
                new HeavyBox(1,1,1,1)
        ));
    }

    static final String REGEXP = "\\W+"; // for splitting into words

    private BufferedReader reader;

    @BeforeEach
    public void setUpBufferedReader() throws IOException {
        reader = Files.newBufferedReader(
                Paths.get("Text.txt"), StandardCharsets.UTF_8);
    }

    @AfterEach
    public void closeBufferedReader() throws IOException {
        reader.close();
    }
}
