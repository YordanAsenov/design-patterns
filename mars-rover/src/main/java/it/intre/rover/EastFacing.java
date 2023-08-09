package it.intre.rover;

import it.intre.Coordinates;
import it.intre.Direction;

public class EastFacing implements RoverStatus {

  @Override
  public void moveForward(Rover rover) {
    rover.moveToward(Direction.EAST);
  }

  @Override
  public void moveBackward(Rover rover) {
    rover.moveToward(Direction.WEST);
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

  @Override
  public Coordinates nextPosition(Coordinates coordinates) {
    return coordinates.incrementX();
  }
}
