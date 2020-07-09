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

  @Override
  public String toString() {
    return "Game{" +
            "name='" + name + '\'' +
            ", description='" + description + '\'' +
            ", genre='" + genre + '\'' +
            ", installerSize=" + installerSize +
            ", releaseYear=" + releaseYear +
            ", multiplayer=" + multiplayer +
            ", online=" + online +
            ", minimumAge=" + minimumAge +
            '}';
  }

  public Game(String name, String description, String genre, Long installerSize, Integer releaseYear,
              boolean multiplayer, boolean online, Integer minimumAge) {
    this.name = name;
    this.description = description;
    this.genre = genre;
    this.installerSize = installerSize;
    this.releaseYear = releaseYear;
    this.multiplayer = multiplayer;
    this.online = online;
    this.minimumAge = minimumAge;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getGenre() {
    return genre;
  }

  public void setGenre(String genre) {
    this.genre = genre;
  }

  public Long getInstallerSize() {
    return installerSize;
  }

  public void setInstallerSize(Long installerSize) {
    this.installerSize = installerSize;
  }

  public Integer getReleaseYear() {
    return releaseYear;
  }

  public void setReleaseYear(Integer releaseYear) {
    this.releaseYear = releaseYear;
  }

  public boolean isMultiplayer() {
    return multiplayer;
  }

  public void setMultiplayer(boolean multiplayer) {
    this.multiplayer = multiplayer;
  }

  public boolean isOnline() {
    return online;
  }

  public void setOnline(boolean online) {
    this.online = online;
  }

  public Integer getMinimumAge() {
    return minimumAge;
  }

  public void setMinimumAge(Integer minimumAge) {
    this.minimumAge = minimumAge;
  }


}
