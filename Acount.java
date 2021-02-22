import java.util.Scanner;

public class Acount
{
    int balance;
    String prevTrans;
    String cName;
    String CID; 
    int amount;
   
    Acount(String CusName, String CusID){
        cName = CusName;
        CID = CusID; 
    }

    void deposit(int depn) {
        if(depn >=0)
        {
        balance+=depn; 
        prevTrans = "You previously deposited $" + depn+"." ;
        }
        
    }

    void withdrawl(int wd){
        if(balance != 0 && wd<=balance && wd>=0)
        {
            balance-= wd; 
        }
        else
        {
            System.out.println("You can not withdraw this much money.");
        }
        prevTrans = "You previously withdrew $" + wd +".";
 
    }
    String getPrevTrans(){
        return prevTrans; 
    }


    void showMenu(){
        char option = '\0';
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello " + cName);
        System.out.println("Press the key to do the action you wish:");
        System.out.println("a. Check your Balance");
        System.out.println("b. Make a Deposit");
        System.out.println("c. Make a Withdrawl");
        System.out.println("d. View your previous transaciton.");
        System.out.println("F. Exit.");
        do{
            System.out.println("");
            System.out.println("Enter an option: ");
            char option1 = scanner.next().charAt(0); 
            option = Character.toUpperCase(option1); 
            System.out.println("");
            switch(option)
            {
                case 'A':
                System.out.println("$ " + balance);
                break; 
                
                case 'B':
                System.out.println("Please enter your deposit number: ");
                amount = scanner.nextInt();
                deposit(amount);
                System.out.println("Thank you!");
                break; 

                case 'C':
                System.out.println("Please enter your withdrawl number: ");
                amount = scanner.nextInt();
                withdrawl(amount);
                System.out.println("Thank you!");
                break; 

                case 'D':
                System.out.println(getPrevTrans());
                break; 

                case 'F':
                System.out.println("");
                break; 




            }

            




            

            

        }
            while(option != 'F'); 
            System.out.println("Thank you for banking with us!");

            scanner.close();
    }
}