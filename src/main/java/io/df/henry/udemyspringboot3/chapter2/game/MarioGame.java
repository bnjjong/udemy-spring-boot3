package io.df.henry.udemyspringboot3.chapter2.game;

import lombok.ToString;

@ToString
public class MarioGame implements GameConsole{

  @Override
  public void up() {
    System.out.println("Jump");
  }

  @Override
  public void down() {
    System.out.println("Go into a hole");
  }

  @Override
  public void left() {
    System.out.println("Go back");
  }

  @Override
  public void right() {
    System.out.println("Accelerate");
  }


}
