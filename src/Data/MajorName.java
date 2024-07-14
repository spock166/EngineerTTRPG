package Data;

/**
 * The names of the various majors.
 */
public enum MajorName {
    Undecided("Undecided"),
    ChemicalEngineering("Chemical Engineering"),
    CivilEngineering("Civil Engineering"),
    ElectricalEngineering("Electrical Engineering"),
    MechanicalEngineering("Mechanical Engineering"),
    IndustryEngineering("Industry Engineering"),
    SoftwareEngineering("Software Engineering");

    public final String name;

    MajorName(String name){
        this.name = name;
    }
}
