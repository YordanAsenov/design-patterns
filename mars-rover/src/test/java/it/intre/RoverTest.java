
package it.intre;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RoverTest {

  @Test
  public void canCreateRover(){
    // arrange
    Coordinates initialPosition = new Coordinates(0, 0);
    // act
    Rover rover = new Rover(initialPosition,Direction.NORTH);
    // assert
    Assertions.assertNotNull(rover);
  }

}
