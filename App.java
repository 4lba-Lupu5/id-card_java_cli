import mypackages.Setters;
import mypackages.Card;
import java.time.LocalDate;


public class App {
    public static void main(String[] args) {
                
        Setters CS = new Setters();
        String name = CS.setString("le nom de famille");
        String forename = CS.setString("le(s) prenom(s)");
        String birthPlace = CS.setString("le lieu de naissance");
        String sex = CS.setString("le sexe (F ou M)");
        String job = CS.setString("la profession");
        int height = CS.setInt("la taille en cm");
        LocalDate birthDate = CS.setDate("de naissance");
        LocalDate deliveryDate = CS.setDate("de remise de la CNIB");

        Card C = new Card(name, forename, birthPlace, sex, job, height, birthDate, deliveryDate);
    }
}
