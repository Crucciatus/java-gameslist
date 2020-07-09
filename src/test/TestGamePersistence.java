package test;

import model.Game;
import persistence.GamePersistence;

public class TestGamePersistence {
  public static void main(String[] args) {
    GamePersistence p = new GamePersistence();
    Game g1 = new Game();
    p.add(g1);
  }
}
