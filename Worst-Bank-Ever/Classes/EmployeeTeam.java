import java.util.Scanner;

public class EmployeeTeam
{
    public static void main(String[] args) 
    {
    getLogin();
    
    
    }

    public static void getLogin()
    {

    String Username;
    String Password;

    Password = "456293";
    Username = "BankTeller";

    Scanner input1 = new Scanner(System.in);
    System.out.println("Enter Username : ");
    String username = input1.next();

    Scanner input2 = new Scanner(System.in);
    System.out.println("Enter Password : ");
    String password = input2.next();

    if (username.equals(Username) && password.equals(Password)) 
    {
        System.out.println("Access Granted! Welcome!");
        System.out.println();
        payRate();
    }

    else if (username.equals(Username)) 
    {
        System.out.println("Invalid Password!");
    } else if (password.equals(Password)) 
    {
        System.out.println("Invalid Username!");
    } else {
        System.out.println("Invalid Username & Password!");
    }

} 
  
    public static void payRate()
    {
     double pay = 0;
     final double PAY_RATE = 22.00; 
     double hours = 0; 
     Scanner input3 = new Scanner(System.in);
     System.out.println("Enter hours worked: "); 
     hours = input3.nextDouble();
     pay = ( hours * PAY_RATE ) ;
     System.out.println("Payrate: " + pay); 
     
    }
    
}
