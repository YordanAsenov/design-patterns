package it.intre.rover.status;

import it.intre.Direction;
import it.intre.rover.Rover;

public class EastFacing implements RoverStatus {

  @Override
  public void moveForward(Rover rover) {
    rover.incrementX();
  }

  @Override
  public void moveBackward(Rover rover) {
    rover.decrementX();
  }

  @Override
  public void turnLeft(Rover rover) {
    rover.setDirection(Direction.NORTH);
  }

  @Override
  public void turnRight(Rover rover) {
    rover.setDirection(Direction.SOUTH);
  }
}
