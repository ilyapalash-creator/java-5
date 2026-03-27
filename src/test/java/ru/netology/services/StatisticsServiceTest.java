package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class StatisticsServiceTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/statistics.csv")
    public void testCalculateWithFirstExample(int income, int expenses, int threshold, int expected) {
        StatisticsService service = new StatisticsService();
        int actual = service.calculate(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);
    }

    //  @Test
    //  public void testCalculateWithSecondExample(){
    //      StatisticsService service = new StatisticsService();
    //      int actual = service.calculate(100_000, 60_000, 150_000);
    //      int expected = 2;
}



