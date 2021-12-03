/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calendar;

/**
 *
 * @author daniel
 */
public class Calendar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int y = 2022; //tahun
        int startDayofMonth = 5;
        int spaces = startDayofMonth;
        
        //months[i] = name of month i
        String[] months = {
            "",                         // leave empty so that we start with months[i] = "January"
            "January", "February", "March",
            "April", "May", "June",
            "July", "Agust", "September",
            "October", "November", "December"
        };
        
        //days[i] = number of days in month i
        int[] days = {
            0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
        };
        
        for(int m = 1; m <= 12; m++){
            //check for leap year
            if((((y%4==0) && (y%100!=0)) || (y%400==0)) && m == 2)
                days[m] = 29;
            
            //print calendar header
            //display the month and year
            System.out.println("        " + months[m] + " " + y);
            
            //display the lines
            System.out.println("_______________________________");
            System.out.println("    Sun Mon Tue Wed Thu Fri Sat");
            
            //space required
            spaces = (days[m-1] + spaces)%7;
            
            //print calendar
            for(int i = 0; i < spaces; i++)
                System.out.println("    ");
            for(int i = 1; i <= days[m]; i++){
                System.out.printf(" %3d ", i);
                if(((i+spaces) % 7 == 0) || (i == days[m])) System.out.println();
            }
            System.out.println();
        }
    }
    
}
