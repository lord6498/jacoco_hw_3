package ru.netology.statistic;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class StatisticsServiceTest {
  StatisticsService service = new StatisticsService();

  @ParameterizedTest
  @MethodSource("maxArguments")
  void max(long[]incomesInBillions, int expected) {
    assertEquals(expected, service.findMax(incomesInBillions));
  }
  public static Stream<Arguments> maxArguments() {
    long[] first = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
    long[] second = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 13};

    return Stream.of(Arguments.of(first,12),
                    Arguments.of(second,13));
  }

}