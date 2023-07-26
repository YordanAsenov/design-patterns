package it.intre.rover.command;

import it.intre.rover.Rover;

public class TurnRightCommand implements RoverCommand {

  private final Rover rover;

  public TurnRightCommand(Rover rover) {
    this.rover = rover;
  }

  @Override
  public void execute() {
    rover.turnRight();
  }
}
