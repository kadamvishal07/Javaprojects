
import java.util.Scanner;

public class Testing1 {

    float deposit;
    float withdraw;
    float amount;
    float remaining;
    void deposit(){
        
        Scanner am = new Scanner(System.in);
        System.out.println("Enter initial deposit");
        amount = am.nextFloat();
        
        
        Scanner d1 = new Scanner(System.in);
        System.out.println("Enter amount to deposit");
        deposit = d1.nextFloat();
        
        amount = amount + deposit;
        System.out.println("Present Balance "+amount);
    }
    
    void withdraw(){
        
        Scanner wd = new Scanner(System.in);
        System.out.println("Enter amount to withdraw");
        withdraw = wd.nextFloat();
        
        if (amount < withdraw){
            System.out.println("Insufficient Balance");
        }else{
            remaining = amount - withdraw;
            System.out.println("Remaining amount" +remaining);
        }
    }
    
    void displayBalance(){
        
    }
    
    public static void main(String[] args) {
                
        Testing1 b1 = new Testing1();
        b1.deposit();
        b1.withdraw();
        
        
    }
    
}