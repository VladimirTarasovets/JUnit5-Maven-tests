package tests;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.ValueSource;


import static org.junit.jupiter.api.Assertions.*;

public class ParametrizedTests {

    @ParameterizedTest
    @ValueSource(ints = {3, 15, 8, 20})
    void testNumberDivByTwo(int number) {
        assertEquals(0, number % 2);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/test.csv")
    void testWithCsvFile(String first, int second) {
        assertNotNull(first);
        assertNotEquals(0, second);
    }

}
