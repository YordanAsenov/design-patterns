package it.intre.rover;
import it.intre.Coordinates;
import it.intre.Direction;
import it.intre.Planet;

public class RoverFactory {
    /**
     *
     * @param input  "2,4,N"
     * @return Rover
     */
    public static Rover create(String input) throws Exception {
        String[] inputCommands = input.split(",");
        Coordinates coordinates = new Coordinates(Integer.parseInt(inputCommands[0]), Integer.parseInt(inputCommands[1]));
        Planet planet = new Planet(10, 10);
        RoverStatus status = Direction.valueByKey(inputCommands[2].charAt(0)).getStatus();
        return new Rover(coordinates, status, planet);
    }
}
