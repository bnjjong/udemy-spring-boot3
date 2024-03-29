package io.df.henry.udemyspringboot3.chapter2.game;

import lombok.ToString;

@ToString
public class SuperContraGame implements GameConsole {

  @Override
  public void up() {
    System.out.println("Up");
  }

  @Override
  public void down() {
    System.out.println("Sit down");
  }

  @Override
  public void left() {
    System.out.println("Go back");
  }

  @Override
  public void right() {
    System.out.println("Shoot bullet");
  }


}
