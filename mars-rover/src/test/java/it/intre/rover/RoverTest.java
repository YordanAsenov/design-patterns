
package it.intre.rover;

import it.intre.Coordinates;
import it.intre.Direction;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class RoverTest {

  @Test
  public void canCreateRoverWith00AndNorth() {
    // arrange
    Coordinates initialPosition = new Coordinates(0, 0);
    Direction initialDirection = Direction.NORTH;
    // act
    Rover rover = new Rover(initialPosition, initialDirection);
    // assert
    Assertions.assertEquals(initialPosition, rover.getPosition());
    Assertions.assertEquals(initialDirection, rover.getDirection());
  }

  @ParameterizedTest
  @CsvSource({
      "0,0,N,0,1",
      "0,0,E,1,0",
      "0,0,S,0,-1",
      "0,0,W,-1,0"
  })
  void roverMovesForward(int x, int y, char direction, int expectedX, int expectedY) {
    // arrange
    Rover rover = new Rover(new Coordinates(x, y), Direction.valueByKey(direction));
    // act
    rover.moveForward();
    // assert
    Assertions.assertEquals(new Coordinates(expectedX, expectedY), rover.getPosition());
  }

  @ParameterizedTest
  @CsvSource({
      "0,0,N,0,-1",
      "0,0,E,-1,0",
      "0,0,S,0,1",
      "0,0,W,1,0"
  })
  void roverMovesBackward(int x, int y, char direction, int expectedX, int expectedY) {
    // arrange
    Rover rover = new Rover(new Coordinates(x, y), Direction.valueByKey(direction));
    // act
    rover.moveBackward();
    // assert
    Assertions.assertEquals(new Coordinates(expectedX, expectedY), rover.getPosition());
  }
}
