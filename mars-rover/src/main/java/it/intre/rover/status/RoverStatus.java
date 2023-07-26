package it.intre.rover.status;


import it.intre.rover.Rover;

public interface RoverStatus {

  void moveForward(Rover rover);

  void moveBackward(Rover rover);

  void turnLeft(Rover rover);

  void turnRight(Rover rover);
}
