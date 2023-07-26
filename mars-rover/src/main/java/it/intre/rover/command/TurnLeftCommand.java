package it.intre.rover.command;

import it.intre.rover.Rover;

public class TurnLeftCommand implements RoverCommand{
  private final Rover rover;

  public TurnLeftCommand(Rover rover) {
    this.rover = rover;
  }
  @Override
  public void execute() {
    rover.turnLeft();
  }
}
