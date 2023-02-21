/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexam_versiona_extensioncode;

/**
 *
 * @author Stephanie
 */
import java.util.Scanner;
public class TestUserprofile {
        public static void main(String[] args) throws Exception {

       //Create Scanner object to get input data from the users typing
        Scanner sc = new Scanner(System.in);
        
    String userID;//the userID
    String genre;// the user's preferred genre of movie
    String[] genres;//available genres of movies
   while (true) {
     System.out.println("Please type your username:");
    userID =sc.next();
    
    System.out.println("Please type your favorite genre from this list \n \"Comedy\", \"Drama\", \"Action\", \"Mystery\":");
    genre =sc.next();
   
    
    System.out.println("Like to register next user: 0 to stop 1 to continue");
    int next = sc.nextInt();
    if (next == 0) break;
    } // End of the continuation loop
    sc.close();}  
}