/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 */
package ca.sheridancollege.project;

import java.util.Scanner; 

public class Game {
    
    public static int autoGenerate(int randomCards) { 
        
        int maxedOut = 6; 
        
        int minedOut = 1; 
        
        int result = (maxedOut - minedOut)+1; 
       
        
         randomCards = (int)(Math.random()*result);
         
         if (randomCards == 0) {
             randomCards = 1; 
         }
          
          return randomCards; 
    } 
    
    public static void main(String[] args) {
          Scanner theUser = new Scanner(System.in); 
        int randomCards = 0; 
        int add = +autoGenerate(randomCards); 
          System.out.println(+add);
        System.out.println("Continue? You currently have: "+add);
          String userAnswer = theUser.nextLine();
          
           if (userAnswer.equals("yes")) {
              int add2 = +autoGenerate(randomCards); 
              int total = add+add2; 
              if (total < 21) {
               System.out.println("Continue? You currently have: "+total);
                userAnswer = theUser.nextLine();
           
             if (userAnswer.equals("yes")) {
              int add3 = +autoGenerate(randomCards); 
               int total2 = add+add2+add3; 
                if (total2 < 21) {
                System.out.println("Continue? You currently have: "+total2);
                           userAnswer = theUser.nextLine();
                }
                
                else if (total2 > 21) {
               System.out.println("You lose! Your Value: "+add+add2+add3);
                }
                
                 if (userAnswer.equals("yes")) {
              int add4 = +autoGenerate(randomCards); 
               int total3 = add+add2+add3+add4; 
                if (total3 < 21) {
                System.out.println("Continue? You currently have: "+total3);
                           userAnswer = theUser.nextLine();
                }
                
                else if (total3 > 21) {
               System.out.println("You lose! Your Value: "+add+add2+add3+add4);
                }
                 
                  if (userAnswer.equals("yes")) {
              int add5 = +autoGenerate(randomCards); 
               int total4 = add+add2+add3+add4+add5; 
                if (total4 < 21) {
                System.out.println("Continue? You currently have: "+total4);
                           userAnswer = theUser.nextLine();
                }
                
                else if (total4 > 21) {
               System.out.println("You lose! Your Value: "+add+add2+add3+add4);
                }
                 
                  if (userAnswer.equals("yes")) {
              int add6 = +autoGenerate(randomCards); 
               int total5 = add+add2+add3+add4+add5+add6; 
                if (total5 < 21) {
                System.out.println("Continue? You currently have: "+total5);
                           userAnswer = theUser.nextLine();
                           
                }
                else if (total5 > 21) {
               System.out.println("You lose! Your Value: "+add+add2+add3+add4+add5);
                }
                 
                 if (userAnswer.equals("yes")) {
              int add7 = +autoGenerate(randomCards); 
               int total6 = add+add2+add3+add4+add5+add6+add7; 
                if (total6 < 21) {
                System.out.println("Continue? You currently have: "+total6);
                           userAnswer = theUser.nextLine();
                }
                
                else if (total6 > 21) {
               System.out.println("You lose! Your Value: "+add+add2+add3+add4+add5+add6+add7);
                }
                
                if (userAnswer.equals("yes")) {
              int add8 = +autoGenerate(randomCards); 
               int total7 = add+add2+add3+add4+add5+add6+add7+add8; 
                if (total7 < 21) {
                System.out.println("Continue? You currently have: "+total7);
                           userAnswer = theUser.nextLine();
                }
                
                else if (total7 > 21) {
               System.out.println("You lose! Your Value: "+total7);
                }
                 
                 if (userAnswer.equals("yes")) {
              int add9 = +autoGenerate(randomCards); 
               int total8 = add+add2+add3+add4+add5+add6+add7+add8+add9; 
                if (total8 < 21) {
                System.out.println("Continue? You currently have: "+total8);
                           userAnswer = theUser.nextLine();
                }
                
                else if (total8 > 21) {
               System.out.println("You lose! Your Value: "+total8);
                }
                 
             }
             }
           }
             
             
             else {
               System.out.println("Thank you For Playing!");
       }
     
       }
    }
}
}
}
}
}
}