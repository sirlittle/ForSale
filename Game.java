import java.util.Random;

public class Game{
    public static final int NUM_PLAYERS = 5;
    public static final int NUM_CARDS = 30;

    public static void main(String[] args){

      // Creates the players to be used for the game
      Player players[] = new Player[NUM_PLAYERS];
      for(int i = 0; i < NUM_PLAYERS; i += 1){
          players[i] = new RandomPlayer("BOB", NUM_PLAYERS);
      }
      
      // Creates and shuffles all properties
      int allProperties[] = new int[NUM_CARDS];
      for(int i = 0; i<NUM_CARDS; i+=1){
        allProperties[i] = i;
      }
      shuffle(allProperties);
      shuffle(allProperties);
      shuffle(allProperties);

      // Creates all checks
      int allChecks[] = new int[NUM_CARDS];
      for(int i = 0; i<NUM_CARDS; i+=1){
        if(i <= 1){
          allChecks[i] = (int) i/2;
        }
        else{
          allChecks[i] = (int) i/2 + 1;
        }
      }
      shuffle(allChecks);
      shuffle(allChecks);
      shuffle(allChecks);

      // Sets approrpriate number of cards to be used throughout game
      int cards = 30;
      if(NUM_PLAYERS == 3){
        cards = 24;
      }
      else if(NUM_PLAYERS == 4){
        cards = 28;
      }

      // Creates usable deck of properties for num Players by 
      // getting the numbers from the allProperties.
      int properties[] = new int[cards];
      for(int i = 0; i<cards; i+=1){
        properties[i] = allProperties[i];
      }

      // Same as above but for checks. 
      int checks[] = new int[num_cards];
      for(int i = 0; i<num_cards; i+=1){
        checks[i] = allChecks[i];
      }

      // Here actual game play code should go.

    }

    /**
    * Shuffles an array by randomly swapping elements.
    * Copied from stack overflow: 
    * http://stackoverflow.com/questions/1519736/random-shuffling-of-an-array
    */ 
    static void shuffle(int[] ar)
    {
        Random rnd = new Random();
        for (int i = ar.length - 1; i > 0; i--)
        {
          int index = rnd.nextInt(i + 1);
          int a = ar[index];
          ar[index] = ar[i];
          ar[i] = a;
        }
    }

}