package it.intre.rover.command;

import it.intre.rover.Rover;

public class MoveBackwardCommand implements RoverCommand {

  private final Rover rover;

  public MoveBackwardCommand(Rover rover) {
    this.rover = rover;
  }

  @Override
  public void execute() {
    rover.moveBackward();
  }
}
