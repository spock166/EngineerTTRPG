package Data;

/**
 * The list of available clubs.
 */
public enum ClubName {
    None("None"),
    AlternativeFuelsLab("Alternative Fuels Lab"),
    UndergraduateResearch("Undergraduate Research"),
    EnvironmentalSociety("Environmental Society"),
    PeerTutoringClub("Peer Tutoring Club"),
    ConcreteConoeTeam("Concrete Conoe Team"),
    RoboticsTeam("Robotics Team"),
    SchoolNewsletter("School Newsletter"),
    BlockchainSociety("Blockchain Society"),
    SolarCarClub("Solar Car Club"),
    EsportsTeam("Esports Team"),
    HackathonTeam("Hackathon Team"),
    FlightClub("Flight Club"),
    EngineeringStudentCouncil("Engineering Student Council"),
    AstronomyClub("Astronomy Club"),
    MathCompetitionTeam("Math Competition Team");

    public final String name;

    ClubName(String name){
        this.name = name;
    }
}
