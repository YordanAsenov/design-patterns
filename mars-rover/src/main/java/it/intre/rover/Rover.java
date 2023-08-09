package it.intre.rover;

import it.intre.Coordinates;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Rover {

  private Coordinates position;
  private RoverStatus status;

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
