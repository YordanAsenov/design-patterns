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
    direction.moveForward(this);
  }

  public void moveBackward() {
    direction.moveBackward(this);
  }

  public void turnLeft() {
    direction.turnLeft(this);
  }

  public void turnRight() {
    direction.turnRight(this);
  }

  void incrementY() {
    this.position = this.position.incrementY();
  }

  void decrementY() {
    this.position = this.position.decrementY();
  }

  void decrementX() {
    this.position = this.position.decrementX();
  }

  void incrementX() {
    this.position = this.position.incrementX();
  }
}
