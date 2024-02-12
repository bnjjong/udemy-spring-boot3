package io.df.henry.udemyspringboot3.chapter2;

import io.df.henry.udemyspringboot3.chapter2.game.GameConsole;
import io.df.henry.udemyspringboot3.chapter2.game.GameRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("io.df.henry.udemyspringboot3.chapter2.game")
public class GamingLauncherApplication {

  // GameRunner 에 Component를 선언하면 필요 없음.
//  @Bean
//  public GameRunner gameRunner(GameConsole game) { // 여기서 autowire 된다.
//    GameRunner runner = new GameRunner(game);
//    return runner;
//  }
  public static void main(String[] args){
    // 1. Launch a spring context
    try(var context = new AnnotationConfigApplicationContext(
        GamingLauncherApplication.class)){
      context.getBean(GameConsole.class).up();

      context.getBean(GameRunner.class).run();
    }

  }
}
