package it.intre.rover;

import it.intre.Coordinates;
import it.intre.Direction;
import it.intre.Planet;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Rover {

  private Coordinates position;
  private RoverStatus status;
  private Planet planet;

  public void moveForward() {
    status.moveForward(this);
  }

  public void moveBackward() {
    status.moveBackward(this);
  }

  public void turnLeft() {
    status.turnLeft(this);
  }

  public void turnRight() {
    status.turnRight(this);
  }

  void moveToward(Direction direction) {
    position = planet.getNextCoordinates(position, direction);
  }
}
