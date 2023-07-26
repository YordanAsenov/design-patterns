
package it.intre;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

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

}
