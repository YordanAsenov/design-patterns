package it.intre.rover;


import it.intre.Coordinates;

public interface RoverStatus {

  void moveForward(Rover rover);

  void moveBackward(Rover rover);

  void turnLeft(Rover rover);

  void turnRight(Rover rover);

  char getKey();

  Coordinates nextPosition(Coordinates coordinates);
}
