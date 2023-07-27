package it.intre.rover.command;

import it.intre.rover.Rover;
import java.util.function.Function;

public enum CommandEnum {

  Forward('f', MoveForwardCommand::new),
  Backward('b', MoveBackwardCommand::new),
  TurnLeft('l', TurnLeftCommand::new),
  TurnRight('r', TurnRightCommand::new);

  public final char key;
  private final Function<Rover, RoverCommand> createCmdFn;

  CommandEnum(char key, Function<Rover, RoverCommand> createCmdFn) {
    this.key = key;
    this.createCmdFn = createCmdFn;

  }

  public static CommandEnum valueByKey(char key) {
    for (CommandEnum d : values()) {
      if (d.key == key) {
        return d;
      }
    }
    return null;
  }

  public RoverCommand createCmd(Rover rover){
    return createCmdFn.apply(rover);
  }

}
