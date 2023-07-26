package it.intre;

public class RoverFactory {
    public static Rover create(String input) {
        String[] inputCommands = input.split(",");
        Coordinates coordinates = new Coordinates(Integer.parseInt(inputCommands[0]), Integer.parseInt(inputCommands[1]));
        return new Rover(coordinates, Direction.valueByKey(inputCommands[2].charAt(0)));
    }
}
