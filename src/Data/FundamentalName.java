package Data;

/**
 * The names of the various Fundamentals.
 */
public enum FundamentalName {
    Chemistry("Chemistry"),
    Circuits("Circuits"),
    Coding("Coding"),
    Communication("Communication"),
    Math("Math"),
    Physics("Physics");

    public final String name;

    FundamentalName(String name){
        this.name = name;
    }
}
