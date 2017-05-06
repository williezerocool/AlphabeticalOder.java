/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alphabeticalorder;
import java.util.Scanner;
/**
 *
 * @author kendrabooker
 */
public class AlphabeticalOrder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        String userInput;
        
        System.out.print("Whats your last name? ");
        userInput = keyboard.next();
        
        if(userInput.compareTo("a") <= 2){
            System.out.println("you dont have to wait long");
        }else if(userInput.compareTo("a") <= 9 && userInput.compareTo("a") >= 3){
             System.out.println("thats not that bad");
        }else if(userInput.compareTo("a") <= 18 && userInput.compareTo("a") >= 10){
             System.out.println("look like a bit of a wait");
        }else if(userInput.compareTo("a") <= 24 && userInput.compareTo("a") >= 19){
             System.out.println("it's gonna be a while");
        }else{
            System.out.println("not going anywhere for a while");
        }
    }
    
}
