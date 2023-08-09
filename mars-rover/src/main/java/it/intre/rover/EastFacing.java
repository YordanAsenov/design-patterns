package it.intre.rover;

import it.intre.Direction;

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
    rover.setStatus(Direction.NORTH.getStatus());
  }

  @Override
  public void turnRight(Rover rover) {
    rover.setStatus(Direction.SOUTH.getStatus());
  }

  @Override
  public char getKey() {
    return 'E';
  }
}
