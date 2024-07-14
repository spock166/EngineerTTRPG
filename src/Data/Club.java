package Data;

import java.util.Hashtable;

/**
 * The club class for Engineering TTRPG.
 */
public class Club {
    private final ClubName name;
    private final Hashtable<FundamentalName,Integer> fundamentalBonuses;

    /**
     * The constructor for a club.
     * @param name The name of the club.
     */
    public Club(ClubName name) {
        this.name = name;
        this.fundamentalBonuses = getBonusesFor(name);
    }

    /**
     * Retrieve the bonuses associated with a given club.
     * @param name The name of the club.
     * @return The bonuses associated with the given club.
     */
    private Hashtable<FundamentalName, Integer> getBonusesFor(ClubName name) {
        Hashtable<FundamentalName, Integer> bonuses = new Hashtable<>();

        switch(name){
            case None -> {
                return  bonuses;
            }
            case AlternativeFuelsLab -> {
                bonuses.put(FundamentalName.Chemistry,1);
                bonuses.put(FundamentalName.Circuits,1);
            }
            case UndergraduateResearch -> {
                bonuses.put(FundamentalName.Chemistry,1);
                bonuses.put(FundamentalName.Coding,1);
            }
            case EnvironmentalSociety -> {
                bonuses.put(FundamentalName.Chemistry,1);
                bonuses.put(FundamentalName.Communication,1);
            }
            case PeerTutoringClub -> {
                bonuses.put(FundamentalName.Chemistry,1);
                bonuses.put(FundamentalName.Math,1);
            }
            case ConcreteConoeTeam -> {
                bonuses.put(FundamentalName.Chemistry,1);
                bonuses.put(FundamentalName.Physics,1);
            }
            case RoboticsTeam -> {
                bonuses.put(FundamentalName.Circuits,1);
                bonuses.put(FundamentalName.Coding,1);
            }
            case SchoolNewsletter -> {
                bonuses.put(FundamentalName.Circuits,1);
                bonuses.put(FundamentalName.Communication,1);
            }
            case BlockchainSociety -> {
                bonuses.put(FundamentalName.Circuits,1);
                bonuses.put(FundamentalName.Math,1);
            }
            case SolarCarClub -> {
                bonuses.put(FundamentalName.Circuits,1);
                bonuses.put(FundamentalName.Physics,1);
            }
            case EsportsTeam -> {
                bonuses.put(FundamentalName.Coding,1);
                bonuses.put(FundamentalName.Communication,1);
            }
            case HackathonTeam -> {
                bonuses.put(FundamentalName.Coding,1);
                bonuses.put(FundamentalName.Math,1);
            }
            case FlightClub -> {
                bonuses.put(FundamentalName.Coding,1);
                bonuses.put(FundamentalName.Physics,1);
            }
            case EngineeringStudentCouncil -> {
                bonuses.put(FundamentalName.Communication,1);
                bonuses.put(FundamentalName.Math,1);
            }
            case AstronomyClub -> {
                bonuses.put(FundamentalName.Communication,1);
                bonuses.put(FundamentalName.Physics,1);
            }
            case MathCompetitionTeam -> {
                bonuses.put(FundamentalName.Math,1);
                bonuses.put(FundamentalName.Physics,1);
            }
        }
        return bonuses;
    }

    @Override
    public String toString() {
        return name.name;
    }

    /**
     * Access a club's bonus associated with the given Fundamental.
     * @param name The name of the Fundamental.
     * @return The value of the bonus for the club to the Fundamental.
     */
    public int getFundamentalBonusOf(FundamentalName name) {
        if (fundamentalBonuses.containsKey(name)) {
            return fundamentalBonuses.get(name);
        }
        return 0;
    }
}
