# Aim

This project implements the [Mars Rover Kata](https://kata-log.rocks/mars-rover-kata) in Java.
Our goal is to practice TDD and clean code but also to apply the code patterns we learned during the
gilda.

# Requirements

- You are given the initial starting point (x,y) of a rover and the direction (N,S,E,W) it is
  facing.
- The rover receives a character array of commands.
- Implement commands that move the rover forward/backward (f,b).
- Implement commands that turn the rover left/right (l,r).
- Implement wrapping at edges. But be careful, planets are spheres.
- Implement obstacle detection before each move to a new square. If a given sequence of commands
  encounters an obstacle, the rover moves up to the last possible point, aborts the sequence and
  reports the obstacle.

# Source/Links

- https://kata-log.rocks/mars-rover-kata

# Used patters

## Simple Factory

### CommandFactory

The `CommandFactory` is a simple factory that creates a list of commands based on a given string.
Example:
For the string "ffr" the factory creates a list of commands that contains the
commands `ForwardCommand`, `ForwardCommand` and `TurnRightCommand`.

### RoverFactory

The `RoverFactory` is a simple factory that creates a rover based on a given string.
Example:
For the string "0,0,N" the factory creates a rover with the initial position (0,0) and the initial
direction North.

## State pattern

The Rover uses the direction as state: each direction is a state that implements the `RoverStatus`
interface and implements following methods:

- `moveForward()`
- `moveBackward()`
- `turnLeft()`
- `turnRight()`

This approach allows us to implement the movement of the rover in a very clean way where each class
has a very delimited responsibility/domain.

## Command pattern

We apply the command pattern to encapsulate the commands that the rover can execute. Each command
has a specific implementation that implements the `RoverCommand` interface and implements
the `execute()`
method.