package Data;

import java.util.ArrayList;
import java.util.Hashtable;

/**
 * The major class for Engineering TTRPG.
 */
public class Major {
    private final MajorName name;
    private final Hashtable<FundamentalName,Integer> fundamentalBonuses;
    private final ArrayList<Emphasis> emphases;

    /**
     * Constructor for a major.
     * @param name The name of the major.
     */
    public Major(MajorName name) {
        this.name = name;
        this.fundamentalBonuses = getBonusesFor(name);
        this.emphases = Emphasis.getEmphasesFor(name);
    }

    /**
     * Retrieve the bonuses associated with a given emphasis.
     * @param name The name of the emphasis.
     * @return The bonuses associated with the given emphasis.
     */
    private Hashtable<FundamentalName, Integer> getBonusesFor(MajorName name) {
        Hashtable<FundamentalName, Integer> bonuses = new Hashtable<>();

        switch (name){
            case Undecided -> {
                return bonuses;
            }
            case ChemicalEngineering -> {
                bonuses.put(FundamentalName.Chemistry, 1);
            }
            case CivilEngineering -> {
                bonuses.put(FundamentalName.Communication,1);
            }
            case ElectricalEngineering -> {
                bonuses.put(FundamentalName.Circuits,1);
            }
            case MechanicalEngineering -> {
                bonuses.put(FundamentalName.Physics,1);
            }
            case IndustryEngineering -> {
                bonuses.put(FundamentalName.Math,1);
            }
            case SoftwareEngineering -> {
                bonuses.put(FundamentalName.Coding,1);
            }
        }

        return bonuses;
    }

    @Override
    public String toString() {
        return name.name;
    }

    /**
     * Access a major's bonus associated with the given Fundamental.
     * @param name The name of the Fundamental.
     * @return The value of the bonus for the major to the Fundamental.
     */
    public int getFundamentalBonusOf(FundamentalName name) {
        if (fundamentalBonuses.containsKey(name)) {
            return fundamentalBonuses.get(name);
        }
        return 0;
    }
}
