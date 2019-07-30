package soccer;
import utility.GameUtils;

public class League{
    
    public static void main(String[] args){
        League theLeague = new League();
        Team[] theTeams = theLeague.createTeams();
        Game[] theGames = theLeague.createGames(theTeams);
        Game currGame = theGames[0];
        currGame.playGame();
        System.out.println(currGame.getDescription());
           }
    
        public Team[] createTeams(){
            Team team1 = new Team();
            team1.teamName = "The Greens";

            Player player1 = new Player();
            player1.playerName = "George Eliot";
            Player player2 = new Player();
            player2.playerName ="Graham Green";
            Player player3 = new Player();
            player3.playerName ="Geoffrey Chaucer";
            
            team1.playerArray = new Player[3];
            team1.playerArray[0] = player1;
            team1.playerArray[1] = player2;
            team1.playerArray[2] = player3;

            Team team2 = new Team();
            team2.teamName = "The Reds";

            Player player4 = new Player();
            player4.playerName = "Robert Service";
            Player player5 = new Player();
            player5.playerName = "Robbie Burns";
            Player player6 = new Player();
            player6.playerName = "Rafael Sabatini";
            
             team2.playerArray = new Player[3];
             team2.playerArray[0] =player4;
             team2.playerArray[1] =player5;
             team2.playerArray[2] =player6;
            
            Team[] theTeams = {team1, team2};
            return theTeams;
        }   

        
            
          public Game[] createGames(Team[] theTeams){
              Game theGame = new Game();
              theGame.homeTeam = theTeams[0];
              theGame.awayTeam = theTeams[1];
              Game[] theGames = {theGame};
              return theGames;
        }

}