import java.text.DecimalFormat;

/**
 * This Athlete program is to accept three arguments: athlete name, the sport name 
*  that that athlete plays, and the nationality of that athlete.  Its output format is "My 
*  favorite athlete is <athlete_name> who plays <sport_name> and has 
* nationality as <athlete_nationality>"
*
* Author: Surapat Pongsuwan
* ID: 623040147-4
* Sec: 2
* Date: December 12, 2019
*
**/


package pongsuwan.surapat.lab2 ;

import java.text.DecimalFormat ;

public class Calculator {
    public static void main(String[] args) {
        String oper = args[0].toLowerCase() ;        
        
        if (oper.equals("q")) {
            System.out.println("Quitting the program") ; 
            System.exit(0);
        }


        Double num1 = Double.parseDouble(args[1]) ;
        Double num2 = Double.parseDouble(args[2]) ;

        DecimalFormat df = new DecimalFormat("#0.0") ;
        DecimalFormat df_2point = new DecimalFormat("#0.00") ;

        Double result = 0.00 ;
       

        
            if (oper.equals("+")) {
                result = num1 + num2 ;
            }

            else if (oper.equals("-")) {
                result = num1 - num2 ;
            }

            else if (oper.equals("*")) {
                result = num1 * num2 ;
            }

            else if (oper.equals("/")) {
                
                if (num2.equals(0.0)) {
                    System.out.println("The sencond operand cannot be zero") ;
                    System.exit(0);
                }
                else  {
                    result = num1 / num2 ;
                }
                
            }

            System.out.println(df.format(num1) + " " + oper + " " + df.format(num2) + " " + "=" + " " + df_2point.format(result) ) ;
        
            
        }
    }
