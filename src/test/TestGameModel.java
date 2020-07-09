package test;

import model.Game;

public class TestGameModel {
  public static void main(String[] args) {
    Game game = new Game();
    System.out.println("Game: "+game);
    Game game02 = generateGameExample1();

    System.out.println(game02);
  }

  public static Game generateGameExample1() {
    return new Game(
              "Tetris",
              "One of the most famous old games of all time",
              "Puzzle",
              1,
              2013,
              true,
              true,
              12
      );
  }
}
