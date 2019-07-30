package soccer;
import utility.GameUtils;

public class Game{
    public Team homeTeam;
    public Team awayTeam;
    public Goal[] goals;

    public void playGame(int maxGoals){
        // Determine how many goals will be scored
        int numberOfGoals = (int)(Math.random()*(maxGoals + 1)); 

        // Create a place to store the goals that will be scored
        Goal[] theGoals = new Goal[numberOfGoals];
        
        // Assign the place where the goals will be to the game
        this.goals = theGoals;

        GameUtils.addGameGoals(this);
    }

    public void playGame(){
        playGame(6);
    }

    public String getDescription(){
         StringBuilder returnString = new StringBuilder();

         for(Goal currGoal: this.goals){
           returnString.append(currGoal.theTime + " mins by " + 
                               currGoal.thePlayer.getPlayerName() + 
                               " of "+ currGoal.theTeam.teamName +
                               "\n");
        
             
        }
        return returnString.toString();

    }
}