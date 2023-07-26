package it.intre.rover.status;

import it.intre.Direction;
import it.intre.rover.Rover;

public class WestFacing implements RoverStatus {

  @Override
  public void moveForward(Rover rover) {
    rover.getPosition().setX(rover.getPosition().getX() - 1);
  }

  @Override
  public void moveBackward(Rover rover) {
    rover.getPosition().setX(rover.getPosition().getX() + 1);
  }

  @Override
  public void turnLeft(Rover rover) {
    rover.setDirection(Direction.SOUTH);
  }

  @Override
  public void turnRight(Rover rover) {
    rover.setDirection(Direction.NORTH);
  }
}
