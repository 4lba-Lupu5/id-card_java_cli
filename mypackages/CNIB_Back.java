package mypackages;

import java.util.Scanner;
import java.util.InputMismatchException;



public class CNIB_Back {


public String setName() {
    Scanner leScanner = new Scanner(System.in);
    String leNom = "";
    try {
            System.out.print("Veuillez entrer le nom de famille:            ");
            leNom = leScanner.nextLine();
        }
    catch (InputMismatchException e) {
            setName();
        }
        leScanner.close();
    return leNom;
    }
public String setSurname() {
    Scanner leScanner = new Scanner(System.in);
    String lesPrenoms = "";
    try {
            System.out.print("Veuillez entrer le(s) prenom(s):              ");
            lesPrenoms = leScanner.nextLine();
        }
    catch (InputMismatchException e) {
            setSurname();
        }        

        leScanner.close();
    return lesPrenoms;
    }

public String setBirthPlace() {
    Scanner leScanner = new Scanner(System.in);
    String lieuNaissance = "";
    try {
            System.out.print("Veuillez entrer le lieu de naissance:         ");
            lieuNaissance = leScanner.nextLine();
        }
    catch (InputMismatchException e) {
            setBirthPlace();
        }
        leScanner.close();
    return lieuNaissance;
    }

public String setSex() {
    Scanner leScanner = new Scanner(System.in);
    String leSexe = "";
    try {
            System.out.print("Veuillez entrer le sexe:                      ");
            leSexe = leScanner.nextLine();
        }
    catch (InputMismatchException e) {
            setSex();
        }
        leScanner.close();
    return leSexe;
    }

public String setJob() {
    Scanner leScanner = new Scanner(System.in);
    String leTravail = "";
    try {
            System.out.print("Veuillez entrer la profession:                ");
            leTravail = leScanner.nextLine();
        }
    catch (InputMismatchException e) {
            setJob();
        }
        leScanner.close();
    return leTravail;
    }

public int setHeigth() {
    Scanner leScanner = new Scanner(System.in);
    int laTaille = 0;
    try {
            System.out.print("Veuillez entrer la taille en centimetres:     ");
            laTaille = leScanner.nextInt();
        }
    catch (InputMismatchException e) {
            setHeigth();
        }
    if (laTaille < 1) {
        System.out.println("Taille invalide!!!! Entrez un nombre positif....");
        setHeigth();
        }
        leScanner.close();
    return laTaille;
    }

public int setBirthDay() {
    Scanner leScanner = new Scanner(System.in);
    int jNaiss = 0;
    try {
            System.out.print("Veuillez entrer le jour de naissance:         ");
            jNaiss = leScanner.nextInt();
        }
    catch (InputMismatchException e) {
            setBirthDay();
        }
        leScanner.close();
    return jNaiss;
    }


public int setBirthMonth() {
    Scanner leScanner = new Scanner(System.in);
    int mNaiss = 0;
    try {
            System.out.print("Veuillez entrer le mois de naissance:         ");
            mNaiss = leScanner.nextInt();
        }
    catch (InputMismatchException e) {
            setBirthMonth();
        }

    leScanner.close();
    return mNaiss;
    }


public int setBirthYear() {
    Scanner leScanner = new Scanner(System.in);
    int aNaiss = 0;
    try {
            System.out.print("Veuillez entrer l'annee de naissance:         ");
            aNaiss = leScanner.nextInt();
        }
    catch (InputMismatchException e) {
            setBirthYear();
        }

    leScanner.close();
    return aNaiss;
    }

public int setGiveDay() {
    Scanner leScanner = new Scanner(System.in);
    int jDel = 0;
    try {
            System.out.print("Veuillez entrer le jour actuel:               ");
            jDel = leScanner.nextInt();
    }
    catch (InputMismatchException e) {
            setGiveDay();
        }
    
    leScanner.close();
    return jDel;
    }
public int setGiveMonth() {
    Scanner leScanner = new Scanner(System.in);
    int mDel = 0;
    try {
            System.out.print("Veuillez entrer le mois actuel:               ");
            mDel = leScanner.nextInt();
        }
    catch (InputMismatchException e) {
            setGiveMonth();
        }

    leScanner.close();
    return mDel;
    }


public int setGiveYear() {
    Scanner leScanner = new Scanner(System.in);
    int aDel =0;
    try {
            System.out.print("Veuillez entrer l'annee actuelle:             ");
            aDel = leScanner.nextInt();
        }
    catch (InputMismatchException e) {
            setGiveYear();
        }
    
    leScanner.close();
    return aDel;
    }
}
