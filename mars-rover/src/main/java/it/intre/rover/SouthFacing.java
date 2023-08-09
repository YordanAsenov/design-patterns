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
    rover.setStatus(Direction.EAST.getStatus());
  }

  @Override
  public void turnRight(Rover rover) {
    rover.setStatus(Direction.WEST.getStatus());
  }

  @Override
  public char getKey() {
    return 'S';
  }
}
