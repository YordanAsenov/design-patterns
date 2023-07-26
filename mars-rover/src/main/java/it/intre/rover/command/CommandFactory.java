package it.intre.rover.command;

import it.intre.rover.Rover;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CommandFactory {

  public static List<RoverCommand> parseCommand(Rover rover, String commands) {
    return Arrays.stream(commands.split(""))
        .map(cmdString -> cmdString.charAt(0))
        .map(CommandEnum::valueByKey)
        .map(cmd -> createCommand(rover, cmd))
        .collect(Collectors.toList());
  }

  private static RoverCommand createCommand(Rover rover, CommandEnum command) {
    RoverCommand cmd = null;
    switch (command) {
      case Forward -> cmd = new MoveForwardCommand(rover);
      case Backward -> cmd = new MoveBackwardCommand(rover);
      case TurnLeft -> cmd = new TurnLeftCommand(rover);
      case TurnRight -> cmd = new TurnRightCommand(rover);
    }

    return cmd;
  }
}
