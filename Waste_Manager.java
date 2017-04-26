package waste_manager;
import java.util.Scanner;

/**
 * @Author Jonathan Wu
 * @Author Rajendra Bhagroo
 * @Class  CSCI 260 - W01
 * @Date   4/15/17
 */

public class Waste_Manager 
{
    
    
    public static void main(String[] args) 
    {
        
       //Creating BST
       BST menu = new BST();
       create_Menu(menu);
       
       System.out.println("Who Is Ordering?");
       
       //Initialize array options
       String[][] customer = new String[2][3];      
       fill_Array(customer);
       
       //Display array row1 (Names)
       System.out.println("1 : " + customer[0][0]
                                 + "\n2 : " + customer[0][1]
                                 + "\n3 : " + customer[0][2]);
       
       Scanner keyboard = new Scanner(System.in);
       
       
       switch(keyboard.nextInt())
               {
                   //Jim
                   case 1:
                       System.out.println("\nHello " + customer[0][0] 
                               + "!" +
                               " How much money are you willing to spend"
                               + " today?"
                               + " Value can range from: $" 
                               + menu.display_First(menu.get_Root())
                               + " - $" 
                               + menu.display_Last(menu.get_Root()));
                               //Function will pull root out of tree
                       int key = keyboard.nextInt();
                       
                           menu_Search( menu , key , customer );   
                           break;
                    
                   //Tom    
                   case 2:
                       System.out.println("\nHello " + customer[0][1] 
                               + "!" +
                               " How much money are you willing to spend"
                               + " today?");
                       break;
                       
                   //Lucy    
                   case 3:
                       System.out.println("\nHello " + customer[0][2]  
                               + "!" +
                               " How much money are you willing to spend"
                               + " today?");
                       break;
                       
                   default: 
                       System.out.println("Please enter a numeric value of "
                               + "1 , 2 , 3" + " \nRe-run Program");
                       break;
                   
               }
       

    }
    

     public static void fill_Array(String[][] customer)
    {
       //Names are in row 1
       customer[0][0] = "Jim";
       customer[0][1] = "Tom";
       customer[0][2] = "Lucy";
       
       //Criteria of Wastefulness in row 2
       customer[1][0] = "Wasteful";
       customer[1][1] = "Moderatly Wasteful";
       customer[1][2] = "Not Wasteful";
    }
     
    //FOOD NAMES + PRICES
    public static void create_Menu(BST menu)
    {   
        
        //STEAKS
        menu.insert("Ribeye 8 oz", 12);
        menu.insert("T-bone 10 oz", 14);
        menu.insert("Strip 12 oz", 16);
        menu.insert("Beef Tenderloin 14 oz", 18);
       
        //LOBSTERS
        menu.insert("Maine 16 oz", 20);
        menu.insert("Langostino 20 oz", 24);
        menu.insert("Wood-Grilled 24 oz", 28);
        menu.insert("Seaport 32 oz", 36);
        
        //FISH
        menu.insert("Bass 32 oz", 36);
        menu.insert("Cod  40 oz", 44);
        menu.insert("Trout 48 oz", 52);
        menu.insert("Salmon 56 oz", 60);
        
        //SIDES
        menu.insert("Rice 3 oz", 7);
        menu.insert("Fresh Vegetables 5 oz", 9);
        menu.insert("Fresh Fruits 6 oz", 10);
        menu.insert("Swallow's Nest 60 oz", 64);  
        
        //MID value is 19  
    }
    
    public static void menu_Search(BST menu, int value, String[][] customer)
    {
        System.out.println("\nSearching menu for foods around pricepoint: $" 
                            + value);
        
            menu.search(value);
            menu.inorder();        
        
        //If Jim && Wasteful
        if( customer[0][0].equalsIgnoreCase(customer[1][0]) )
        {

        }
        
        //If Tom && Moderatly Wasteful
        else if ( customer[0][1].equalsIgnoreCase(customer[1][1]))
        {
            
        }
        
        //If Lucy && Not Wasteful
        else if (  customer[0][2].equalsIgnoreCase(customer[1][2])  )
        {
            
        }
        
        //Wrong Input
        else
        {
            
        }

        //INCLUDE MIN PRICE AND MAX PRICE BEFORE CUSTOMER ENTERS KEY
        
        //Search method works !
        //Only finds 1 food, I want it to find every food that is <= to the
        //price given
        //Then, we create a Stack, and push all of those food items onto stack, 
        //and "POP" the values
        // To the customers screen, and say..."These are our recommendations..."
        
        //NEED TO USE CRITERIA OF WASTEFULLNESS TO DETEMRINE (CONDITIONAL)
        //IF <= to PRICE or > PRICE
        
        // ^ CHANGE SEARCH ALGORITHM TO INCLUDE DUPLICATES ^
    }
    
}