package mypackages;
import java.time.LocalDate;

public class Card {


    Getters CG = new Getters();
    
    private LocalDate expiDate(LocalDate firstDate){

        LocalDate finalDate = (firstDate.plusYears(10)).minusDays(1);
        return finalDate;
    }

    public ID_Card(String N, String F, String bP, String S, String J, int H, LocalDate bD, LocalDate dD){

        LocalDate expirationDate = expiDate(dD);

        System.out.println("\n\n\n\n\n");
        System.out.println("    _______________");
        System.out.println("   |  Par          |  Nom:       " + N.toUpperCase());
        System.out.println("   |   Ici         |  Prenom:    " + F);
        System.out.println("   |    On         |  Ne(e) le:  " + CG.toNormalDateString(bD) + " a " + bP.toUpperCase());
        System.out.println("   |     Mets      |  Sexe: " + S + " \t\t\tTaille: " + H + " cm");
        System.out.println("   |      La       |  Profession:  \t" + J.toUpperCase());
        System.out.println("   |       Tronche |  Delivre le:  \t" + CG.toNormalDateString(dD));
        System.out.println("   |_______________|  Expire le:   \t" + CG.toNormalDateString(expirationDate));
        System.out.println("\n\n\t\t\t\t\t\t[**" + this + "**]");
    }
}
