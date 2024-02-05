package io.df.henry.udemyspringboot3.chapter2;

import io.df.henry.udemyspringboot3.chapter2.game.MarioGame;
import io.df.henry.udemyspringboot3.chapter2.game.PacmanGame;

public class AppBasicGame {
  public static void main(String[] args){
//    var game = new MarioGame();
    PacmanGame game = new PacmanGame();
    GameRunner runner = new GameRunner(game);
    runner.run();
  }
}
