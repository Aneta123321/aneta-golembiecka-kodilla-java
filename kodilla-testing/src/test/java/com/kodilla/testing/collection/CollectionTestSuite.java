package com.kodilla.testing.collection;

import org.junit.jupiter.api.*;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CollectionTestSuite {

    @BeforeEach
    void before(TestInfo testInfo) {
        String dName = testInfo.getDisplayName();
        System.out.println("------------- Start: " + dName + "(" + testInfo.getTestMethod().orElseThrow().getName() + ") ---------------------");
    }
    @AfterEach
    void after(TestInfo testInfo) {
        System.out.println("------------- Koniec: " + testInfo.getDisplayName() + " ---------------------\n");
    }
    @Test
    @DisplayName("1. Test sprawdzający, czy klasa zachowuje się poprawnie, gdy lista jest pusta")
    void testOddNumbersExterminatorEmptyList() {
        //given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();

        //when
        List<Integer> result = oddNumbersExterminator.exterminate(Arrays.asList());

        //then
        assertAll(
                () -> assertTrue(result.size() == 0),
                () -> assertTrue(result.isEmpty()),
                () -> assertEquals(Arrays.asList(), result)
        );
    }

    @Test
    @DisplayName("2. Test sprawdzający, czy klasa zachowuje się poprawnie, gdy lista zawiera liczby parzyste i nieparzyste")
    void testOddNumbersExterminatorNormalList() {
        //given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();

        //when
        List<Integer> result = oddNumbersExterminator.exterminate(Arrays.asList(1, 5, 6, 8, 9, 0, 35, 12)); // przekazana lista wartosci

        //then
        assertAll(
                () -> assertTrue(result.size() == 4),
                () -> assertTrue(!result.isEmpty()),
                () -> assertEquals(Arrays.asList(6, 8, 0, 12), result)
        );
    }
}