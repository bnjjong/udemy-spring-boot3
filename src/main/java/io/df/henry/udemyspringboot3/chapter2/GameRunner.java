package io.df.henry.udemyspringboot3.chapter2;

import io.df.henry.udemyspringboot3.chapter2.game.GameConsole;
import io.df.henry.udemyspringboot3.chapter2.game.MarioGame;

public class GameRunner {

  private final GameConsole game;

  public GameRunner(GameConsole game) {
    this.game = game;
  }

  public void run() {
    System.out.println("Running game : " + game);
    game.up();
    game.down();
    game.left();
    game.right();
  }
}
