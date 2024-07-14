import CharacterCreation.CharacterCreator;
import Data.Engineer;

public class MainApp {
    public static void main(String[] args) {
        Engineer newEngineer = CharacterCreator.GenerateRandomEngineer();
        System.out.println(newEngineer);
    }
}
