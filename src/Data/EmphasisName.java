package Data;

public enum EmphasisName {
    None("None"),
    Biomedical("Biomedical"),
    Environmental("Environmental"),
    Materials("Materials Science"),
    Nuclear("Nuclear"),
    Petroleum("Petroleum"),
    Architectural("Architectural"),
    Structural("Structural"),
    Computer("Computer"),
    Robotics("Robotics"),
    Aerospace("Aerospace"),
    Agricultural("Agricultural"),
    Systems("Systems"),
    DataScience("DataScience"),
    Cybersecurity("Cybersecurity");

    public final String name;

    EmphasisName(String name){
        this.name = name;
    }
}
