package it.intre.rover;

import it.intre.Direction;

public class SouthFacing implements RoverStatus {

  @Override
  public void moveForward(Rover rover) {
    rover.decrementY();
  }

  @Override
  public void moveBackward(Rover rover) {
    rover.incrementY();
  }

  @Override
  public void turnLeft(Rover rover) {
    rover.setDirection(Direction.EAST);
  }

  @Override
  public void turnRight(Rover rover) {
    rover.setDirection(Direction.WEST);
  }
}
