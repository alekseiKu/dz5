package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class CalcMonthServiceTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/calcMonth.csv")
    public void test(int expected, int income, int expenses, int threshold) {
        CalcMonthService service = new CalcMonthService();

        int actual = service.calculate(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);
    }
}
