
public abstract class Player{
    private String name;
    private int score;
    private int coins;
    private int hand[];
    private int currBid; // Needa figure out if this is how to bid.

    /**
    * Constructs a player.
    * @param name Name of player.
    */
    public Player(String name, int numPlayers){
        this.score = 0;
        this.hand = new int[11-numPlayers];
        this.name = name;
        if(numPlayers < 5){
            this.coins = 18;
        }
        else{
            this.coins = 14;
        }
        this.currBid = 0;
    }

    /** 
    * Returns the current bid of the player. 
    * This is called in the games Phase 1.
    * @param properties Array of all of the properties being bid on. 
    */
    public abstract int bid(int[] properties);

    /** 
    * Returns the property chosen to bid for the checks. 
    * This is called in the games Phase 2. 
    * @param checks Array of all of the checks being bid on.
    */
    public abstract int chooseProperty(int[] checks);


}