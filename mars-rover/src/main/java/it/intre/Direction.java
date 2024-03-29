package it.intre;

import it.intre.rover.*;

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

    public static Direction valueByKey(char key) throws Exception {
        for (Direction d: values()) {
            if (d.key == key) {
                return d;
            }
        }
        throw new Exception("Unknown direction");
    }

    public RoverStatus getStatus() {
        return this.status;
    }

    public Coordinates nextCoordinates(Coordinates currentPosition) {
        return getStatus().nextPosition(currentPosition);
    }
}
