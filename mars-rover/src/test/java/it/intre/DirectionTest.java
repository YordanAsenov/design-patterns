package it.intre;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DirectionTest {
    @ParameterizedTest
    @CsvSource({"N,NORTH", "E,EAST", "S,SOUTH", "W,WEST"})
    void valueByKey(char input, Direction expected) {
        assertEquals(expected, Direction.valueByKey(input));
    }
}
