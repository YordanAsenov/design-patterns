
package it.intre;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RoverTest {


  @Test
  public void createInstance(){
    // arrange
    Rover rover = new Rover();

    // assert
    Assertions.assertNotNull(rover);
  }


}
