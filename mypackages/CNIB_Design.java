package mypackages;
public class CNIB_Design {
    private String nom;
    private String prenom;
    private String lieuNaiss;
    private String sexe;
    private String profession;
    private int taille;
    private int jourNaiss;
    private int moisNaiss;
    private int anneeNaiss;
    private int jourDel;
    private int moisDel;
    private int anneeDel;
    private int jourExp;
    private int moisExp;
    private int anneeExp;
    private String dateNaiss;
    private String dateDel;
    private String dateExp;
    


    public CNIB_Design(String name, String surname, String place, 
    String sex, String job, int heigth, 
    int ein, int swei, int drei, 
    int one, int two, int three){

        this.nom = name;
        this.prenom = surname;
        this.lieuNaiss = place;
        this.sexe = sex;
        this.profession = job;
        this.taille = heigth;
        this.jourNaiss = ein;
        this.moisNaiss = swei;
        this.anneeNaiss = drei;
        this.jourDel = one;
        this.moisDel = two;
        this.anneeDel = three;
        if (two <= 0) {
            System.out.println("Merci d'entrer un numero de mois superieur a 0");
            return;
        }
        if (two > 12) {
            System.out.println("Merci d'entrer un numero de mois inferieur ou egal a 12");
            return;
        }
        else{
            if (one == 1) {             //Determiner si l'expiration est pour le 28, 30, ou 31.
                if (two == 1) {         //Delivrance 1er janvier
                    this.jourExp = 31;
                    this.moisExp = 12;
                    this.anneeExp = (three + 9);
                }
                if (two == 3) {        //Delivrance le 1er Mars
                    this.jourExp = 28;
                    this.moisExp = 2;
                    this.anneeExp = (three +10);
                }
                if (two == 2 || two == 4 || two == 6 || two == 8 || two == 9 || two == 11) {       //Delivrance le 1er d'un mois precedant un autre de 31 jours
                    this.jourExp = 31;
                    this.moisExp = (two-1);
                    this.anneeExp = (three + 10);
                }
                if(two == 5 || two == 7 || two == 10 || two ==12) {                                 //Si le mois precedent a 30 jours
                    this.jourExp = 30;
                    this.moisExp = (two-1);
                    this.anneeExp = (three + 10);
                }
            }
            else{
                if (two == 2) {
                    if (one < 1 || one > 28) {
                        System.out.println("Date invalide!");
                        return;
                    }
                    else{
                        this.jourExp = (one - 1);
                        this.moisExp = two;
                        this.anneeExp = (three + 10);
                    }
                }
                if (two == 4 || two == 6 || two == 9 || two == 11) {
                    if (one < 1 || one > 30) {
                        System.out.println("Date invalide!");
                        return;
                    }
                    else{
                        this.jourExp = (one - 1);
                        this.moisExp = two;
                        this.anneeExp = (three + 10);
                    }
                }
                if (two == 1 || two == 2 || two == 5 || two == 7 || two == 8 || two == 10 || two == 12) {
                    if (one < 1 || one > 31) {
                        System.out.println("Date invalide!");
                        return;
                        
                    }
                    else{
                        this.jourExp = (one - 1);
                        this.moisExp = two;
                        this.anneeExp = (three + 10);
                    }
                }
                
            }
        }
        this.dateNaiss = (this.jourNaiss + "/" + this.moisNaiss + "/" + this.anneeNaiss);
        this.dateDel = (this.jourDel + "/" + this.moisDel+ "/" + this.anneeDel);
        this.dateExp = (this.jourExp + "/" + this.moisExp + "/" + this.anneeExp);
        
        System.out.println("\n\n\n\n\n");
        System.out.println(" ___________________________________________________________________________");
        System.out.println("|<><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><|");
        System.out.println("|><><--------------><><><><><><><><><><><><><><><><><><><><><><><><><><><><>|");
        System.out.println("|<><|  Par          |**Nom:       " + this.nom.toUpperCase());
        System.out.println("|><>|   Ici         |**Prenom:    " + this.prenom);
        System.out.println("|<><|    On         |**Ne(e) le:  " + this.dateNaiss + " a " + this.lieuNaiss.toUpperCase());
        System.out.println("|><>|     Mets      |**Sexe: " + this.sexe + " \t\t\tTaille: " + this.taille + " cm");
        System.out.println("|<><|      La       |**Profession:  \t" + this.profession.toUpperCase());
        System.out.println("|><>|       Tronche |**Delivre le:  \t" + this.dateDel);
        System.out.println("|<><|_______________|**Expire le:   \t" + this.dateExp);
        System.out.println("|}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{}{_______________________________");
        System.out.println("|[][][][][][][][][][][][][][][][][][][][**" + this + "**]|");
        System.out.println("|___________________________________________________________________________|");
    }
}
