package model;

public class Game {

  /**
   * defines the game name
   * */
  private String name;

  /**
   * game description (synopsis)
   * */
  private String description;

  /**
   * defines the game genre
   * GENRE: FPS, RPG, MMORPG ETC
   * */
  private String genre;

  /**
   * defines game size in GB
   * */
  private Long installerSize;

  /**
   * game release year
   * */
  private Integer releaseYear;

  /**
   * defines if the game is multiplayer or not
   * */
  private boolean multiplayer;

  /**
   * defines if the game is online or not
   * */
  private boolean online;

  /**
   * defines the game minimum age
   * */
  private Integer minimumAge;
}
