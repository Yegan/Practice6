package soccer;
import utility.GameUtils;

public class Game{
    public Team homeTeam;
    public Team awayTeam;
    public Goal[] goals;

    public void playGame(){
        // Determine how many goals will be scored
        int numberOfGoals = (int)(Math.random()*7); 

        // Create a place to store the goals that will be scored
        Goal[] theGoals = new Goal[numberOfGoals];
        
        // Assign the place where the goals will be to the game
        this.goals = theGoals;

        GameUtils.addGameGoals(this);
    }
}