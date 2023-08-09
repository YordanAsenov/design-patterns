package it.intre.rover;
import it.intre.Coordinates;
import it.intre.Direction;

public class RoverFactory {
    /**
     *
     * @param input  "2,4,N"
     * @return Rover
     */
    public static Rover create(String input) {
        String[] inputCommands = input.split(",");
        Coordinates coordinates = new Coordinates(Integer.parseInt(inputCommands[0]), Integer.parseInt(inputCommands[1]));
        return new Rover(coordinates, Direction.valueByKey(inputCommands[2].charAt(0)).getStatus());
    }
}
