package Data;

import java.util.ArrayList;
import java.util.Hashtable;

/**
 * The emphasis class for Engineering TTRPG.
 */
public class Emphasis {
    private final EmphasisName name;
    private final Hashtable<FundamentalName,Integer> fundamentalBonuses;

    /**
     * The constructor for an emphesis.
     * @param name The name of the emphesis.
     */
    public Emphasis(EmphasisName name) {
        this.name = name;
        this.fundamentalBonuses = getBonusesFor(name);
    }

    /**
     * Retrieve the bonuses associated with a given emphasis.
     * @param name The name of the emphasis.
     * @return The bonuses associated with the given emphasis.
     */
    private Hashtable<FundamentalName, Integer> getBonusesFor(EmphasisName name) {
        Hashtable<FundamentalName,Integer> bonuses = new Hashtable<>();

        switch(name) {
            case None -> {
                return bonuses;
            }
            case Biomedical -> {
                return bonuses;
            }
            case Environmental -> {
                return bonuses;
            }
            case Materials -> {
                return bonuses;
            }
            case Nuclear -> {
                return bonuses;
            }
            case Petroleum -> {
                return bonuses;
            }
            case Architectural -> {
                return bonuses;
            }
            case Structural -> {
                return bonuses;
            }
            case Computer -> {
                return bonuses;
            }
            case Robotics -> {
                return bonuses;
            }
            case Aerospace -> {
                return bonuses;
            }
            case Agricultural -> {
                return bonuses;
            }
            case Systems -> {
                return bonuses;
            }
        }

        return bonuses;
    }

    /**
     * Get the list of emphases associated with a given major.
     * @param major The major whose emphases are desired.
     * @return The list of emphases.
     */
    public static ArrayList<Emphasis> getEmphasesFor(MajorName major){
        ArrayList<Emphasis> emphases = new ArrayList<>();

        switch (major) {
            case Undecided -> {
            }
            case ChemicalEngineering -> {
                emphases.add(new Emphasis(EmphasisName.Biomedical));
                emphases.add(new Emphasis(EmphasisName.Environmental));
                emphases.add(new Emphasis(EmphasisName.Materials));
                emphases.add(new Emphasis(EmphasisName.Nuclear));
                emphases.add(new Emphasis(EmphasisName.Petroleum));
            }
            case CivilEngineering -> {
                emphases.add(new Emphasis(EmphasisName.Architectural));
                emphases.add(new Emphasis(EmphasisName.Environmental));
                emphases.add(new Emphasis(EmphasisName.Structural));
            }
            case ElectricalEngineering -> {
                emphases.add(new Emphasis(EmphasisName.Biomedical));
                emphases.add(new Emphasis(EmphasisName.Computer));
                emphases.add(new Emphasis(EmphasisName.Robotics));
            }
            case MechanicalEngineering -> {
                emphases.add(new Emphasis(EmphasisName.Aerospace));
                emphases.add(new Emphasis(EmphasisName.Biomedical));
                emphases.add(new Emphasis(EmphasisName.Nuclear));
            }
            case IndustryEngineering -> {
                emphases.add(new Emphasis(EmphasisName.Agricultural));
                emphases.add(new Emphasis(EmphasisName.Nuclear));
                emphases.add(new Emphasis(EmphasisName.Systems));
            }
            case SoftwareEngineering -> {
                emphases.add(new Emphasis(EmphasisName.Cybersecurity));
                emphases.add(new Emphasis(EmphasisName.DataScience));
                emphases.add(new Emphasis(EmphasisName.Robotics));
            }
        }

        return emphases;
    }

    @Override
    public String toString() {
        return name.name;
    }

    /**
     * Access an emphasis' bonus associated with the given Fundamental.
     * @param name The name of the Fundamental.
     * @return The value of the bonus for the emphasis to the Fundamental.
     */
    public int getFundamentalBonusOf(FundamentalName name) {
        if (fundamentalBonuses.containsKey(name)) {
            return fundamentalBonuses.get(name);
        }
        return 0;
    }
}
