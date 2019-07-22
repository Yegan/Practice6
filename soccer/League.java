package soccer;

public class League{

    public static void main(String[] args){
        Team[] theTeams = createTeams();
        Game[] theGames = createGames(theTeams);

       
        Player player1 = new Player();
        player1.playerName = "George Eliot";

        Player player2 = new Player();
        player2.playerName = "Graham Green";

        Player player3 = new Player();
        player3.playerName = "Geoffrey Chaucer";

        Player[] thePlayers = {player1, player2, player3};
        

        public static Team[] createTeams(){
        Team[] theTeams = {team1, team2};
        return theTeams;

        }

        public static Game[] createGames(Team[] theTeams){
            Game currGame = theGames[0];
            Game[] theGames = {theGame};
            return theGames;
        }
      

        Goal goal1 = new Goal();
        goal1.thePlayer = currGame.homeTeam.playerArray[2];
        goal1.theTeam = currGame.homeTeam;
        goal1.theTime = 55;

        Goal[] theGoals = {goal1};
        currGame.goals = theGoals;

        System.out.println("Goal scored after "+ currGame.goals[0].theTime + " mins by "+ currGame.goals[0].thePlayer.playerName + " of "+ currGame.goals[0].theTeam.teamName);
        

    }

    
}