package it.intre.rover.command;

import it.intre.Coordinates;
import it.intre.Direction;
import it.intre.rover.Rover;
import java.util.List;
import java.util.stream.Collectors;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class CommandFactoryTest {

  @Test
  void parseCommand() {
    // Arrange
    Rover r = new Rover(new Coordinates(0, 0), Direction.NORTH);
    String cmdString = "fffblfbr";
    List<Class<? extends RoverCommand>> expectedCmdClasses = List.of(
        MoveForwardCommand.class,
        MoveForwardCommand.class,
        MoveForwardCommand.class,
        MoveBackwardCommand.class,
        TurnLeftCommand.class,
        MoveForwardCommand.class,
        MoveBackwardCommand.class,
        TurnRightCommand.class

    );

    // Act
    List<RoverCommand> roverCommands = CommandFactory.parseCommand(r, cmdString);

    // Assert
    Assertions.assertEquals(expectedCmdClasses.size(), roverCommands.size());

    Assertions.assertEquals(expectedCmdClasses,
        roverCommands.stream().map(RoverCommand::getClass).collect(
            Collectors.toList()));

  }


  @ParameterizedTest
  @CsvSource({
      "f,10,11,N",
      "b,10,9,N",
      "lf,9,10,W",
      "lb,11,10,W",
      "llf,10,9,S",
      "llb,10,11,S",
      "rf,11,10,E",
      "rb,9,10,E",
      "flfflffrb,9,9,W"
  })
  void executeCommands(String cmdString, int expectedX, int expectedY, char expectedDirectionKey) {
    // Arrange
    Rover r = new Rover(new Coordinates(10, 10), Direction.NORTH);

    // 10 10 N
    // f 10 11 N
    // l 10 11 W
    // f 9
    // f 8 11 W
    // l 8 11 S
    // f 8 10 S
    // f 8 9 S
    // r 8 9 W
    // f 9 9 W

    // Act
    List<RoverCommand> roverCommands = CommandFactory.parseCommand(r, cmdString);
    roverCommands.forEach(cmd -> cmd.execute());

    // Assert
    Assertions.assertEquals(new Coordinates(expectedX, expectedY), r.getPosition());
    Assertions.assertEquals(expectedDirectionKey, r.getDirection().key);

  }
}