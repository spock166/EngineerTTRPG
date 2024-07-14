package Data;

/**
 * The character class for Engineering TTRPG.
 */
public class Engineer {
    private final String firstName;
    private final String lastName;
    private final Major major;
    private final Emphasis emphasis;
    private final Club club;
    private final FundamentalBlock stats;

    /**
     * Constructor for an engineer character.
     * @param firstName The engineer's first name.
     * @param lastName The engineer's last name.
     * @param major The engineer's major.
     * @param emphasis The engineer's emphasis.
     * @param club The engineer's club.
     */
    public Engineer (String firstName, String lastName, Major major, Emphasis emphasis, Club club) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.major = major;
        this.emphasis = emphasis;
        this.club = club;
        this.stats = new FundamentalBlock();
    }

    /**
     * Get the engineer's bonus to their Fundamentals
     * @param name The Fundamental's name.
     * @return The amount of the bonus.
     */
    public Integer getFundamentalBonusOf(FundamentalName name) {
        int total = 0;

        total += this.major.getFundamentalBonusOf(name);

        total += this.emphasis.getFundamentalBonusOf(name);

        total += this.club.getFundamentalBonusOf(name);

        return total;
    }

    /**
     * Get the value of the engineer's particular Fundamental.
     * @param name The name of the Fundamental.
     * @return The value of the given Fundamental (including bonuses).
     */
    public Integer getValueOf(FundamentalName name){
        return stats.getValueOf(name) + getFundamentalBonusOf(name);
    }

    @Override
    public String toString() {
        StringBuilder output = new StringBuilder("Name: " + firstName + " " + lastName + "\n");
        output.append("Major: ").append(major).append("\n");
        output.append("Emphasis: ").append(emphasis).append("\n");
        output.append("Club: ").append(club).append("\n");

        for (FundamentalName name : FundamentalName.values()) {
            output.append("Stat for ").append(name).append(": ").append(stats.getValueOf(name)).append("+").append(getFundamentalBonusOf(name)).append("\n");
        }

        return output.toString();
    }
}
