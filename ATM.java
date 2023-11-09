import java.util.Scanner;  
   
class Atm
{  
      
    public static void main(String args[] )  
    {  
          
        int balance = 1000, withdraw, deposit;  
          
        
        Scanner sc = new Scanner(System.in);  
          
        while(true)  
        {  
            System.out.println("Automated Teller Machine:-");  
            System.out.println("Click on 1 for Withdraw");  
            System.out.println("Click on 2 for Deposit");  
            System.out.println("Click on 3 for Check Balance");  
            System.out.print("Choose the operation you want to perform:");  
              
            
            int choice = sc.nextInt();  
            switch(choice)  
            {  
                case 1:  
        System.out.print("Enter money to be WITHDRAWN:");  
                      
         
        withdraw = sc.nextInt();  
                      
       
        if(balance >= withdraw)  
        {  
             
            balance = balance - withdraw;  
            System.out.println("PLEASE COLLECT YOUR MONEY");  
        }  
        else  
        {  
              
            System.out.println("Insufficient Balance");  
        }  
        System.out.println("");  
        break;  
   
                case 2:  
                      
        System.out.print("Enter money to be DEPOSITED:");  
                      
         
        deposit = sc.nextInt();  
       
        balance = balance + deposit;  
        System.out.println("Your Money has been successfully DEPOSITED");  
        System.out.println("");  
        break;  
   
                case 3:  
          
        System.out.println("Balance : "+balance);  
        System.out.println("");  
    
            }  
        }  
    }  
}  