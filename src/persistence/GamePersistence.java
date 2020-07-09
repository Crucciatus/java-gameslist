package persistence;

import model.Game;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class GamePersistence {

  public static final String SEPARATOR = "|";
  private List<Game> games;

  public GamePersistence() {
    this.games = new ArrayList<Game>();
  }

  /**
   * adds the game to be saved to the list
   * @param game
   */
  public void add(Game game) {
    this.games.add(game);
  }

  /**
   * remove the reported game from the game list
   * @param game - game to be removed
   * @return - inform if the game as been removed from the game list
   */
  public boolean remove(Game game) {
    boolean exist = this.games.contains(game);

    if(exist) {
      this.games.remove(game);
    }

    return exist;
  }

  /**
   * Remove a game in the list by your index
   * @param index - index to be removed
   * @return inform if the game as been removed from the game list
   */
  public boolean remove(int index) {
    if(index >=0 && index < this.games.size()) {
      Game game = this.games.get(index);

      return this.remove(game);
    }

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
  public void recordArchive() throws IOException {
    FileWriter archive = new FileWriter("games.txt");
    PrintWriter recordArchive = new PrintWriter(archive);

    for (Game game : this.games) {
      String line = separateLineText(game);

      recordArchive.println(line);
    }

    archive.close();
  }

  /**
   *
   * receives a game object and generates a line
   * with the data to be recorded in a text file
   * @param game
   * @return
   */
  private String separateLineText(Game game) {
    return game.getName() + SEPARATOR +
    game.getDescription() + SEPARATOR +
    game.getGenre() + SEPARATOR +
    game.getInstallerSize() + SEPARATOR +
    game.getReleaseYear() + SEPARATOR +
    game.isMultiplayer() + SEPARATOR +
    game.isOnline() + SEPARATOR +
    game.getMinimumAge();
  }

  /**
   * get list of games read
   * @return
   */
  public List<Game> getGames() {
    return this.games;
  }
}
