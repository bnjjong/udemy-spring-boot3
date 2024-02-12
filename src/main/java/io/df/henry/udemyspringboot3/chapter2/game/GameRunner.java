package io.df.henry.udemyspringboot3.chapter2.game;

import io.df.henry.udemyspringboot3.chapter2.game.GameConsole;
import io.df.henry.udemyspringboot3.chapter2.game.MarioGame;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {

  private final GameConsole game;

  public GameRunner(@Qualifier("MarioGameQualifier")GameConsole game) {
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
