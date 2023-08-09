
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
    RoverStatus initialStatus = Direction.NORTH.getStatus();
    // act
    Rover rover = new Rover(initialPosition, initialStatus);
    // assert
    Assertions.assertEquals(initialPosition, rover.getPosition());
    Assertions.assertEquals(initialStatus, rover.getStatus());
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
    Rover rover = new Rover(new Coordinates(x, y), Direction.valueByKey(direction).getStatus());
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
    Rover rover = new Rover(new Coordinates(x, y), Direction.valueByKey(direction).getStatus());
    // act
    rover.moveBackward();
    // assert
    Assertions.assertEquals(new Coordinates(expectedX, expectedY), rover.getPosition());
  }


  @ParameterizedTest
  @CsvSource({
      "N,W",
      "W,S",
      "S,E",
      "E,N"
  })
  void roverTurnLeft(char directionKey, char expectedDirectionKey) {
    // arrange
    Rover rover = new Rover(new Coordinates(0, 0), Direction.valueByKey(directionKey).getStatus());
    // act
    rover.turnLeft();
    // assert
    Assertions.assertEquals(expectedDirectionKey, rover.getStatus().getKey());
  }

  @ParameterizedTest
  @CsvSource({
      "W,N",
      "S,W",
      "E,S",
      "N,E"
  })
  void roverTurnRight(char directionKey, char expectedDirectionKey) {
    // arrange
    Rover rover = new Rover(new Coordinates(0, 0), Direction.valueByKey(directionKey).getStatus());
    // act
    rover.turnRight();
    // assert
    Assertions.assertEquals(expectedDirectionKey, rover.getStatus().getKey());
  }
}
