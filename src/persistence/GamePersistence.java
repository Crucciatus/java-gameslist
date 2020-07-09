package persistence;

import model.Game;

import java.util.List;

public class GamePersistence {

  /**
   * adds the game to be saved to the list
   * @param game
   */
  public void add(Game game) {
    //TODO do the implementation
  }

  /**
   * remove the reported game from the game list
   * @param game - game to be removed
   * @return - inform if the game as been removed from the game list
   */
  public boolean remove(Game game) {
    //TODO do the implementation
    return false;
  }

  /**
   * reads the file from disk
   */
  public void readArchive() {

  }

  /**
   * record the games list on disk
   * overwriting the reported file if it exists
   */
  public void recordArchive() {

  }

  /**
   * get list of games read
   * @return
   */
  public List<Game> getGames() {
    return null;
  }
}
