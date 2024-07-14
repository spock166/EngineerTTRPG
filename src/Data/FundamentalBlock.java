package Data;

import java.util.Hashtable;
import java.util.Random;

/**
 * The stat block for an engineer in engineering TTRPG.
 */
public class FundamentalBlock {
    private final Hashtable<FundamentalName, Integer> stats;

    /**
     * Default constructor.  Rolls for stats.
     */
    public FundamentalBlock(){
        this(true);
    }

    /**
     * Constructor for a new Fundamental block.
     * @param rollForStats Should stats be rolled or set to 0?
     */
    public FundamentalBlock(boolean rollForStats) {
        Random rand = new Random();
        stats = new Hashtable<FundamentalName, Integer>();
        for (FundamentalName name : FundamentalName.values()) {
            if(rollForStats) {
                stats.put(name, rand.nextInt(4)+1);
            }else {
                stats.put(name, 0);
            }
        }
    }

    /**
     * Get the value from the Fundamental block for the particular fundamental
     * @param name The name of the Fundamental.
     * @return The value of the Fundamental for this Fundamental block.
     */
    public Integer getValueOf(FundamentalName name){
        return stats.get(name);
    }
}
