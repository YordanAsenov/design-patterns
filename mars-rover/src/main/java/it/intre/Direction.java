package it.intre;

import it.intre.rover.Rover;
import it.intre.rover.status.*;

public enum Direction {
    NORTH('N', new NorthFacing()),
    EAST('E', new EastFacing()),
    SOUTH('S', new SouthFacing()),
    WEST('W', new WestFacing());

    public final char key;
    public final RoverStatus status;

    Direction(char key, RoverStatus status) {
        this.key = key;
        this.status = status;
    }

    public static Direction valueByKey(char key) {
        for (Direction d: values()) {
            if (d.key == key) {
                return d;
            }
        }
        return null;
    }

    public void moveForward(Rover rover) {
        this.status.moveForward(rover);
    }

    public void moveBackward(Rover rover) {
        this.status.moveBackward(rover);
    }

    public void turnLeft(Rover rover) {
        this.status.turnLeft(rover);
    }

    public void turnRight(Rover rover) {
        this.status.turnRight(rover);
    }
}
