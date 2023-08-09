package it.intre.rover;

import it.intre.Coordinates;
import it.intre.Direction;

public class NorthFacing implements RoverStatus {

  @Override
  public void moveForward(Rover rover) {
    rover.moveToward(Direction.NORTH);
  }

  @Override
  public void moveBackward(Rover rover) {
    rover.moveToward(Direction.SOUTH);
  }

  @Override
  public void turnLeft(Rover rover) {
    rover.setStatus(Direction.WEST.getStatus());
  }

  @Override
  public void turnRight(Rover rover) {
    rover.setStatus(Direction.EAST.getStatus());
  }

  @Override
  public char getKey() {
    return 'N';
  }

  @Override
  public Coordinates nextPosition(Coordinates coordinates) {
    return coordinates.incrementY();
  }
}
