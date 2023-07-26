
package it.intre.rover;

import it.intre.Coordinates;
import it.intre.Direction;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
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
    Assertions.assertEquals(initialPosition, rover.getPosition());
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
    Assertions.assertEquals(expectedCoordinates, rover.getPosition());
    Assertions.assertEquals(expectedDirection, rover.getDirection());
  }

  @ParameterizedTest
  @CsvSource({
          "0,0,N,0,1",
          "0,0,E,1,0",
          "0,0,S,0,-1",
          "0,0,W,-1,0"
  })
  void roverMovesForward() {
    // arrange
    Rover rover = RoverFactory.create("0,0,N");
    // act
    rover.moveForward();
    // assert
    Assertions.assertEquals(new Coordinates(0,1), rover.getPosition());
  }
}
