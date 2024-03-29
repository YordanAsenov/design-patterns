package it.intre.rover;

import it.intre.Coordinates;
import it.intre.Direction;
import java.util.stream.Stream;

import it.intre.Planet;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class RoverFactoryTest {

  private static Stream<Arguments> canCreateRoverFromStringParametersArgs() {
    return Stream.of(
        Arguments.of("0,0,N", new Coordinates(0, 0), Direction.NORTH.getStatus()),
        Arguments.of("1,3,S", new Coordinates(1, 3), Direction.SOUTH.getStatus()),
        Arguments.of("3,2,W", new Coordinates(3, 2), Direction.WEST.getStatus())
    );
  }

  @ParameterizedTest
  @MethodSource("canCreateRoverFromStringParametersArgs")
  public void canCreateRoverFromStringParameters(String input, Coordinates expectedCoordinates,
                                                 RoverStatus expectedDirection) throws Exception {
    // arrange
    Planet planet = new Planet(1000, 1000);
    // act
    Rover rover = RoverFactory.create(input, planet);
    // assert
    Assertions.assertEquals(expectedCoordinates, rover.getPosition());
    Assertions.assertEquals(expectedDirection, rover.getStatus());
  }
}
