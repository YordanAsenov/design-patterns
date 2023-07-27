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
        .map(cmd -> cmd.createCmd(rover))
        .collect(Collectors.toList());
  }
}
