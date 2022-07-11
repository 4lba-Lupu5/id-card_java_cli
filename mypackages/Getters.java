package mypackages;

import java.time.LocalDate;

    public class Getters {
    
        public String toNormalDateString(LocalDate initialDate){


            String normal = (String.valueOf(initialDate.getDayOfMonth()) 
            + "/" + String.valueOf(initialDate.getMonthValue() 
            + "/" + String.valueOf(initialDate.getYear())));

            return normal;
        }
    }
