
package it.intre;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class RoverTest {

  @Test
  public void canCreateRoverWith00AndNorth(){
    // arrange
    Coordinates initialPosition = new Coordinates(0, 0);
    Direction initialDirection = Direction.NORTH;
    // act
    Rover rover = new Rover(initialPosition, initialDirection);
    // assert
    Assertions.assertEquals(initialPosition, rover.getInitialPosition());
    Assertions.assertEquals(initialDirection, rover.getDirection());
  }

  private static Stream<Arguments> canCreateRoverFromStringParametersArgs() {
    return Stream.of(
            Arguments.of("0,0,N", new Coordinates(0,0), Direction.NORTH),
            Arguments.of("1,3,S", new Coordinates(1,3), Direction.SOUTH),
            Arguments.of("3,2,W", new Coordinates(3,2), Direction.WEST)
    );
  }

  @ParameterizedTest
  @MethodSource("canCreateRoverFromStringParametersArgs")
  public void canCreateRoverFromStringParameters(String input, Coordinates expectedCoordinates, Direction expectedDirection){
    // act
    Rover rover = RoverFactory.create(input);
    // assert
    Assertions.assertEquals(expectedCoordinates, rover.getInitialPosition());
    Assertions.assertEquals(expectedDirection, rover.getDirection());
  }
}
