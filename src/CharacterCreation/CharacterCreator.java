package CharacterCreation;

import Data.*;

public class CharacterCreator {
    public static Engineer GenerateRandomEngineer(){
        Major major = new Major(MajorName.CivilEngineering);
        Emphasis emphasis = new Emphasis(EmphasisName.Architectural);
        Club club = new Club(ClubName.FlightClub);
        return new Engineer("Persephone", "Nakayama",major,emphasis,club);
    }
}
