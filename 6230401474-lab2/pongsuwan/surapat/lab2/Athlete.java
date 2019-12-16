/**
 * This Athlete program is to accept three arguments: athlete name, the sport name 
*  that that athlete plays, and the nationality of that athlete.  Its output format is "My 
*  favorite athlete is <athlete_name> who plays <sport_name> and has 
* nationality as <athlete_nationality>"  
*
* Author: Manee Jaidee
* ID: 623040123-4
* Sec: 1
* Date: December 12, 2019
*
**/


package pongsuwan.surapat.lab2 ;

public class Athlete {
    
    public static void main(String[] args) {

        if (args.length != 3) {
            System.out.println("Athlete <athlete name> <sport name> <nationality>") ;
            System.exit(0) ;
        }   

        String name = args[0] ;
        String sport = args[1] ;
        String nation = args[2] ;

         
        System.out.println("My favorite athlete is " + name + " who plays " + sport + " and has nationality as " + nation) ;
         }
    }
