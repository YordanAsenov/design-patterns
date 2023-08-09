package it.intre.rover;

import it.intre.Coordinates;
import it.intre.Direction;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Rover {

  private Coordinates position;
  private Direction direction;

  public void moveForward() {
    direction.status.moveForward(this);
  }

  public void moveBackward() {
    direction.status.moveBackward(this);
  }

  public void turnLeft() {
    direction.status.turnLeft(this);
  }

  public void turnRight() {
    direction.status.turnRight(this);
  }

  public void incrementY() {
    this.position = this.position.incrementY();
  }

  public void decrementY() {
    this.position = this.position.decrementY();
  }

  public void decrementX() {
    this.position = this.position.decrementX();
  }

  public void incrementX() {
    this.position = this.position.incrementX();
  }
}
