package it.intre.rover.command;

import it.intre.rover.Rover;

public class MoveForwardCommand implements RoverCommand {

  private final Rover rover;

  public MoveForwardCommand(Rover rover) {
    this.rover = rover;
  }

  @Override
  public void execute() {
    rover.moveForward();
  }
}
