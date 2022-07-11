package mypackages;
    import java.util.Scanner;
    import java.util.InputMismatchException;
    import java.time.LocalDate;
    
    
    public class Setters {

    
        public  String setString(String value){

            String text;
            Scanner sc = new Scanner(System.in);
            System.out.print("Veuillez entrer " + value + " : ");
            text = sc.nextLine();
            return text;
        }

        public  int setInt(String value) {


            boolean test = true;
            int number = 0;
            Scanner sc = new Scanner(System.in);
            System.out.print("Veuillez entrer " + value + " : ");
            while (test) {
                if (sc.hasNextInt()) {
                    number = sc.nextInt();
                }
                else {
                    sc.next();
                    continue;
                }
                test = false;
            }
            return number;
            

        public  LocalDate setToday() {
            
            LocalDate today = LocalDate.now();
            return today;
        }

        public  LocalDate setDate(String value) {


            System.out.println("**Recuperation de la date " + value + ".**");
            int day = setInt("le jour");
            int month = setInt("le mois");
            int year = setInt("l'annee");
            LocalDate date = LocalDate.of(year, month, day);
            //System.out.println("La date de " + value + " est : " + date);
            return date;
        }

    }
