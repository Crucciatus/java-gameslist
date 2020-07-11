package persistence;

import model.Game;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class GamePersistence {

  public static final String SEPARATOR = "#!#";
  private String archiveName;
  private List<Game> games;

  public GamePersistence(String archiveName) {
    this.archiveName = archiveName;
    this.clearList();
  }

  public GamePersistence() {
    this.archiveName = "games.txt";
    this.clearList();
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

    if (exist) {
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
    if (index >=0 && index < this.games.size()) {
      Game game = this.games.get(index);

      return this.remove(game);
    }

    return false;
  }

  /**
   * clear the games list
   */
  private void clearList() {
    this.games = new ArrayList<Game>();
  }

  /**
   * reads the file from disk
   */
  public void readArchive() throws IOException {
    this.clearList();
    List<String> lines = Files.readAllLines(Paths.get(this.archiveName));

    for (String line : lines) {
      //TODO remove debug
      System.out.println(line);

      Game game = createGameObjectFromLine(line);

      this.add(game);
    }
  }

  public Game createGameObjectFromLine(String line) {
    String [] array = line.split(SEPARATOR);
    Game game = new Game();

    game.setName(array[0]);
    game.setDescription(array[1]);
    game.setGenre(array[2]);
    game.setInstallerSize(Integer.valueOf(array[3]));
    game.setReleaseYear(Integer.valueOf(array[4]));
    game.setMultiplayer(Boolean.valueOf(array[5]));
    game.setOnline(Boolean.valueOf(array[6]));
    game.setMinimumAge(Integer.valueOf(array[7]));

    return game;
  }

  /**
   * record the games list on disk
   * overwriting the reported file if it exists
   */
  public void recordArchive() throws IOException {
    FileWriter archive = new FileWriter(this.archiveName);
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
    return getStringValue(game.getName())   + SEPARATOR +
    getStringValue(game.getDescription())   + SEPARATOR +
    getStringValue(game.getGenre())         + SEPARATOR +
    getStringValue(game.getInstallerSize()) + SEPARATOR +
    getStringValue(game.getReleaseYear())   + SEPARATOR +
    getStringValue(game.isMultiplayer())    + SEPARATOR +
    getStringValue(game.isOnline())         + SEPARATOR +
    getStringValue(game.getMinimumAge());
  }

  private String getStringValue(Object object) {
    if (object == null) {
      return "";
    }
    return object.toString();
  }

  /**
   * get list of games read
   * @return
   */
  public List<Game> getGames() {
    return this.games;
  }
}
