package it.intre.rover.command;

public enum CommandEnum {

  Forward('f'),
  Backward('b'),
  TurnLeft('l'),
  TurnRight('r');

  public final char key;

  CommandEnum(char key) {
    this.key = key;

  }

  public static CommandEnum valueByKey(char key) {
    for (CommandEnum d : values()) {
      if (d.key == key) {
        return d;
      }
    }
    return null;
  }

}
