package it.intre.rover.status;

import it.intre.rover.Rover;

public class EastFacing implements RoverStatus {
    @Override
    public void moveForward(Rover rover) {
        rover.getPosition().setX(rover.getPosition().getX() + 1);
    }

    @Override
    public void moveBackward(Rover rover) {
        throw new UnsupportedOperationException();
    }
}
