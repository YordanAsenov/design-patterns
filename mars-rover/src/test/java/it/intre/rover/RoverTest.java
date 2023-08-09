
package it.intre.rover;

import it.intre.Coordinates;
import it.intre.Direction;
import it.intre.Planet;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class RoverTest {
  Planet planet = new Planet(1000, 1000);

  @Test
  public void canCreateRoverWith00AndNorth() {
    // arrange
    Coordinates initialPosition = new Coordinates(0, 0);
    RoverStatus initialStatus = Direction.NORTH.getStatus();
    // act
    Rover rover = new Rover(initialPosition, initialStatus, planet);
    // assert
    Assertions.assertEquals(initialPosition, rover.getPosition());
    Assertions.assertEquals(initialStatus, rover.getStatus());
  }

  @ParameterizedTest
  @CsvSource({
      "0,0,N,0,1",
      "0,0,E,1,0",
      "0,0,S,0,999",
      "0,0,W,999,0"
  })
  void roverMovesForward(int x, int y, char direction, int expectedX, int expectedY) throws Exception {
    // arrange
    Rover rover = new Rover(new Coordinates(x, y), Direction.valueByKey(direction).getStatus(), planet);
    // act
    rover.moveForward();
    // assert
    Assertions.assertEquals(new Coordinates(expectedX, expectedY), rover.getPosition());
  }

  @ParameterizedTest
  @CsvSource({
      "0,0,N,0,999",
      "0,0,E,999,0",
      "0,0,S,0,1",
      "0,0,W,1,0"
  })
  void roverMovesBackward(int x, int y, char direction, int expectedX, int expectedY) throws Exception {
    // arrange
    Rover rover = new Rover(new Coordinates(x, y), Direction.valueByKey(direction).getStatus(), planet);
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
  void roverTurnLeft(char directionKey, char expectedDirectionKey) throws Exception {
    // arrange
    Rover rover = new Rover(new Coordinates(0, 0), Direction.valueByKey(directionKey).getStatus(), planet);
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
  void roverTurnRight(char directionKey, char expectedDirectionKey) throws Exception {
    // arrange
    Rover rover = new Rover(new Coordinates(0, 0), Direction.valueByKey(directionKey).getStatus(), planet);
    // act
    rover.turnRight();
    // assert
    Assertions.assertEquals(expectedDirectionKey, rover.getStatus().getKey());
  }
}
