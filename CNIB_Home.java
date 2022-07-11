import mypackages.CNIB_Design;
import mypackages.CNIB_Back;


public class CNIB_Home {


    public static void main(String[] args) {

        CNIB_Back CB = new CNIB_Back();       
        
        String name = CB.setName();
        String surname = CB.setSurname();
        String place = CB.setBirthPlace();
        String sex = CB.setSex();
        String job = CB.setJob();
        int heigth = CB.setHeigth();
        int birthD = CB.setBirthDay();
        int birthM = CB.setBirthMonth();
        int birthY = CB.setBirthYear();
        int delD = CB.setGiveDay();
        int delM = CB.setGiveMonth();
        int delY = CB.setGiveYear();


        CNIB_Design someone = new CNIB_Design(name, surname, place, sex, job, 
        heigth, birthD, birthM, birthY, delD, delM, delY);
    }
}
