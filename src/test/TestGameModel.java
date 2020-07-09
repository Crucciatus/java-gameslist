package test;

import model.Game;

public class TestGameModel {
  public static void main(String[] args) {
    Game game = new Game();
    System.out.println("Game: "+game);
    Game game02 = new Game(
            "Tetris",
            "retro",
            "Puzzle",
            1,
            2013,
            true,
            true,
            12
    );
  }
}
