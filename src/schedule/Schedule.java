/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schedule;

/**
 *
 * @author 19079
 */
public class Schedule {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String firstName = "Kevin";
        String lastName = "Curbelo";
        int gradYear = 2019;
        
        System.out.println("My name is " + firstName + " " + lastName + " and I'll graduate in " + gradYear + ".");
        
        String course1 = "Precalculus Accelerated";
        String course2 = "AP Computer Science A";
        String course3 = "Honors Social Justice";
        String course4 = "Honors Microeconomics";
        String course5 = "Honors World War II";
        String course6 = "Honors English 12";
        String course7 = "Honors US Government";
        
        String teacher1 = "Mrs. Rams-Foyo";
        String teacher2 = "Mr. Larrubia";
        String teacher3 = "Mr. Davis";
        String teacher4 = "Mr. Ciocca";
        String teacher5 = "Mr. Trujillo";
        String teacher6 = "Mr. Linfors";
        String teacher7 = "Mrs. McCullagh";
        
        System.out.println("My current courses are:");
        System.out.println("+--------------------------------------------------+");
        System.out.println("| # |           Course           |     Teacher     |");
        System.out.println("|--------------------------------------------------|");
        System.out.println("| 1 | " + course1 + "    |  " + teacher1 + " |");
        System.out.println("| 2 | " + course2 + "      |    " + teacher2 + " |");
        System.out.println("| 3 | " + course3 + "      |       " + teacher3 + " |");
        System.out.println("| 4 | " + course4 + "      |      " + teacher4 + " | ");
        System.out.println("| 5 | " + course5 + "        |    " + teacher5 + " |");
        System.out.println("| 6 | " + course6 + "          |     " + teacher6 + " |");
        System.out.println("| 7 | " + course7 + "       |  " + teacher7 + " |");
        System.out.println("+--------------------------------------------------+");
    }
    
}
