public class Band {
  String genre;
  String bestSong;
  int numOfMembers;
  boolean isGood;

  public Band(String musicGenre, String hit, int members, boolean goodOrBad){
    System.out.println("Constructor hit...");
    genre = musicGenre;
    bestSong = hit;
    numOfMembers = members;
    isGood = goodOrBad;
  }

  public static void main(String[] args){
    System.out.println("main method hitting...");
    Band beatles = new Band("Rock-and-Roll", "All of them", 4, true);
    Band redHotChiliPeppers = new Band("Rock-and-Roll", "Under The Bridge", 4, true);
    Band blackKeys = new Band("Blues", "Tighten-up", 2, true);
    Band countBassie = new Band("Swing", "A Night In Tunisia", 17, true);

    boolean isSameGenre = redHotChiliPeppers.genre == beatles.genre;
    System.out.println("It's " + isSameGenre + " that the Beatles and Red Hot Chili Peppers play the same genre of music.");
    System.out.println("The Black Keys play " + blackKeys.genre + " and Count Bassie plays " + countBassie.genre + ".");
  }
}