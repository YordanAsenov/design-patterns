package it.intre.rover.status;

import it.intre.rover.Rover;

public class NorthFacing implements RoverStatus {
    @Override
    public void moveForward(Rover rover) {
        rover.getPosition().setY(rover.getPosition().getY() + 1);
    }

    @Override
    public void moveBackward(Rover rover) {
        throw new UnsupportedOperationException();
    }
}
